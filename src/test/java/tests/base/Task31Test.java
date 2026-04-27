package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Base tests for Task 31 from HumanEval dataset.
 * Tests both Gemini and Claude generated code.
 */
class Task31Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: isPrime test case 1")
    void gemini_isPrime_1() {
        solutions.gemini.Task31 s = new solutions.gemini.Task31();
        assertFalse(s.isPrime(6));
    }

    @Test
    @DisplayName("Gemini: isPrime test case 2")
    void gemini_isPrime_2() {
        solutions.gemini.Task31 s = new solutions.gemini.Task31();
        assertTrue(s.isPrime(101));
    }

    @Test
    @DisplayName("Gemini: isPrime test case 3")
    void gemini_isPrime_3() {
        solutions.gemini.Task31 s = new solutions.gemini.Task31();
        assertTrue(s.isPrime(11));
    }

    @Test
    @DisplayName("Gemini: isPrime test case 4")
    void gemini_isPrime_4() {
        solutions.gemini.Task31 s = new solutions.gemini.Task31();
        assertTrue(s.isPrime(13441));
    }

    @Test
    @DisplayName("Gemini: isPrime test case 5")
    void gemini_isPrime_5() {
        solutions.gemini.Task31 s = new solutions.gemini.Task31();
        assertTrue(s.isPrime(61));
    }

    @Test
    @DisplayName("Gemini: isPrime test case 6")
    void gemini_isPrime_6() {
        solutions.gemini.Task31 s = new solutions.gemini.Task31();
        assertFalse(s.isPrime(4));
    }

    @Test
    @DisplayName("Gemini: isPrime test case 7")
    void gemini_isPrime_7() {
        solutions.gemini.Task31 s = new solutions.gemini.Task31();
        assertFalse(s.isPrime(1));
    }

    @Test
    @DisplayName("Gemini: isPrime test case 8")
    void gemini_isPrime_8() {
        solutions.gemini.Task31 s = new solutions.gemini.Task31();
        assertTrue(s.isPrime(5));
    }

    @Test
    @DisplayName("Gemini: isPrime test case 9")
    void gemini_isPrime_9() {
        solutions.gemini.Task31 s = new solutions.gemini.Task31();
        assertTrue(s.isPrime(11));
    }

    @Test
    @DisplayName("Gemini: isPrime test case 10")
    void gemini_isPrime_10() {
        solutions.gemini.Task31 s = new solutions.gemini.Task31();
        assertTrue(s.isPrime(17));
    }

    @Test
    @DisplayName("Gemini: isPrime test case 11")
    void gemini_isPrime_11() {
        solutions.gemini.Task31 s = new solutions.gemini.Task31();
        assertFalse(s.isPrime(5 * 17));
    }

    @Test
    @DisplayName("Gemini: isPrime test case 12")
    void gemini_isPrime_12() {
        solutions.gemini.Task31 s = new solutions.gemini.Task31();
        assertFalse(s.isPrime(11 * 7));
    }

    @Test
    @DisplayName("Gemini: isPrime test case 13")
    void gemini_isPrime_13() {
        solutions.gemini.Task31 s = new solutions.gemini.Task31();
        assertFalse(s.isPrime(13441 * 19));
    }

    // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: isPrime test case 1")
    void claude_isPrime_1() {
        solutions.claude.Task31 s = new solutions.claude.Task31();
        assertFalse(s.isPrime(6));
    }

    @Test
    @DisplayName("Claude: isPrime test case 2")
    void claude_isPrime_2() {
        solutions.claude.Task31 s = new solutions.claude.Task31();
        assertTrue(s.isPrime(101));
    }

    @Test
    @DisplayName("Claude: isPrime test case 3")
    void claude_isPrime_3() {
        solutions.claude.Task31 s = new solutions.claude.Task31();
        assertTrue(s.isPrime(11));
    }

    @Test
    @DisplayName("Claude: isPrime test case 4")
    void claude_isPrime_4() {
        solutions.claude.Task31 s = new solutions.claude.Task31();
        assertTrue(s.isPrime(13441));
    }

    @Test
    @DisplayName("Claude: isPrime test case 5")
    void claude_isPrime_5() {
        solutions.claude.Task31 s = new solutions.claude.Task31();
        assertTrue(s.isPrime(61));
    }

    @Test
    @DisplayName("Claude: isPrime test case 6")
    void claude_isPrime_6() {
        solutions.claude.Task31 s = new solutions.claude.Task31();
        assertFalse(s.isPrime(4));
    }

    @Test
    @DisplayName("Claude: isPrime test case 7")
    void claude_isPrime_7() {
        solutions.claude.Task31 s = new solutions.claude.Task31();
        assertFalse(s.isPrime(1));
    }

    @Test
    @DisplayName("Claude: isPrime test case 8")
    void claude_isPrime_8() {
        solutions.claude.Task31 s = new solutions.claude.Task31();
        assertTrue(s.isPrime(5));
    }

    @Test
    @DisplayName("Claude: isPrime test case 9")
    void claude_isPrime_9() {
        solutions.claude.Task31 s = new solutions.claude.Task31();
        assertTrue(s.isPrime(11));
    }

    @Test
    @DisplayName("Claude: isPrime test case 10")
    void claude_isPrime_10() {
        solutions.claude.Task31 s = new solutions.claude.Task31();
        assertTrue(s.isPrime(17));
    }

    @Test
    @DisplayName("Claude: isPrime test case 11")
    void claude_isPrime_11() {
        solutions.claude.Task31 s = new solutions.claude.Task31();
        assertFalse(s.isPrime(5 * 17));
    }

    @Test
    @DisplayName("Claude: isPrime test case 12")
    void claude_isPrime_12() {
        solutions.claude.Task31 s = new solutions.claude.Task31();
        assertFalse(s.isPrime(11 * 7));
    }

    @Test
    @DisplayName("Claude: isPrime test case 13")
    void claude_isPrime_13() {
        solutions.claude.Task31 s = new solutions.claude.Task31();
        assertFalse(s.isPrime(13441 * 19));
    }

}
