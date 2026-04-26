package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task42ImprovedTest {

    // ==================== GEMINI CONSTANTS ====================

    private static final List<Integer> NORMAL_INPUT      = Arrays.asList(1, 2, 3);
    private static final List<Integer> EXPECTED_NORMAL   = Arrays.asList(2, 3, 4);

    private static final List<Integer> NEGATIVE_INPUT    = Arrays.asList(-1, 0);
    private static final List<Integer> EXPECTED_NEGATIVE = Arrays.asList(0, 1);

    private static final List<Integer> EMPTY_INPUT       = Collections.emptyList();
    private static final List<Integer> NULL_INPUT        = null;

    // ==================== CLAUDE CONSTANTS ====================

    private static final List<Integer> CL_NORMAL_INPUT      = Arrays.asList(1, 2, 3);
    private static final List<Integer> CL_EXPECTED_NORMAL   = Arrays.asList(2, 3, 4);

    private static final List<Integer> CL_NEGATIVE_INPUT    = Arrays.asList(-5, -4, -3);
    private static final List<Integer> CL_EXPECTED_NEGATIVE = Arrays.asList(-4, -3, -2);

    private static final List<Integer> CL_MIXED_INPUT       = Arrays.asList(0, 1, 2);
    private static final List<Integer> CL_EXPECTED_MIXED    = Arrays.asList(1, 2, 3);

    private static final List<Integer> CL_SINGLE_INPUT      = Arrays.asList(5);
    private static final List<Integer> CL_EXPECTED_SINGLE   = Arrays.asList(6);

    private static final List<Integer> CL_LARGE_INPUT       = Arrays.asList(1000, 2000);
    private static final List<Integer> CL_EXPECTED_LARGE    = Arrays.asList(1001, 2001);

    private static final List<Integer> CL_NEG_ZERO_INPUT    = Arrays.asList(-1, 0);
    private static final List<Integer> CL_EXPECTED_NEG_ZERO = Arrays.asList(0, 1);

    // ==================== GEMINI IMPROVED TESTS ====================

    @Test
    @DisplayName("Gemini: incrList should increment normal positive values")
    void gemini_incrList_normalValues() {
        solutions.gemini.Task42 s = new solutions.gemini.Task42();
        assertEquals(EXPECTED_NORMAL, s.incrList(NORMAL_INPUT),
            "Assertion Roulette Fix: Failed to increment all positive elements in the list by 1.");
    }

    @Test
    @DisplayName("Gemini: incrList should increment negative values to zero/positive")
    void gemini_incrList_negativeValues() {
        solutions.gemini.Task42 s = new solutions.gemini.Task42();
        assertEquals(EXPECTED_NEGATIVE, s.incrList(NEGATIVE_INPUT),
            "Assertion Roulette Fix: Failed to correctly increment negative and zero elements.");
    }

    @Test
    @DisplayName("Gemini: incrList should return empty list when given empty list")
    void gemini_incrList_emptyList() {
        solutions.gemini.Task42 s = new solutions.gemini.Task42();
        assertTrue(s.incrList(EMPTY_INPUT).isEmpty(),
            "Assertion Roulette Fix: Method should return an empty list when input is empty.");
    }

    @Test
    @DisplayName("Gemini: incrList should handle null input safely")
    void gemini_incrList_nullInput() {
        solutions.gemini.Task42 s = new solutions.gemini.Task42();
        assertTrue(s.incrList(NULL_INPUT).isEmpty(),
            "Assertion Roulette Fix: Method should safely return an empty list when input is null.");
    }

    // ==================== CLAUDE IMPROVED TESTS ====================

    @Test
    @DisplayName("Claude: incrList should increment normal positive values")
    void claude_incrList_normalValues() {
        solutions.claude.Task42 s = new solutions.claude.Task42();
        assertEquals(CL_EXPECTED_NORMAL, s.incrList(CL_NORMAL_INPUT),
            "Normal positive values increment failed, expected " + CL_EXPECTED_NORMAL);
    }

    @Test
    @DisplayName("Claude: incrList should increment all negative values")
    void claude_incrList_allNegative() {
        solutions.claude.Task42 s = new solutions.claude.Task42();
        assertEquals(CL_EXPECTED_NEGATIVE, s.incrList(CL_NEGATIVE_INPUT),
            "All negative values increment failed, expected " + CL_EXPECTED_NEGATIVE);
    }

    @Test
    @DisplayName("Claude: incrList should increment list containing zero")
    void claude_incrList_containsZero() {
        solutions.claude.Task42 s = new solutions.claude.Task42();
        assertEquals(CL_EXPECTED_MIXED, s.incrList(CL_MIXED_INPUT),
            "List containing zero increment failed, expected " + CL_EXPECTED_MIXED);
    }

    @Test
    @DisplayName("Claude: incrList should increment single element list")
    void claude_incrList_singleElement() {
        solutions.claude.Task42 s = new solutions.claude.Task42();
        assertEquals(CL_EXPECTED_SINGLE, s.incrList(CL_SINGLE_INPUT),
            "Single element increment failed, expected " + CL_EXPECTED_SINGLE);
    }

    @Test
    @DisplayName("Claude: incrList should increment large values correctly")
    void claude_incrList_largeValues() {
        solutions.claude.Task42 s = new solutions.claude.Task42();
        assertEquals(CL_EXPECTED_LARGE, s.incrList(CL_LARGE_INPUT),
            "Large values increment failed, expected " + CL_EXPECTED_LARGE);
    }

    @Test
    @DisplayName("Claude: incrList should increment negative and zero values correctly")
    void claude_incrList_negativeAndZero() {
        solutions.claude.Task42 s = new solutions.claude.Task42();
        assertEquals(CL_EXPECTED_NEG_ZERO, s.incrList(CL_NEG_ZERO_INPUT),
            "Negative and zero increment failed, expected " + CL_EXPECTED_NEG_ZERO);
    }

    @Test
    @DisplayName("Claude: incrList should return empty list for empty input")
    void claude_incrList_emptyList() {
        solutions.claude.Task42 s = new solutions.claude.Task42();
        assertTrue(s.incrList(new ArrayList<>()).isEmpty(),
            "Empty list input should return empty list");
    }
}