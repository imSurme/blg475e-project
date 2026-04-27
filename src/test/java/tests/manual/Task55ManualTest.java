package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task55ManualTest {

    @Test
    @DisplayName("Gemini: zeroth index constraint")
    void gemini_zerothIndex() {
        solutions.gemini.Task55 s = new solutions.gemini.Task55();
        assertEquals(0, s.fib(0));
    }

    @Test
    @DisplayName("Claude: zeroth index constraint")
    void claude_zerothIndex() {
        solutions.claude.Task55 s = new solutions.claude.Task55();
        assertEquals(0, s.fib(0));
    }

    @Test
    @DisplayName("Both: heavy integer limit constraint")
    void both_largeFibLimit() {
        solutions.gemini.Task55 g = new solutions.gemini.Task55();
        solutions.claude.Task55 c = new solutions.claude.Task55();
        // 46th Fibonacci fits in 32-bit signed int (1836311903)
        // Testing memory bound mutation
        assertEquals(1836311903, g.fib(46));
        assertEquals(1836311903, c.fib(46));
    }
}