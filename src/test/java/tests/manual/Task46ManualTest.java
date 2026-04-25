package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task46ManualTest {

    @Test
    @DisplayName("Both: base-case boundaries n=0..4")
    void both_baseCaseBoundaries() {
        solutions.gemini.Task46 g = new solutions.gemini.Task46();
        solutions.claude.Task46 c = new solutions.claude.Task46();

        assertEquals(0, g.fib4(0));
        assertEquals(0, g.fib4(1));
        assertEquals(2, g.fib4(2));
        assertEquals(0, g.fib4(3));
        assertEquals(2, g.fib4(4));

        assertEquals(0, c.fib4(0));
        assertEquals(0, c.fib4(1));
        assertEquals(2, c.fib4(2));
        assertEquals(0, c.fib4(3));
        assertEquals(2, c.fib4(4));
    }

    @Test
    @DisplayName("Both: large-n mutation")
    void both_largeNMutation() {
        solutions.gemini.Task46 g = new solutions.gemini.Task46();
        solutions.claude.Task46 c = new solutions.claude.Task46();
        assertEquals(73552, g.fib4(20));
        assertEquals(73552, c.fib4(20));
    }
}
