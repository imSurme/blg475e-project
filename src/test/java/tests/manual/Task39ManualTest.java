package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task39ManualTest {

    @Test
    @DisplayName("Both: n=4 mutation from base")
    void both_n4() {
        solutions.gemini.Task39 g = new solutions.gemini.Task39();
        solutions.claude.Task39 c = new solutions.claude.Task39();
        assertEquals(13, g.primeFib(4));
        assertEquals(13, c.primeFib(4));
    }

    @Test
    @DisplayName("Both: n=6 mutation from base")
    void both_n6() {
        solutions.gemini.Task39 g = new solutions.gemini.Task39();
        solutions.claude.Task39 c = new solutions.claude.Task39();
        assertEquals(233, g.primeFib(6));
        assertEquals(233, c.primeFib(6));
    }
}
