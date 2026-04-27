package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task26ManualTest {

    @Test
    @DisplayName("Gemini: all same elements border")
    void gemini_allSameElements() {
        solutions.gemini.Task26 s = new solutions.gemini.Task26();
        assertEquals(Collections.emptyList(), s.removeDuplicates(Arrays.asList(2, 2, 2, 2)));
    }

    @Test
    @DisplayName("Claude: all same elements border")
    void claude_allSameElements() {
        solutions.claude.Task26 s = new solutions.claude.Task26();
        assertEquals(Collections.emptyList(), s.removeDuplicates(Arrays.asList(2, 2, 2, 2)));
    }

    @Test
    @DisplayName("Both: empty array")
    void both_emptyArray() {
        solutions.gemini.Task26 g = new solutions.gemini.Task26();
        solutions.claude.Task26 c = new solutions.claude.Task26();
        assertEquals(Collections.emptyList(), g.removeDuplicates(Collections.emptyList()));
        assertEquals(Collections.emptyList(), c.removeDuplicates(Collections.emptyList()));
    }
}