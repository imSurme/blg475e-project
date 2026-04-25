package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Task30Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: getPositive([-1, -2, 4, 5, 6]) should return [4, 5, 6]")
    void gemini_getPositive_mixed() {
        solutions.gemini.Task30 s = new solutions.gemini.Task30();
        assertEquals(Arrays.asList(4, 5, 6), s.getPositive(new ArrayList<>(Arrays.asList(-1, -2, 4, 5, 6))));
    }

    @Test
    @DisplayName("Gemini: getPositive([5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10]) should return [5, 3, 2, 3, 3, 9, 123, 1]")
    void gemini_getPositive_complex() {
        solutions.gemini.Task30 s = new solutions.gemini.Task30();
        assertEquals(Arrays.asList(5, 3, 2, 3, 3, 9, 123, 1), s.getPositive(new ArrayList<>(Arrays.asList(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10))));
    }

    @Test
    @DisplayName("Gemini: getPositive([-1, -2]) should return []")
    void gemini_getPositive_allNegative() {
        solutions.gemini.Task30 s = new solutions.gemini.Task30();
        assertEquals(List.of(), s.getPositive(new ArrayList<>(Arrays.asList(-1, -2))));
    }

    @Test
    @DisplayName("Gemini: getPositive([]) should return []")
    void gemini_getPositive_empty() {
        solutions.gemini.Task30 s = new solutions.gemini.Task30();
        assertEquals(List.of(), s.getPositive(List.of()));
    }

    // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: getPositive([-1, -2, 4, 5, 6]) should return [4, 5, 6]")
    void claude_getPositive_mixed() {
        solutions.claude.Task30 s = new solutions.claude.Task30();
        assertEquals(Arrays.asList(4, 5, 6), s.getPositive(new ArrayList<>(Arrays.asList(-1, -2, 4, 5, 6))));
    }

    @Test
    @DisplayName("Claude: getPositive([5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10]) should return [5, 3, 2, 3, 3, 9, 123, 1]")
    void claude_getPositive_complex() {
        solutions.claude.Task30 s = new solutions.claude.Task30();
        assertEquals(Arrays.asList(5, 3, 2, 3, 3, 9, 123, 1), s.getPositive(new ArrayList<>(Arrays.asList(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10))));
    }

    @Test
    @DisplayName("Claude: getPositive([-1, -2]) should return []")
    void claude_getPositive_allNegative() {
        solutions.claude.Task30 s = new solutions.claude.Task30();
        assertEquals(List.of(), s.getPositive(new ArrayList<>(Arrays.asList(-1, -2))));
    }

    @Test
    @DisplayName("Claude: getPositive([]) should return []")
    void claude_getPositive_empty() {
        solutions.claude.Task30 s = new solutions.claude.Task30();
        assertEquals(List.of(), s.getPositive(List.of()));
    }
}
