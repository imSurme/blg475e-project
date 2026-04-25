package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task27ManualTest {

    @Test
    @DisplayName("Both: digits mutation")
    void both_digitsInput() {
        solutions.gemini.Task27 g = new solutions.gemini.Task27();
        solutions.claude.Task27 c = new solutions.claude.Task27();
        assertEquals("12345", g.flipCase("12345"));
        assertEquals("12345", c.flipCase("12345"));
    }

    @Test
    @DisplayName("Both: symbols mutation")
    void both_symbolsInput() {
        solutions.gemini.Task27 g = new solutions.gemini.Task27();
        solutions.claude.Task27 c = new solutions.claude.Task27();
        assertEquals("!@#$%", g.flipCase("!@#$%"));
        assertEquals("!@#$%", c.flipCase("!@#$%"));
    }

    @Test
    @DisplayName("Both: mixed letters and digits")
    void both_mixedLettersDigits() {
        solutions.gemini.Task27 g = new solutions.gemini.Task27();
        solutions.claude.Task27 c = new solutions.claude.Task27();
        assertEquals("tEST123", g.flipCase("Test123"));
        assertEquals("tEST123", c.flipCase("Test123"));
    }
}
