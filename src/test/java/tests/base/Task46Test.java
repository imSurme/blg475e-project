package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class Task46Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: fib4(5) should return 4")
    void gemini_fib4_5() {
        solutions.gemini.Task46 s = new solutions.gemini.Task46();
        assertEquals(4, s.fib4(5));
    }

    @Test
    @DisplayName("Gemini: fib4(8) should return 28")
    void gemini_fib4_8() {
        solutions.gemini.Task46 s = new solutions.gemini.Task46();
        assertEquals(28, s.fib4(8));
    }

    @Test
    @DisplayName("Gemini: fib4(10) should return 104")
    void gemini_fib4_10() {
        solutions.gemini.Task46 s = new solutions.gemini.Task46();
        assertEquals(104, s.fib4(10));
    }

    @Test
    @DisplayName("Gemini: fib4(12) should return 386")
    void gemini_fib4_12() {
        solutions.gemini.Task46 s = new solutions.gemini.Task46();
        assertEquals(386, s.fib4(12));
    }

    // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: fib4(5) should return 4")
    void claude_fib4_5() {
        solutions.claude.Task46 s = new solutions.claude.Task46();
        assertEquals(4, s.fib4(5));
    }

    @Test
    @DisplayName("Claude: fib4(8) should return 28")
    void claude_fib4_8() {
        solutions.claude.Task46 s = new solutions.claude.Task46();
        assertEquals(28, s.fib4(8));
    }

    @Test
    @DisplayName("Claude: fib4(10) should return 104")
    void claude_fib4_10() {
        solutions.claude.Task46 s = new solutions.claude.Task46();
        assertEquals(104, s.fib4(10));
    }

    @Test
    @DisplayName("Claude: fib4(12) should return 386")
    void claude_fib4_12() {
        solutions.claude.Task46 s = new solutions.claude.Task46();
        assertEquals(386, s.fib4(12));
    }
}
