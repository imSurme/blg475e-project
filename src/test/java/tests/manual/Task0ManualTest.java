package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Task0ManualTest {

    @Test
    @DisplayName("Gemini: empty list boundary")
    void gemini_emptyList() {
        solutions.gemini.Task0 s = new solutions.gemini.Task0();
        assertFalse(s.hasCloseElements(Collections.emptyList(), 0.5));
    }

    @Test
    @DisplayName("Claude: empty list boundary")
    void claude_emptyList() {
        solutions.claude.Task0 s = new solutions.claude.Task0();
        assertFalse(s.hasCloseElements(Collections.emptyList(), 0.5));
    }

    @Test
    @DisplayName("Gemini: exact threshold boundary")
    void gemini_exactThreshold() {
        solutions.gemini.Task0 s = new solutions.gemini.Task0();
        assertFalse(s.hasCloseElements(Arrays.asList(1.0, 2.0), 1.0));
    }

    @Test
    @DisplayName("Claude: exact threshold boundary")
    void claude_exactThreshold() {
        solutions.claude.Task0 s = new solutions.claude.Task0();
        assertFalse(s.hasCloseElements(Arrays.asList(1.0, 2.0), 1.0));
    }

    @Test
    @DisplayName("Both: negative threshold validation")
    void both_negativeThreshold() {
        solutions.gemini.Task0 g = new solutions.gemini.Task0();
        solutions.claude.Task0 c = new solutions.claude.Task0();
        assertFalse(g.hasCloseElements(Arrays.asList(1.0, 1.2), -0.5));
        assertFalse(c.hasCloseElements(Arrays.asList(1.0, 1.2), -0.5));
    }
}