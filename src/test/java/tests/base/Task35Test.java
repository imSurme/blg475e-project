package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

class Task35Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: maxElement should find max in positive numbers")
    void gemini_maxElement_positiveNumbers() {
        solutions.gemini.Task35 s = new solutions.gemini.Task35();
        assertEquals(5, s.maxElement(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    @DisplayName("Gemini: maxElement should find max in negative numbers")
    void gemini_maxElement_negativeNumbers() {
        solutions.gemini.Task35 s = new solutions.gemini.Task35();
        assertEquals(-1, s.maxElement(Arrays.asList(-10, -5, -1, -20)));
    }

    @Test
    @DisplayName("Gemini: maxElement should return the element for single item list")
    void gemini_maxElement_singleElement() {
        solutions.gemini.Task35 s = new solutions.gemini.Task35();
        assertEquals(42, s.maxElement(Arrays.asList(42)));
    }

    @Test
    @DisplayName("Gemini: maxElement should return null for empty list")
    void gemini_maxElement_emptyList() {
        solutions.gemini.Task35 s = new solutions.gemini.Task35();
        assertNull(s.maxElement(Collections.emptyList()));
    }

    @Test
    @DisplayName("Gemini: maxElement should return null for null input")
    void gemini_maxElement_nullInput() {
        solutions.gemini.Task35 s = new solutions.gemini.Task35();
        assertNull(s.maxElement(null));
    }


// ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: maxElement should find max in positive numbers")
    void claude_maxElement_positiveNumbers() {
        solutions.claude.Task35 s = new solutions.claude.Task35();
        assertEquals(5, s.maxElement(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    @DisplayName("Claude: maxElement should find max in negative numbers")
    void claude_maxElement_negativeNumbers() {
        solutions.claude.Task35 s = new solutions.claude.Task35();
        assertEquals(-1, s.maxElement(Arrays.asList(-10, -5, -1, -20)));
    }

    @Test
    @DisplayName("Claude: maxElement should return the element for single item list")
    void claude_maxElement_singleElement() {
        solutions.claude.Task35 s = new solutions.claude.Task35();
        assertEquals(42, s.maxElement(Arrays.asList(42)));
    }

    @Test
    @DisplayName("Claude: maxElement should find max when max is at the beginning")
    void claude_maxElement_maxAtBeginning() {
        solutions.claude.Task35 s = new solutions.claude.Task35();
        assertEquals(100, s.maxElement(Arrays.asList(100, 50, 25, 10)));
    }

    @Test
    @DisplayName("Claude: maxElement should find max when all elements are equal")
    void claude_maxElement_allEqual() {
        solutions.claude.Task35 s = new solutions.claude.Task35();
        assertEquals(7, s.maxElement(Arrays.asList(7, 7, 7, 7)));
    }

    @Test
    @DisplayName("Claude: maxElement should find max in mixed positive and negative numbers")
    void claude_maxElement_mixedNumbers() {
        solutions.claude.Task35 s = new solutions.claude.Task35();
        assertEquals(10, s.maxElement(Arrays.asList(-3, 0, 10, -7, 5)));
    }

    @Test
    @DisplayName("Claude: maxElement should find max when max is zero")
    void claude_maxElement_maxIsZero() {
        solutions.claude.Task35 s = new solutions.claude.Task35();
        assertEquals(0, s.maxElement(Arrays.asList(-5, -3, 0, -1)));
    }
} 