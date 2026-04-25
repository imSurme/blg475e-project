package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task23ManualTest {

    @Test
    @DisplayName("Both: spaces mutation")
    void both_spacesInput() {
        solutions.gemini.Task23 g = new solutions.gemini.Task23();
        solutions.claude.Task23 c = new solutions.claude.Task23();
        assertEquals(3, g.strlen("   "));
        assertEquals(3, c.strlen("   "));
    }

    @Test
    @DisplayName("Both: mixed spaces mutation")
    void both_mixedSpacesInput() {
        solutions.gemini.Task23 g = new solutions.gemini.Task23();
        solutions.claude.Task23 c = new solutions.claude.Task23();
        assertEquals(5, g.strlen("a b c"));
        assertEquals(5, c.strlen("a b c"));
    }

    @Test
    @DisplayName("Both: special characters mutation")
    void both_specialChars() {
        solutions.gemini.Task23 g = new solutions.gemini.Task23();
        solutions.claude.Task23 c = new solutions.claude.Task23();
        assertEquals(4, g.strlen("!@#$"));
        assertEquals(4, c.strlen("!@#$"));
    }
}
