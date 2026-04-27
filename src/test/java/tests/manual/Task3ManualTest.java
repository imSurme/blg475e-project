package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Task3ManualTest {

    @Test
    @DisplayName("Gemini: exact zero balance boundary")
    void gemini_exactZero() {
        solutions.gemini.Task3 s = new solutions.gemini.Task3();
        assertFalse(s.belowZero(Arrays.asList(100, -100)));
    }

    @Test
    @DisplayName("Claude: exact zero balance boundary")
    void claude_exactZero() {
        solutions.claude.Task3 s = new solutions.claude.Task3();
        assertFalse(s.belowZero(Arrays.asList(100, -100)));
    }
}
