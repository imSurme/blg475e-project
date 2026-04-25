package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.ArrayList;

class Task42Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: incrList should increment normal positive values")
    void gemini_incrList_normalValues() {
        solutions.gemini.Task42 s = new solutions.gemini.Task42();
        assertEquals(Arrays.asList(2, 3, 4), s.incrList(Arrays.asList(1, 2, 3)));
    }

    @Test
    @DisplayName("Gemini: incrList should increment negative values to zero/positive")
    void gemini_incrList_negativeValues() {
        solutions.gemini.Task42 s = new solutions.gemini.Task42();
        assertEquals(Arrays.asList(0, 1), s.incrList(Arrays.asList(-1, 0)));
    }

    @Test
    @DisplayName("Gemini: incrList should return empty list when given empty list")
    void gemini_incrList_emptyList() {
        solutions.gemini.Task42 s = new solutions.gemini.Task42();
        assertTrue(s.incrList(new ArrayList<>()).isEmpty());
    }

    @Test
    @DisplayName("Gemini: incrList should handle null input safely")
    void gemini_incrList_nullInput() {
        solutions.gemini.Task42 s = new solutions.gemini.Task42();
        assertTrue(s.incrList(null).isEmpty());
    }
 
   // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: incrList should increment normal positive values")
    void claude_incrList_normalValues() {
        solutions.claude.Task42 s = new solutions.claude.Task42();
        assertEquals(Arrays.asList(2, 3, 4), s.incrList(Arrays.asList(1, 2, 3)));
    }

    @Test
    @DisplayName("Claude: incrList should increment negative values to zero/positive")
    void claude_incrList_negativeValues() {
        solutions.claude.Task42 s = new solutions.claude.Task42();
        assertEquals(Arrays.asList(0, 1), s.incrList(Arrays.asList(-1, 0)));
    }

    @Test
    @DisplayName("Claude: incrList should return empty list when given empty list")
    void claude_incrList_emptyList() {
        solutions.claude.Task42 s = new solutions.claude.Task42();
        assertTrue(s.incrList(new ArrayList<>()).isEmpty());
    }

    @Test
    @DisplayName("Claude: incrList should increment single element list")
    void claude_incrList_singleElement() {
        solutions.claude.Task42 s = new solutions.claude.Task42();
        assertEquals(Arrays.asList(6), s.incrList(Arrays.asList(5)));
    }

    @Test
    @DisplayName("Claude: incrList should increment all negative values")
    void claude_incrList_allNegative() {
        solutions.claude.Task42 s = new solutions.claude.Task42();
        assertEquals(Arrays.asList(-4, -3, -2), s.incrList(Arrays.asList(-5, -4, -3)));
    }

    @Test
    @DisplayName("Claude: incrList should increment large values correctly")
    void claude_incrList_largeValues() {
        solutions.claude.Task42 s = new solutions.claude.Task42();
        assertEquals(Arrays.asList(1001, 2001), s.incrList(Arrays.asList(1000, 2000)));
    }

    @Test
    @DisplayName("Claude: incrList should increment list containing zero")
    void claude_incrList_containsZero() {
        solutions.claude.Task42 s = new solutions.claude.Task42();
        assertEquals(Arrays.asList(1, 2, 3), s.incrList(Arrays.asList(0, 1, 2)));
    }
}