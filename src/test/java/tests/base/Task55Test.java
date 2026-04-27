package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Task55Test {

    @Test
    @DisplayName("Gemini: fib")
    void gemini_fib() {
        solutions.gemini.Task55 s = new solutions.gemini.Task55();
        assertEquals(55, s.fib(10));
        assertEquals(1, s.fib(1));
        assertEquals(21, s.fib(8));
        assertEquals(89, s.fib(11));
        assertEquals(144, s.fib(12));
    }

    @Test
    @DisplayName("Claude: fib")
    void claude_fib() {
        solutions.claude.Task55 s = new solutions.claude.Task55();
        assertEquals(55, s.fib(10));
        assertEquals(1, s.fib(1));
        assertEquals(21, s.fib(8));
        assertEquals(89, s.fib(11));
        assertEquals(144, s.fib(12));
    }

}
