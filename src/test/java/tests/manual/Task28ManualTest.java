package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task28ManualTest {

    @Test
    @DisplayName("Both: single-element list boundary")
    void both_singleElement() {
        solutions.gemini.Task28 g = new solutions.gemini.Task28();
        solutions.claude.Task28 c = new solutions.claude.Task28();
        assertEquals("a", g.concatenate(Collections.singletonList("a")));
        assertEquals("a", c.concatenate(Collections.singletonList("a")));
    }

    @Test
    @DisplayName("Both: mutation with empty element")
    void both_emptyElementInside() {
        solutions.gemini.Task28 g = new solutions.gemini.Task28();
        solutions.claude.Task28 c = new solutions.claude.Task28();
        assertEquals("ab", g.concatenate(Arrays.asList("a", "", "b")));
        assertEquals("ab", c.concatenate(Arrays.asList("a", "", "b")));
    }

    @Test
    @DisplayName("Both: all-empty-elements mutation")
    void both_allEmptyElements() {
        solutions.gemini.Task28 g = new solutions.gemini.Task28();
        solutions.claude.Task28 c = new solutions.claude.Task28();
        assertEquals("", g.concatenate(Arrays.asList("", "", "")));
        assertEquals("", c.concatenate(Arrays.asList("", "", "")));
    }
}
