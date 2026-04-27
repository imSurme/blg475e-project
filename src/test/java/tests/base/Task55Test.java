package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Base tests for Task 55 from HumanEval dataset.
 * Tests both Gemini and Claude generated code.
 */
class Task55Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: fib test case 1")
    void gemini_fib_1() {
        solutions.gemini.Task55 s = new solutions.gemini.Task55();
        assertEquals(55, s.fib(10));
    }

    @Test
    @DisplayName("Gemini: fib test case 2")
    void gemini_fib_2() {
        solutions.gemini.Task55 s = new solutions.gemini.Task55();
        assertEquals(1, s.fib(1));
    }

    @Test
    @DisplayName("Gemini: fib test case 3")
    void gemini_fib_3() {
        solutions.gemini.Task55 s = new solutions.gemini.Task55();
        assertEquals(21, s.fib(8));
    }

    @Test
    @DisplayName("Gemini: fib test case 4")
    void gemini_fib_4() {
        solutions.gemini.Task55 s = new solutions.gemini.Task55();
        assertEquals(89, s.fib(11));
    }

    @Test
    @DisplayName("Gemini: fib test case 5")
    void gemini_fib_5() {
        solutions.gemini.Task55 s = new solutions.gemini.Task55();
        assertEquals(144, s.fib(12));
    }

    // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: fib test case 1")
    void claude_fib_1() {
        solutions.claude.Task55 s = new solutions.claude.Task55();
        assertEquals(55, s.fib(10));
    }

    @Test
    @DisplayName("Claude: fib test case 2")
    void claude_fib_2() {
        solutions.claude.Task55 s = new solutions.claude.Task55();
        assertEquals(1, s.fib(1));
    }

    @Test
    @DisplayName("Claude: fib test case 3")
    void claude_fib_3() {
        solutions.claude.Task55 s = new solutions.claude.Task55();
        assertEquals(21, s.fib(8));
    }

    @Test
    @DisplayName("Claude: fib test case 4")
    void claude_fib_4() {
        solutions.claude.Task55 s = new solutions.claude.Task55();
        assertEquals(89, s.fib(11));
    }

    @Test
    @DisplayName("Claude: fib test case 5")
    void claude_fib_5() {
        solutions.claude.Task55 s = new solutions.claude.Task55();
        assertEquals(144, s.fib(12));
    }

}
