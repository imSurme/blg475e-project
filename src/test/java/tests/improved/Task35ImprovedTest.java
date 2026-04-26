package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task35ImprovedTest {

    // ==================== CONSTANTS TO FIX MAGIC NUMBER SMELL ====================
    

    // --- Positive Numbers ---
    private static final List<Integer> POSITIVE_NUMBERS = Arrays.asList(1, 2, 3, 4, 5);
    private static final int EXPECTED_MAX_POSITIVE = 5;

    // --- Negative Numbers ---
    private static final List<Integer> NEGATIVE_NUMBERS = Arrays.asList(-10, -5, -3, -20);
    private static final int EXPECTED_MAX_NEGATIVE = -3;

    // --- Single Element ---
    private static final List<Integer> SINGLE_ELEMENT = Arrays.asList(42);
    private static final int EXPECTED_MAX_SINGLE = 42;

    // --- Max At Beginning ---
    private static final List<Integer> MAX_AT_BEGINNING = Arrays.asList(100, 10, 20, 5);
    private static final int EXPECTED_MAX_BEGINNING = 100;

    // --- All Equal ---
    private static final List<Integer> ALL_EQUAL = Arrays.asList(7, 7, 7, 7);
    private static final int EXPECTED_MAX_EQUAL = 7;

    // --- Mixed Numbers ---
    private static final List<Integer> MIXED_NUMBERS = Arrays.asList(-5, 0, 15, -10, 8);
    private static final int EXPECTED_MAX_MIXED = 15;

    // --- Max Is Zero ---
    private static final List<Integer> MAX_IS_ZERO = Arrays.asList(-10, -5, 0, -2);
    private static final int EXPECTED_MAX_ZERO = 0;

    // ==================== GEMINI IMPROVED TESTS ====================

    @Test
    @DisplayName("Gemini: Should find max in positive numbers")
    void gemini_maxElement_positiveNumbers() {
        solutions.gemini.Task35 s = new solutions.gemini.Task35();
        assertEquals(EXPECTED_MAX_POSITIVE, s.maxElement(POSITIVE_NUMBERS),
                "Failed to find the maximum element in a positive number list");
    }

    @Test
    @DisplayName("Gemini: Should find max in negative numbers")
    void gemini_maxElement_negativeNumbers() {
        solutions.gemini.Task35 s = new solutions.gemini.Task35();
        assertEquals(EXPECTED_MAX_NEGATIVE, s.maxElement(NEGATIVE_NUMBERS),
                "Failed to find the maximum element in a negative number list");
    }

    @Test
    @DisplayName("Gemini: Should find max in a single element list")
    void gemini_maxElement_singleElement() {
        solutions.gemini.Task35 s = new solutions.gemini.Task35();
        assertEquals(EXPECTED_MAX_SINGLE, s.maxElement(SINGLE_ELEMENT),
                "Failed to find the maximum element in a single-element list");
    }

    // ==================== CLAUDE IMPROVED TESTS ====================

   @Test
    @DisplayName("Claude: maxElement should find max in ascending positive list")
    void claude_maxElement_positiveNumbers() {
        solutions.claude.Task35 s = new solutions.claude.Task35();
        assertEquals(EXPECTED_MAX_POSITIVE, s.maxElement(POSITIVE_NUMBERS),
            "Max of ascending list should be " + EXPECTED_MAX_POSITIVE);
    }

    @Test
    @DisplayName("Claude: maxElement should find max in all-negative list")
    void claude_maxElement_negativeNumbers() {
        solutions.claude.Task35 s = new solutions.claude.Task35();
        assertEquals(EXPECTED_MAX_NEGATIVE, s.maxElement(NEGATIVE_NUMBERS),
            "Max of negative list should be " + EXPECTED_MAX_NEGATIVE);
    }

    @Test
    @DisplayName("Claude: maxElement should return the only element for single-item list")
    void claude_maxElement_singleElement() {
        solutions.claude.Task35 s = new solutions.claude.Task35();
        assertEquals(EXPECTED_MAX_SINGLE, s.maxElement(SINGLE_ELEMENT),
            "Max of single-element list should be " + EXPECTED_MAX_SINGLE);
    }

    @Test
    @DisplayName("Claude: maxElement should find max when max is at the beginning")
    void claude_maxElement_maxAtBeginning() {
        solutions.claude.Task35 s = new solutions.claude.Task35();
        assertEquals(EXPECTED_MAX_BEGINNING, s.maxElement(MAX_AT_BEGINNING),
            "Max of descending list should be " + EXPECTED_MAX_BEGINNING);
    }

    @Test
    @DisplayName("Claude: maxElement should return the value when all elements are equal")
    void claude_maxElement_allEqual() {
        solutions.claude.Task35 s = new solutions.claude.Task35();
        assertEquals(EXPECTED_MAX_EQUAL, s.maxElement(ALL_EQUAL),
            "Max of all-equal list should be " + EXPECTED_MAX_EQUAL);
    }

    @Test
    @DisplayName("Claude: maxElement should find max in mixed positive and negative list")
    void claude_maxElement_mixedNumbers() {
        solutions.claude.Task35 s = new solutions.claude.Task35();
        assertEquals(EXPECTED_MAX_MIXED, s.maxElement(MIXED_NUMBERS),
            "Max of mixed list should be " + EXPECTED_MAX_MIXED);
    }

    @Test
    @DisplayName("Claude: maxElement should return zero when max element is zero")
    void claude_maxElement_maxIsZero() {
        solutions.claude.Task35 s = new solutions.claude.Task35();
        assertEquals(EXPECTED_MAX_ZERO, s.maxElement(MAX_IS_ZERO),
            "Max of list with zero as max should be " + EXPECTED_MAX_ZERO);
    }
}