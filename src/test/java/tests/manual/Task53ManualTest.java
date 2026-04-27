package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task53ManualTest {

    @Test
    @DisplayName("Both: set to zero boundary")
    void both_zeroValues() {
        solutions.gemini.Task53 g = new solutions.gemini.Task53();
        solutions.claude.Task53 c = new solutions.claude.Task53();
        assertEquals(0, g.add(0, 0));
        assertEquals(0, c.add(0, 0));
    }

    @Test
    @DisplayName("Gemini: make negative mutation")
    void gemini_negativeValues() {
        solutions.gemini.Task53 s = new solutions.gemini.Task53();
        assertEquals(-5, s.add(-2, -3));
    }

    @Test
    @DisplayName("Claude: invert sign mutation")
    void claude_invertSign() {
        solutions.claude.Task53 s = new solutions.claude.Task53();
        assertEquals(0, s.add(2, -2));
    }

    @Test
    @DisplayName("Both: large numbers boundary")
    void both_largeNumbers() {
        solutions.gemini.Task53 g = new solutions.gemini.Task53();
        solutions.claude.Task53 c = new solutions.claude.Task53();
        assertEquals(3000, g.add(1000, 2000));
        assertEquals(3000, c.add(1000, 2000));
    }
}