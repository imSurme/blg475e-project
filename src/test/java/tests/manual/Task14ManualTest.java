package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task14ManualTest {

    @Test
    @DisplayName("Gemini: exact empty string input")
    void gemini_emptyString() {
        solutions.gemini.Task14 s = new solutions.gemini.Task14();
        assertEquals(Collections.emptyList(), s.allPrefixes(""));
    }

    @Test
    @DisplayName("Claude: exact empty string input")
    void claude_emptyString() {
        solutions.claude.Task14 s = new solutions.claude.Task14();
        assertEquals(Collections.emptyList(), s.allPrefixes(""));
    }
}