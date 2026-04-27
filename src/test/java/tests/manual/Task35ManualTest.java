package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Task35ManualTest {

    @Test
@DisplayName("Both: empty list boundary (null expected)")
void both_emptyList() {
    solutions.gemini.Task35 g = new solutions.gemini.Task35();
    solutions.claude.Task35 c = new solutions.claude.Task35();
    assertNull(g.maxElement(Collections.emptyList()));
    assertNull(c.maxElement(Collections.emptyList()));
}

    @Test
    @DisplayName("Gemini: all negative elements mutation")
    void gemini_allNegative() {
        solutions.gemini.Task35 s = new solutions.gemini.Task35();
        assertEquals(-1, s.maxElement(Arrays.asList(-5, -1, -3)));
    }

    @Test
    @DisplayName("Claude: duplicate max elements mutation")
    void claude_duplicateMax() {
        solutions.claude.Task35 s = new solutions.claude.Task35();
        assertEquals(5, s.maxElement(Arrays.asList(5, 1, 5, 2)));
    }

    @Test
    @DisplayName("Both: single element list boundary")
    void both_singleElement() {
        solutions.gemini.Task35 g = new solutions.gemini.Task35();
        solutions.claude.Task35 c = new solutions.claude.Task35();
        assertEquals(42, g.maxElement(Collections.singletonList(42)));
        assertEquals(42, c.maxElement(Collections.singletonList(42)));
    }
}