package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task13ManualTest {

    @Test
    @DisplayName("Gemini: negative value boundary")
    void gemini_negativeValue() {
        solutions.gemini.Task13 s = new solutions.gemini.Task13();
        // GCD of -10 and 5 is 5
        assertEquals(5, Math.abs(s.greatestCommonDivisor(-10, 5)));
    }

    @Test
    @DisplayName("Claude: negative value boundary")
    void claude_negativeValue() {
        solutions.claude.Task13 s = new solutions.claude.Task13();
        // GCD of -10 and 5 is 5
        assertEquals(5, Math.abs(s.greatestCommonDivisor(-10, 5)));
    }

    @Test
    @DisplayName("Both: handling zero boundary")
    void both_zeroHandling() {
        solutions.gemini.Task13 g = new solutions.gemini.Task13();
        solutions.claude.Task13 c = new solutions.claude.Task13();
        assertEquals(5, g.greatestCommonDivisor(0, 5));
        assertEquals(5, c.greatestCommonDivisor(0, 5));
    }
}