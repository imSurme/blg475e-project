package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Base tests for Task 13 from HumanEval dataset.
 * Tests both Gemini and Claude generated code.
 */
class Task13Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: greatestCommonDivisor test case 1")
    void gemini_greatestCommonDivisor_1() {
        solutions.gemini.Task13 s = new solutions.gemini.Task13();
        assertEquals(1, s.greatestCommonDivisor(3, 7));
    }

    @Test
    @DisplayName("Gemini: greatestCommonDivisor test case 2")
    void gemini_greatestCommonDivisor_2() {
        solutions.gemini.Task13 s = new solutions.gemini.Task13();
        assertEquals(5, s.greatestCommonDivisor(10, 15));
    }

    @Test
    @DisplayName("Gemini: greatestCommonDivisor test case 3")
    void gemini_greatestCommonDivisor_3() {
        solutions.gemini.Task13 s = new solutions.gemini.Task13();
        assertEquals(7, s.greatestCommonDivisor(49, 14));
    }

    @Test
    @DisplayName("Gemini: greatestCommonDivisor test case 4")
    void gemini_greatestCommonDivisor_4() {
        solutions.gemini.Task13 s = new solutions.gemini.Task13();
        assertEquals(12, s.greatestCommonDivisor(144, 60));
    }

    // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: greatestCommonDivisor test case 1")
    void claude_greatestCommonDivisor_1() {
        solutions.claude.Task13 s = new solutions.claude.Task13();
        assertEquals(1, s.greatestCommonDivisor(3, 7));
    }

    @Test
    @DisplayName("Claude: greatestCommonDivisor test case 2")
    void claude_greatestCommonDivisor_2() {
        solutions.claude.Task13 s = new solutions.claude.Task13();
        assertEquals(5, s.greatestCommonDivisor(10, 15));
    }

    @Test
    @DisplayName("Claude: greatestCommonDivisor test case 3")
    void claude_greatestCommonDivisor_3() {
        solutions.claude.Task13 s = new solutions.claude.Task13();
        assertEquals(7, s.greatestCommonDivisor(49, 14));
    }

    @Test
    @DisplayName("Claude: greatestCommonDivisor test case 4")
    void claude_greatestCommonDivisor_4() {
        solutions.claude.Task13 s = new solutions.claude.Task13();
        assertEquals(12, s.greatestCommonDivisor(144, 60));
    }

}
