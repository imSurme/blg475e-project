package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task45ManualTest {

    @Test
    @DisplayName("Both: zero base boundary")
    void both_zeroBase() {
        solutions.gemini.Task45 g = new solutions.gemini.Task45();
        solutions.claude.Task45 c = new solutions.claude.Task45();
        assertEquals(0.0, g.triangleArea(0.0, 5.0), 0.0001);
        assertEquals(0.0, c.triangleArea(0.0, 5.0), 0.0001);
    }

    @Test
    @DisplayName("Gemini: equalize base and height mutation")
    void gemini_baseEqualsHeight() {
        solutions.gemini.Task45 s = new solutions.gemini.Task45();
        assertEquals(8.0, s.triangleArea(4.0, 4.0), 0.0001);
    }

    @Test
    @DisplayName("Claude: scale up floating points mutation")
    void claude_largeInputs() {
        solutions.claude.Task45 s = new solutions.claude.Task45();
        assertEquals(500000.0, s.triangleArea(1000.0, 1000.0), 0.0001);
    }

    @Test
    @DisplayName("Both: floating-point precision boundary")
    void both_smallDecimals() {
        solutions.gemini.Task45 g = new solutions.gemini.Task45();
        solutions.claude.Task45 c = new solutions.claude.Task45();
        assertEquals(0.25, g.triangleArea(0.5, 1.0), 0.0001);
        assertEquals(0.25, c.triangleArea(0.5, 1.0), 0.0001);
    }
}