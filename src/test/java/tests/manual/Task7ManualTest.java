package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task7ManualTest {

    @Test
    @DisplayName("Both: empty substring edge case")
    void both_emptySubstring() {
        solutions.gemini.Task7 g = new solutions.gemini.Task7();
        solutions.claude.Task7 c = new solutions.claude.Task7();
        assertEquals(Arrays.asList("abc"), g.filterBySubstring(Arrays.asList("abc"), ""));
        assertEquals(Arrays.asList("abc"), c.filterBySubstring(Arrays.asList("abc"), ""));
    }

    @Test
    @DisplayName("Both: substring larger than strings")
    void both_substringLarger() {
        solutions.gemini.Task7 g = new solutions.gemini.Task7();
        solutions.claude.Task7 c = new solutions.claude.Task7();
        assertEquals(Collections.emptyList(), g.filterBySubstring(Arrays.asList("a", "b"), "abc"));
        assertEquals(Collections.emptyList(), c.filterBySubstring(Arrays.asList("a", "b"), "abc"));
    }
}