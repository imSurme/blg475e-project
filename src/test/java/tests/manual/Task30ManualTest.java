package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task30ManualTest {

    @Test
    @DisplayName("Both: all-positive mutation")
    void both_allPositive() {
        solutions.gemini.Task30 g = new solutions.gemini.Task30();
        solutions.claude.Task30 c = new solutions.claude.Task30();
        assertEquals(Arrays.asList(1, 2, 3), g.getPositive(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(1, 2, 3), c.getPositive(Arrays.asList(1, 2, 3)));
    }

    @Test
    @DisplayName("Both: only-zero boundary")
    void both_onlyZero() {
        solutions.gemini.Task30 g = new solutions.gemini.Task30();
        solutions.claude.Task30 c = new solutions.claude.Task30();
        assertEquals(Collections.emptyList(), g.getPositive(Collections.singletonList(0)));
        assertEquals(Collections.emptyList(), c.getPositive(Collections.singletonList(0)));
    }

    @Test
    @DisplayName("Both: single-positive boundary")
    void both_singlePositive() {
        solutions.gemini.Task30 g = new solutions.gemini.Task30();
        solutions.claude.Task30 c = new solutions.claude.Task30();
        assertEquals(Collections.singletonList(5), g.getPositive(Collections.singletonList(5)));
        assertEquals(Collections.singletonList(5), c.getPositive(Collections.singletonList(5)));
    }
}
