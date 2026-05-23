package tests.integration.gemini;

import integration.gemini.BookScan;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BookScanIntegrationTest {

    @Test
    @DisplayName("Should return empty result when given text is empty or null")
    void scan_emptyText_returnsZeroCountAndEmptyLines() {
        BookScan scanner = new BookScan();
        
        BookScan.ScanResult emptyResult = scanner.scan("", 4);
        assertEquals(0, emptyResult.getTotalOccurrences(), "Total occurrences should be 0 for empty text");
        assertTrue(emptyResult.getLineNumbers().isEmpty(), "Line numbers should be empty for empty text");

        BookScan.ScanResult nullResult = scanner.scan(null, 4);
        assertEquals(0, nullResult.getTotalOccurrences(), "Total occurrences should be 0 for null text");
        assertTrue(nullResult.getLineNumbers().isEmpty(), "Line numbers should be empty for null text");
    }

    @Test
    @DisplayName("Should return zero counts when no words match the target length")
    void scan_singleLineNoMatches_returnsZero() {
        BookScan scanner = new BookScan();
        String text = "This is a simple test sequence";
        
        // No 5-letter words in the sequence
        BookScan.ScanResult result = scanner.scan(text, 5);
        
        assertEquals(0, result.getTotalOccurrences(), "Should find 0 occurrences of 5-letter words");
        assertTrue(result.getLineNumbers().isEmpty(), "Should return no line numbers");
    }

    @Test
    @DisplayName("Should correctly count same word repeated on a single line")
    void scan_singleLineRepeatedWords_countedCorrectly() {
        BookScan scanner = new BookScan();
        // "cat" x3 and "dog" x1 -> all are 3 letters.
        String text = "cat dog cat cat"; 
        
        BookScan.ScanResult result = scanner.scan(text, 3);
        
        assertEquals(4, result.getTotalOccurrences(), "Should find 4 occurrences of 3-letter words");
        assertEquals(Collections.singletonList(1), result.getLineNumbers(), "Matches should be found on line 1");
    }

    @Test
    @DisplayName("Should accurately count words across multiple lines and return 1-based line numbers")
    void scan_multipleLines_identifiesCorrectLinesAndCounts() {
        BookScan scanner = new BookScan();
        String text = 
                "The quick brown fox\n" +      // Line 1: The, fox (2 matches of length 3)
                "jumps over the lazy dog\n" +  // Line 2: the, dog (2 matches of length 3)
                "It is a sunny day\n" +        // Line 3: day (1 match of length 3)
                "Hello world";                 // Line 4: 0 matches of length 3
        
        BookScan.ScanResult result = scanner.scan(text, 3);
        
        assertEquals(5, result.getTotalOccurrences(), "Should find a total of 5 occurrences of 3-letter words");
        assertEquals(Arrays.asList(1, 2, 3), result.getLineNumbers(), "Matches should be found on lines 1, 2, and 3");
    }

    @Test
    @DisplayName("Should implicitly test flipCase, strlen, and howManyTimes logic handles punctuation appropriately")
    void scan_withPunctuationAndMixedCase_processesWordsCorrectly() {
        BookScan scanner = new BookScan();
        // Text tests punctuation stripping, varying casing (handled by flipCase implicitly),
        // word length extraction (strlen), and counting (howManyTimes).
        String text = 
                "Java! java, JAVA.\n" + // Line 1: 3 matches of length 4
                "Python is good\n" +    // Line 2: good (1 match of length 4)
                "C++ #java... %$";      // Line 3: C, java (1 match of length 4 because C++ strips to C)

        BookScan.ScanResult result = scanner.scan(text, 4);

        assertEquals(5, result.getTotalOccurrences(), "Should find 5 words of exactly 4 letters");
        assertEquals(Arrays.asList(1, 2, 3), result.getLineNumbers(), "Matches should be found on all three lines");
    }
}
