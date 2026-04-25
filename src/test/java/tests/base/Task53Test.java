package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class Task53Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: add should calculate sum of two positive numbers")
    void gemini_add_positiveNumbers() {
        solutions.gemini.Task53 s = new solutions.gemini.Task53();
        assertEquals(5, s.add(2, 3));
    }

    @Test
    @DisplayName("Gemini: add should calculate sum of two negative numbers")
    void gemini_add_negativeNumbers() {
        solutions.gemini.Task53 s = new solutions.gemini.Task53();
        assertEquals(-5, s.add(-2, -3));
    }

    @Test
    @DisplayName("Gemini: add should calculate sum of mixed sign numbers")
    void gemini_add_mixedNumbers() {
        solutions.gemini.Task53 s = new solutions.gemini.Task53();
        assertEquals(-1, s.add(2, -3));
    }

    @Test
    @DisplayName("Gemini: add should return zero when both are zero")
    void gemini_add_zeros() {
        solutions.gemini.Task53 s = new solutions.gemini.Task53();
        assertEquals(0, s.add(0, 0));
    }
// ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: add should calculate sum of two positive numbers")
    void claude_add_positiveNumbers() {
        solutions.claude.Task53 s = new solutions.claude.Task53();
        assertEquals(5, s.add(2, 3));
    }

    @Test
    @DisplayName("Claude: add should calculate sum of two negative numbers")
    void claude_add_negativeNumbers() {
        solutions.claude.Task53 s = new solutions.claude.Task53();
        assertEquals(-5, s.add(-2, -3));
    }

    @Test
    @DisplayName("Claude: add should calculate sum of mixed sign numbers")
    void claude_add_mixedNumbers() {
        solutions.claude.Task53 s = new solutions.claude.Task53();
        assertEquals(-1, s.add(2, -3));
    }

    @Test
    @DisplayName("Claude: add should return zero when both are zero")
    void claude_add_zeros() {
        solutions.claude.Task53 s = new solutions.claude.Task53();
        assertEquals(0, s.add(0, 0));
    }

    @Test
    @DisplayName("Claude: add should return correct value when one operand is zero")
    void claude_add_oneZero() {
        solutions.claude.Task53 s = new solutions.claude.Task53();
        assertEquals(7, s.add(7, 0));
    }

    @Test
    @DisplayName("Claude: add should handle large positive numbers")
    void claude_add_largeNumbers() {
        solutions.claude.Task53 s = new solutions.claude.Task53();
        assertEquals(2000000, s.add(1000000, 1000000));
    }

    @Test
    @DisplayName("Claude: add should return zero for opposite values")
    void claude_add_oppositeValues() {
        solutions.claude.Task53 s = new solutions.claude.Task53();
        assertEquals(0, s.add(100, -100));
    }
}