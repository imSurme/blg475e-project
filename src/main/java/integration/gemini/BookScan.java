package integration.gemini;

import java.util.*;
import java.lang.*;

public class BookScan {

    /**
     * Find how many times a given substring can be found in the original string. Count overlapping cases.
     */
    public int howManyTimes(String string, String substring) {
        if (string == null || substring == null || substring.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i <= string.length() - substring.length(); i++) {
            if (string.substring(i, i + substring.length()).equals(substring)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Return length of given string
     */
    public int strlen(String string) {
        if (string == null) {
            return 0;
        }
        return string.length();
    }

    /**
     * For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
     */
    public String flipCase(String string) {
        if (string == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(string.length());
        for (char c : string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static class ScanResult {
        private final int totalOccurrences;
        private final List<Integer> lineNumbers;

        public ScanResult(int totalOccurrences, List<Integer> lineNumbers) {
            this.totalOccurrences = totalOccurrences;
            this.lineNumbers = lineNumbers;
        }

        public int getTotalOccurrences() {
            return totalOccurrences;
        }

        public List<Integer> getLineNumbers() {
            return lineNumbers;
        }
    }

    /**
     * Scans a multi-line text to find how many times words of a target length appear
     * and on which lines, utilizing the integrated logic methods.
     */
    public ScanResult scan(String text, int targetWordLength) {
        int totalWordsCount = 0;
        List<Integer> linesWithMatches = new ArrayList<>();

        if (text == null || text.isEmpty()) {
            return new ScanResult(totalWordsCount, linesWithMatches);
        }

        String[] lines = text.split("\r?\n");

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];

            String flippedLine = flipCase(line);

            String cleanLine = flippedLine.replaceAll("[^a-zA-Z0-9]+", " ");
            String[] words = cleanLine.trim().split("\\s+");

            Set<String> uniqueTargetWords = new HashSet<>();
            for (String word : words) {
                if (word.isEmpty()) {
                    continue;
                }

                if (strlen(word) == targetWordLength) {
                    uniqueTargetWords.add(word);
                }
            }

            int occurrencesInLine = 0;
            String paddedLine = " " + cleanLine + " ";

            for (String target : uniqueTargetWords) {
                String paddedTarget = " " + target + " ";
                occurrencesInLine += howManyTimes(paddedLine, paddedTarget);
            }

            if (occurrencesInLine > 0) {
                totalWordsCount += occurrencesInLine;
                linesWithMatches.add(i + 1);
            }
        }

        return new ScanResult(totalWordsCount, linesWithMatches);
    }
}
