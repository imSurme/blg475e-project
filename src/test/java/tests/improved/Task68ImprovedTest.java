package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Task68ImprovedTest {

    // ==================== GEMINI CONSTANTS ====================

    private static final int[]      NULL_INPUT              = null;
    private static final int[]      EMPTY_INPUT             = new int[0];
    private static final int[]      MIXED_ARRAY             = new int[]{4, 2, 3};
    private static final int[]      NO_EVEN_ARRAY           = new int[]{1, 3, 5};
    private static final int[]      EXPECTED_EMPTY_RESULT   = new int[0];
    private static final int[]      EXPECTED_MIXED_RESULT   = new int[]{2, 1};

    // ==================== CLAUDE CONSTANTS ====================

    private static final List<Long> WITH_EVENS_INPUT        = Arrays.asList(4L, 2L, 3L);
    private static final List<Long> WITH_EVENS_EXPECTED     = Arrays.asList(2L, 1L);

    private static final List<Long> SAME_MIN_EVENS_INPUT    = Arrays.asList(4L, 2L, 3L, 2L);
    private static final List<Long> SAME_MIN_EVENS_EXPECTED = Arrays.asList(2L, 1L);

    private static final List<Long> NO_EVENS_INPUT          = Arrays.asList(1L, 3L, 5L);

    private static final List<Long> EVEN_AT_START_INPUT     = Arrays.asList(2L, 5L, 7L);
    private static final List<Long> EVEN_AT_START_EXPECTED  = Arrays.asList(2L, 0L);

    private static final List<Long> EVEN_AT_END_INPUT       = Arrays.asList(1L, 3L, 4L);
    private static final List<Long> EVEN_AT_END_EXPECTED    = Arrays.asList(4L, 2L);

    private static final List<Long> MULTIPLE_EVENS_INPUT    = Arrays.asList(8L, 6L, 2L, 4L);
    private static final List<Long> MULTIPLE_EVENS_EXPECTED = Arrays.asList(2L, 2L);

    private static final List<Long> SINGLE_EVEN_INPUT       = Arrays.asList(6L);
    private static final List<Long> SINGLE_EVEN_EXPECTED    = Arrays.asList(6L, 0L);

    private static final List<Long> SINGLE_ODD_INPUT        = Arrays.asList(7L);

    private static final List<Long> CL_NULL_INPUT           = null;
    private static final List<Long> CL_EXPECTED_NULL        = Collections.emptyList();

    // ==================== GEMINI IMPROVED TESTS ====================

    @Test
    @DisplayName("Gemini: Should return empty array when input is null")
    void gemini_pluck_nullInput() {
        solutions.gemini.Task68 s = new solutions.gemini.Task68();
        assertArrayEquals(EXPECTED_EMPTY_RESULT, s.pluck(NULL_INPUT),
            "Assertion Roulette Fix: Failed to handle null input correctly");
    }

    @Test
    @DisplayName("Gemini: Should return empty array when input is empty")
    void gemini_pluck_emptyInput() {
        solutions.gemini.Task68 s = new solutions.gemini.Task68();
        assertArrayEquals(EXPECTED_EMPTY_RESULT, s.pluck(EMPTY_INPUT),
            "Assertion Roulette Fix: Failed to handle empty array input correctly");
    }

    @Test
    @DisplayName("Gemini: Should find the smallest even number and its index")
    void gemini_pluck_mixedArray() {
        solutions.gemini.Task68 s = new solutions.gemini.Task68();
        assertArrayEquals(EXPECTED_MIXED_RESULT, s.pluck(MIXED_ARRAY),
            "Assertion Roulette Fix: Failed to identify smallest even and its index");
    }

    @Test
    @DisplayName("Gemini: Should return empty array when no even numbers exist")
    void gemini_pluck_noEvenNumbers() {
        solutions.gemini.Task68 s = new solutions.gemini.Task68();
        assertArrayEquals(EXPECTED_EMPTY_RESULT, s.pluck(NO_EVEN_ARRAY),
            "Assertion Roulette Fix: Should return empty array when no even numbers exist");
    }

    // ==================== CLAUDE IMPROVED TESTS ====================

    @Test
    @DisplayName("Claude: pluck should return empty list for null input")
    void claude_pluck_nullInput() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        assertEquals(CL_EXPECTED_NULL, s.pluck(CL_NULL_INPUT),
            "Null input should return empty list.");
    }

    @Test
    @DisplayName("Claude: pluck should return smallest even and its index")
    void claude_pluck_withEvenNumbers() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        assertEquals(WITH_EVENS_EXPECTED, s.pluck(WITH_EVENS_INPUT),
            "Should return [2, 1] for input [4, 2, 3]");
    }

    @Test
    @DisplayName("Claude: pluck should return first occurrence when multiple same min evens exist")
    void claude_pluck_multipleSameMinEvens() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        assertEquals(SAME_MIN_EVENS_EXPECTED, s.pluck(SAME_MIN_EVENS_INPUT),
            "Should return first index when duplicate min evens exist");
    }

    @Test
    @DisplayName("Claude: pluck should return empty list when no even numbers exist")
    void claude_pluck_noEvenNumbers() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        assertTrue(s.pluck(NO_EVENS_INPUT).isEmpty(),
            "Should return empty list when no even numbers exist");
    }

    @Test
    @DisplayName("Claude: pluck should return empty list for empty input")
    void claude_pluck_emptyList() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        assertTrue(s.pluck(new ArrayList<>()).isEmpty(),
            "Should return empty list for empty input");
    }

    @Test
    @DisplayName("Claude: pluck should return correct result when even is at beginning")
    void claude_pluck_evenAtBeginning() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        assertEquals(EVEN_AT_START_EXPECTED, s.pluck(EVEN_AT_START_INPUT),
            "Should return [2, 0] when even is at index 0");
    }

    @Test
    @DisplayName("Claude: pluck should return correct result when even is at end")
    void claude_pluck_evenAtEnd() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        assertEquals(EVEN_AT_END_EXPECTED, s.pluck(EVEN_AT_END_INPUT),
            "Should return [4, 2] when only even is at last index");
    }

    @Test
    @DisplayName("Claude: pluck should return smallest even among multiple evens")
    void claude_pluck_multipleEvens() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        assertEquals(MULTIPLE_EVENS_EXPECTED, s.pluck(MULTIPLE_EVENS_INPUT),
            "Should return smallest even [2, 2] from [8, 6, 2, 4]");
    }

    @Test
    @DisplayName("Claude: pluck should handle single even element list")
    void claude_pluck_singleEven() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        assertEquals(SINGLE_EVEN_EXPECTED, s.pluck(SINGLE_EVEN_INPUT),
            "Should return [6, 0] for single even element");
    }

    @Test
    @DisplayName("Claude: pluck should return empty list for single odd element")
    void claude_pluck_singleOdd() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        assertTrue(s.pluck(SINGLE_ODD_INPUT).isEmpty(),
            "Should return empty list for single odd element");
    }
}