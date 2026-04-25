package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.ArrayList;
class Task68Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: pluck should return smallest even number and index")
    void gemini_pluck_withEvenNumbers() {
        solutions.gemini.Task68 s = new solutions.gemini.Task68();
        assertArrayEquals(new int[]{2, 1}, s.pluck(new int[]{4, 2, 3}));
    }

    @Test
    @DisplayName("Gemini: pluck should return first index if multiple same min evens exist")
    void gemini_pluck_multipleSameMinEvens() {
        solutions.gemini.Task68 s = new solutions.gemini.Task68();
        assertArrayEquals(new int[]{2, 1}, s.pluck(new int[]{4, 2, 3, 2}));
    }

    @Test
    @DisplayName("Gemini: pluck should return empty array if no even numbers")
    void gemini_pluck_noEvenNumbers() {
        solutions.gemini.Task68 s = new solutions.gemini.Task68();
        assertArrayEquals(new int[0], s.pluck(new int[]{1, 3, 5}));
    }

    @Test
    @DisplayName("Gemini: pluck should return empty array for empty or null input")
    void gemini_pluck_emptyOrNullArray() {
        solutions.gemini.Task68 s = new solutions.gemini.Task68();
        assertArrayEquals(new int[0], s.pluck(new int[0]));
        assertArrayEquals(new int[0], s.pluck(null));
    }
// ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: pluck should return smallest even number and index")
    void claude_pluck_withEvenNumbers() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        assertEquals(Arrays.asList(2L, 1L), s.pluck(Arrays.asList(4L, 2L, 3L)));
    }

    @Test
    @DisplayName("Claude: pluck should return first index if multiple same min evens exist")
    void claude_pluck_multipleSameMinEvens() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        assertEquals(Arrays.asList(2L, 1L), s.pluck(Arrays.asList(4L, 2L, 3L, 2L)));
    }

    @Test
    @DisplayName("Claude: pluck should return empty list if no even numbers")
    void claude_pluck_noEvenNumbers() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        assertTrue(s.pluck(Arrays.asList(1L, 3L, 5L)).isEmpty());
    }

    @Test
    @DisplayName("Claude: pluck should return empty list for empty input")
    void claude_pluck_emptyList() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        assertTrue(s.pluck(new ArrayList<>()).isEmpty());
    }

    @Test
    @DisplayName("Claude: pluck should return correct index when even is at beginning")
    void claude_pluck_evenAtBeginning() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        assertEquals(Arrays.asList(2L, 0L), s.pluck(Arrays.asList(2L, 5L, 7L)));
    }

    @Test
    @DisplayName("Claude: pluck should return correct index when even is at end")
    void claude_pluck_evenAtEnd() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        assertEquals(Arrays.asList(4L, 2L), s.pluck(Arrays.asList(1L, 3L, 4L)));
    }

    @Test
    @DisplayName("Claude: pluck should return smallest even among multiple evens")
    void claude_pluck_multipleEvens() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        assertEquals(Arrays.asList(2L, 2L), s.pluck(Arrays.asList(8L, 6L, 2L, 4L)));
    }
}