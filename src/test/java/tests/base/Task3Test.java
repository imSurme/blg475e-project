package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Task3Test {

    @Test
    @DisplayName("Gemini: belowZero")
    void gemini_belowZero() {
        solutions.gemini.Task3 s = new solutions.gemini.Task3();
        assertFalse(s.belowZero(new ArrayList<>(Arrays.asList())));
        assertFalse(s.belowZero(new ArrayList<>(Arrays.asList(1, 2, -3, 1, 2, -3))));
        assertTrue(s.belowZero(new ArrayList<>(Arrays.asList(1, 2, -4, 5, 6))));
        assertFalse(s.belowZero(new ArrayList<>(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4))));
        assertTrue(s.belowZero(new ArrayList<>(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5))));
        assertTrue(s.belowZero(new ArrayList<>(Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4))));
    }

    @Test
    @DisplayName("Claude: belowZero")
    void claude_belowZero() {
        solutions.claude.Task3 s = new solutions.claude.Task3();
        assertFalse(s.belowZero(new ArrayList<>(Arrays.asList())));
        assertFalse(s.belowZero(new ArrayList<>(Arrays.asList(1, 2, -3, 1, 2, -3))));
        assertTrue(s.belowZero(new ArrayList<>(Arrays.asList(1, 2, -4, 5, 6))));
        assertFalse(s.belowZero(new ArrayList<>(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4))));
        assertTrue(s.belowZero(new ArrayList<>(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5))));
        assertTrue(s.belowZero(new ArrayList<>(Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4))));
    }

}
