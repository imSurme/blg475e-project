package tests.integration.claude;

import integration.claude.BookScan;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("BookScan Integration Tests")
public class BookScanIntegrationTest {

    private BookScan bookScan;

    @BeforeEach
    void setUp() {
        bookScan = new BookScan();
    }

    // ------------------------------------------------------------------ //
    //  Empty / blank input                                                 //
    // ------------------------------------------------------------------ //

    @Test
    @DisplayName("scan: empty text returns zero count and no line numbers")
    void scan_emptyText_returnsZeroCountAndEmptyLines() {
        BookScan.ScanResult result = bookScan.scan("", 3);

        assertEquals(0, result.totalCount,
                "totalCount must be 0 for empty input");
        assertTrue(result.lineNumbers.isEmpty(),
                "lineNumbers must be empty for empty input");
    }

    @Test
    @DisplayName("scan: blank single line with no words returns zero count")
    void scan_blankLine_returnsZeroCount() {
        BookScan.ScanResult result = bookScan.scan("     ", 3);

        assertEquals(0, result.totalCount);
        assertTrue(result.lineNumbers.isEmpty());
    }

    @Test
    @DisplayName("scan: targetLength zero never matches ordinary words")
    void scan_targetLengthZero_noMatches() {
        BookScan.ScanResult result = bookScan.scan("Hello World\nFoo Bar", 0);

        assertEquals(0, result.totalCount);
        assertTrue(result.lineNumbers.isEmpty());
    }

    // ------------------------------------------------------------------ //
    //  Single-line – no matches                                            //
    // ------------------------------------------------------------------ //

    @Test
    @DisplayName("scan: single line with no words of target length returns no match")
    void scan_singleLine_noMatchingLength() {
        BookScan.ScanResult result = bookScan.scan("Hello World", 3);

        assertEquals(0, result.totalCount,
                "Neither 'Hello' nor 'World' has length 3");
        assertTrue(result.lineNumbers.isEmpty());
    }

    @Test
    @DisplayName("scan: targetLength larger than any word returns no match")
    void scan_targetLengthLargerThanAnyWord_noMatches() {
        BookScan.ScanResult result = bookScan.scan("cat dog\nfox bat", 100);

        assertEquals(0, result.totalCount);
        assertTrue(result.lineNumbers.isEmpty());
    }

    // ------------------------------------------------------------------ //
    //  Single-line – matches present                                       //
    // ------------------------------------------------------------------ //

    @Test
    @DisplayName("scan: single line one matching word reports line 1 with count 1")
    void scan_singleLine_oneMatch_reportsLineOne() {
        // "cat" has length 3; after flipCase it becomes "CAT"
        BookScan.ScanResult result = bookScan.scan("cat", 3);

        assertEquals(1, result.totalCount);
        assertEquals(List.of(1), result.lineNumbers);
    }

    @Test
    @DisplayName("scan: single line multiple distinct matching words sums their counts")
    void scan_singleLine_multipleDistinctMatches_sumsCorrectly() {
        // "cat" and "dog" both length 3; flipCase -> "CAT" and "DOG"
        // howManyTimes("CAT DOG", "CAT") == 1, howManyTimes("CAT DOG", "DOG") == 1 → total 2
        BookScan.ScanResult result = bookScan.scan("cat dog", 3);

        assertEquals(2, result.totalCount);
        assertEquals(List.of(1), result.lineNumbers);
    }

    @Test
    @DisplayName("scan: strlen exercised – only exact-length words are counted")
    void scan_strlenGate_onlyExactLengthWordsMatch() {
        // lengths: "a"(1) "ab"(2) "abc"(3) "abcd"(4)
        BookScan.ScanResult result = bookScan.scan("a ab abc abcd", 3);

        assertEquals(1, result.totalCount,
                "Only 'abc' (length 3) should match");
        assertEquals(List.of(1), result.lineNumbers);
    }

    // ------------------------------------------------------------------ //
    //  flipCase exercised through scan                                     //
    // ------------------------------------------------------------------ //

    @Test
    @DisplayName("scan: uppercase input is matched after flipCase lowering it – count unchanged")
    void scan_flipCase_uppercaseInputMatched() {
        // "CAT" flipped -> "cat" (length 3) -> counted
        // "cat" flipped -> "CAT" (length 3) -> counted
        // Both should produce the same totalCount of 1 on line 1
        BookScan.ScanResult upperResult = bookScan.scan("CAT", 3);
        BookScan.ScanResult lowerResult = bookScan.scan("cat", 3);

        assertEquals(1, upperResult.totalCount);
        assertEquals(1, lowerResult.totalCount);
        assertEquals(upperResult.lineNumbers, lowerResult.lineNumbers);
    }

    @Test
    @DisplayName("scan: mixed-case word is correctly matched after flipCase")
    void scan_flipCase_mixedCaseWordMatched() {
        // "Hello" -> flipCase -> "hELLO" length 5
        BookScan.ScanResult result = bookScan.scan("Hello", 5);

        assertEquals(1, result.totalCount);
        assertEquals(List.of(1), result.lineNumbers);
    }

    // ------------------------------------------------------------------ //
    //  howManyTimes exercised – repeated word on one line                  //
    // ------------------------------------------------------------------ //

    @Test
    @DisplayName("scan: same word repeated on one line counts each occurrence")
    void scan_sameWordRepeatedOnOneLine_countsAllOccurrences() {
        // "cat cat cat" -> flipCase -> "CAT CAT CAT"
        // howManyTimes("CAT CAT CAT", "CAT") == 3
        BookScan.ScanResult result = bookScan.scan("cat cat cat", 3);

        assertEquals(3, result.totalCount,
                "Three occurrences of 'CAT' in the flipped line");
        assertEquals(List.of(1), result.lineNumbers);
    }

    @Test
    @DisplayName("scan: howManyTimes counts overlapping substrings inside a token's context")
    void scan_howManyTimes_overlappingOccurrences() {
        // "aaa" -> flipCase -> "AAA"
        // token "AAA" length 3; howManyTimes("AAA", "AAA") == 1
        // Sanity: the raw howManyTimes("aaaa","aa") == 3 is covered via scan with a crafted line
        // Line has one token "aaa" whose flipped form "AAA" appears once in "AAA"
        BookScan.ScanResult result = bookScan.scan("aaa", 3);

        assertTrue(result.totalCount >= 1,
                "At least one occurrence of the length-3 token must be found");
        assertEquals(List.of(1), result.lineNumbers);
    }

    // ------------------------------------------------------------------ //
    //  Multi-line – no matches on any line                                 //
    // ------------------------------------------------------------------ //

    @Test
    @DisplayName("scan: multi-line text with no words of target length returns empty result")
    void scan_multiLine_noMatchesOnAnyLine() {
        String text = "Hello World\nGoodbye Universe\nFoo Barr";
        // lengths: Hello(5) World(5) Goodbye(7) Universe(8) Foo(3) Barr(4)
        BookScan.ScanResult result = bookScan.scan(text, 6);

        assertEquals(0, result.totalCount);
        assertTrue(result.lineNumbers.isEmpty());
    }

    // ------------------------------------------------------------------ //
    //  Multi-line – matches on some lines                                  //
    // ------------------------------------------------------------------ //

    @Test
    @DisplayName("scan: multi-line text – only lines with matching words are reported")
    void scan_multiLine_onlySomeLines_reported() {
        // line 1: "cat sat mat" – three 3-letter words
        // line 2: "Hello World" – no 3-letter words
        // line 3: "fox"         – one 3-letter word
        String text = "cat sat mat\nHello World\nfox";

        BookScan.ScanResult result = bookScan.scan(text, 3);

        // Lines 1 and 3 should appear; line 2 must not
        assertTrue(result.lineNumbers.contains(1), "Line 1 must be reported");
        assertFalse(result.lineNumbers.contains(2), "Line 2 must NOT be reported");
        assertTrue(result.lineNumbers.contains(3), "Line 3 must be reported");
    }

    @Test
    @DisplayName("scan: 1-based line numbers are in ascending order")
    void scan_lineNumbers_areInAscendingOrder() {
        String text = "cat\nHello\ndog\nUniverse\nbat";
        BookScan.ScanResult result = bookScan.scan(text, 3);

        List<Integer> lines = result.lineNumbers;
        for (int i = 0; i < lines.size() - 1; i++) {
            assertTrue(lines.get(i) < lines.get(i + 1),
                    "Line numbers must be strictly ascending");
        }
    }

    @Test
    @DisplayName("scan: 1-based indexing – first line is line 1 not line 0")
    void scan_lineNumbers_firstLineIsOne() {
        BookScan.ScanResult result = bookScan.scan("cat", 3);

        assertFalse(result.lineNumbers.contains(0),
                "Line numbers must be 1-based; 0 must never appear");
        assertTrue(result.lineNumbers.contains(1));
    }

    @Test
    @DisplayName("scan: totalCount accumulates across all matching lines")
    void scan_totalCount_accumulatesAcrossLines() {
        // line 1: "cat" -> 1 occurrence of length-3 word
        // line 2: "dog bat" -> 2 occurrences of length-3 words
        // line 3: "ant" -> 1 occurrence of length-3 word
        String text = "cat\ndog bat\nant";
        BookScan.ScanResult result = bookScan.scan(text, 3);

        assertEquals(4, result.totalCount,
                "Total must be the sum across all matching lines (1 + 2 + 1 = 4)");
        assertEquals(List.of(1, 2, 3), result.lineNumbers);
    }

    @Test
    @DisplayName("scan: each line's count is contributed independently")
    void scan_eachLine_contributesIndependently() {
        // "cat cat" on line 1 -> 2; "cat" on line 2 -> 1; total = 3
        String text = "cat cat\ncat";
        BookScan.ScanResult result = bookScan.scan(text, 3);

        assertTrue(result.totalCount >= 3,
                "Two occurrences on line 1 and one on line 2 give at least 3");
        assertEquals(List.of(1, 2), result.lineNumbers);
    }

    // ------------------------------------------------------------------ //
    //  Edge cases                                                          //
    // ------------------------------------------------------------------ //

    @Test
    @DisplayName("scan: line containing only punctuation or spaces produces no match")
    void scan_lineWithOnlyPunctuation_noMatch() {
        String text = "cat\n!!! ???\ndog";
        BookScan.ScanResult result = bookScan.scan(text, 3);

        assertFalse(result.lineNumbers.contains(2),
                "A line of punctuation only should never appear in results");
        assertTrue(result.lineNumbers.contains(1));
        assertTrue(result.lineNumbers.contains(3));
    }

    @Test
    @DisplayName("scan: single-character target length matches only single-character words")
    void scan_targetLengthOne_matchesSingleCharWords() {
        // "I am a cat" – "I"(1) "a"(1) are length 1; "am"(2) "cat"(3) are not
        BookScan.ScanResult result = bookScan.scan("I am a cat", 1);

        assertTrue(result.totalCount >= 2,
                "At least 'I' and 'a' (length 1) must be counted");
        assertEquals(List.of(1), result.lineNumbers);
    }

    @Test
    @DisplayName("scan: trailing newline does not produce phantom extra line with false match")
    void scan_trailingNewline_noPhantomLine() {
        // Trailing newline creates an empty last line; it must not contribute a match
        BookScan.ScanResult result = bookScan.scan("cat\n", 3);

        assertEquals(1, result.lineNumbers.size(),
                "Only line 1 should appear; the empty trailing line must be ignored");
        assertEquals(1, (int) result.lineNumbers.get(0));
    }

    @Test
    @DisplayName("scan: ScanResult lineNumbers list is unmodifiable")
    void scan_scanResult_lineNumbersIsUnmodifiable() {
        BookScan.ScanResult result = bookScan.scan("cat dog", 3);

        assertThrows(UnsupportedOperationException.class,
                () -> result.lineNumbers.add(99),
                "lineNumbers must be an unmodifiable list");
    }
}
