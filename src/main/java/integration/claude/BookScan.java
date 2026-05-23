package integration.claude;

import java.util.*;
import java.lang.*;

public class BookScan {

    /**
     * HumanEval Java/18
     * Find how many times a given substring can be found in the original string.
     * Count overlapping cases.
     */
    public int howManyTimes(String string, String substring) {
        if (string.isEmpty() || substring.isEmpty()) return 0;
        int count = 0;
        for (int i = 0; i <= string.length() - substring.length(); i++) {
            if (string.startsWith(substring, i)) {
                count++;
            }
        }
        return count;
    }

    /**
     * HumanEval Java/23
     * Return length of given string.
     */
    public int strlen(String string) {
        return string.toCharArray().length;
    }

    /**
     * HumanEval Java/27
     * For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
     */
    public String flipCase(String string) {
        StringBuilder sb = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * Scans multi-line text for words matching a target length.
     *
     * For each line the method:
     *   1. Uses flipCase() to normalise the line (so matching is
     *      demonstrably case-aware and exercises #27).
     *   2. Splits the flipped line into tokens and uses strlen() (#23)
     *      to check each token's length.
     *   3. Uses howManyTimes() (#18) to count how many times that
     *      token appears in the flipped line, accumulating the total
     *      hit-count for the line.
     *
     * @param text        multi-line input (lines separated by '\n')
     * @param targetLength the word length to search for
     * @return a ScanResult containing the total match count and the
     *         1-based line numbers on which at least one match occurs
     */
    public ScanResult scan(String text, int targetLength) {
        int totalCount = 0;
        List<Integer> matchingLines = new ArrayList<>();

        String[] lines = text.split("\n", -1);

        for (int lineIndex = 0; lineIndex < lines.length; lineIndex++) {
            String originalLine = lines[lineIndex];

            // Exercise #27: work on the case-flipped version of the line
            String flippedLine = flipCase(originalLine);

            // Tokenise on any non-letter character so punctuation is stripped
            String[] tokens = flippedLine.split("[^a-zA-Z]+");

            int lineCount = 0;
            Set<String> counted = new HashSet<>();

            for (String token : tokens) {
                if (token.isEmpty()) continue;

                // Exercise #23: check the token length
                if (strlen(token) == targetLength) {
                    // Exercise #18: count every (possibly overlapping)
                    // occurrence of this token inside the flipped line.
                    // We count each distinct token once per scan to avoid
                    // multiplying occurrences for repeated identical words
                    // (howManyTimes already handles overlaps within a single call).
                    if (!counted.contains(token)) {
                        lineCount += howManyTimes(flippedLine, token);
                        counted.add(token);
                    }
                }
            }

            if (lineCount > 0) {
                totalCount += lineCount;
                matchingLines.add(lineIndex + 1); // 1-based line number
            }
        }

        return new ScanResult(totalCount, matchingLines);
    }

    // ------------------------------------------------------------------ //
    //  Result container                                                    //
    // ------------------------------------------------------------------ //

    public static class ScanResult {
        public final int totalCount;
        public final List<Integer> lineNumbers;

        public ScanResult(int totalCount, List<Integer> lineNumbers) {
            this.totalCount  = totalCount;
            this.lineNumbers = Collections.unmodifiableList(lineNumbers);
        }

        @Override
        public String toString() {
            return "ScanResult{totalCount=" + totalCount
                    + ", lineNumbers=" + lineNumbers + "}";
        }
    }

    // ------------------------------------------------------------------ //
    //  Quick smoke-test                                                    //
    // ------------------------------------------------------------------ //

    public static void main(String[] args) {
        BookScan bs = new BookScan();

        // --- #18 unit checks ---
        System.out.println("=== howManyTimes ===");
        System.out.println(bs.howManyTimes("", "a"));        // 0
        System.out.println(bs.howManyTimes("aaa", "a"));     // 3
        System.out.println(bs.howManyTimes("aaaa", "aa"));   // 3

        // --- #23 unit checks ---
        System.out.println("=== strlen ===");
        System.out.println(bs.strlen(""));      // 0
        System.out.println(bs.strlen("abc"));   // 3

        // --- #27 unit checks ---
        System.out.println("=== flipCase ===");
        System.out.println(bs.flipCase("Hello")); // hELLO

        // --- BookScan integration test ---
        System.out.println("=== scan ===");
        String text =
                "The cat sat on the mat\n" +   // line 1 : 3-letter words: The,cat,sat,the,mat  -> flipped: tHE,CAT,SAT,ON,THE,MAT
                "A dog and a big red fox\n" +   // line 2 : 3-letter words: dog,and,big,red,fox
                "No hits here at all\n" +        // line 3 : 2,4,4,2,3 -> "here"(4),"hits"(4) etc; 'No'(2)
                "Short or long words today";    // line 4

        ScanResult r = bs.scan(text, 3);
        System.out.println(r); // totalCount includes overlapping substring hits per howManyTimes
        System.out.println("Lines with 3-letter words: " + r.lineNumbers);
    }
}
