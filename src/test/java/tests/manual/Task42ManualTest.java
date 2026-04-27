package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task42ManualTest {

    @Test
    @DisplayName("Both: empty list boundary")
    void both_emptyList() {
        solutions.gemini.Task42 g = new solutions.gemini.Task42();
        solutions.claude.Task42 c = new solutions.claude.Task42();
        assertEquals(Collections.emptyList(), g.incrList(Collections.emptyList()));
        assertEquals(Collections.emptyList(), c.incrList(Collections.emptyList()));
    }

    @Test
    @DisplayName("Gemini: zero inclusion transition mutation")
    void gemini_containsZero() {
        solutions.gemini.Task42 s = new solutions.gemini.Task42();
        assertEquals(Arrays.asList(0, 1, 2), s.incrList(Arrays.asList(-1, 0, 1)));
    }

    @Test
    @DisplayName("Claude: single element boundary")
    void claude_singleElement() {
        solutions.claude.Task42 s = new solutions.claude.Task42();
        assertEquals(Collections.singletonList(6), s.incrList(Collections.singletonList(5)));
    }

    @Test
    @DisplayName("Both: scale up values mutation")
    void both_largeIntegers() {
        solutions.gemini.Task42 g = new solutions.gemini.Task42();
        solutions.claude.Task42 c = new solutions.claude.Task42();
        assertEquals(Arrays.asList(1001, 2001), g.incrList(Arrays.asList(1000, 2000)));
        assertEquals(Arrays.asList(1001, 2001), c.incrList(Arrays.asList(1000, 2000)));
    }
}