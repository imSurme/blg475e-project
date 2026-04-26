package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task129ImprovedTest {

    // ==================== GEMINI CONSTANTS ====================

    private static final int[] MIXED_SIGNS_ARRAY    = {1, -2, 3, -1, -2};
    private static final int   EXPECTED_MIXED_SIGNS = -3;

    private static final int[] ALL_POSITIVE_ARRAY   = {1, 2, 3};
    private static final int   EXPECTED_ALL_POSITIVE = 1;

    private static final int[] ALL_NEGATIVE_ARRAY   = {-1, -2, -3};
    private static final int   EXPECTED_ALL_NEGATIVE = -6;

    private static final int[] EMPTY_ARRAY          = {};
    private static final int   EXPECTED_BOUNDARY    = 0;

    // ==================== CLAUDE CONSTANTS ====================

    private static final List<Integer> CL_MIXED_SIGNS      = Arrays.asList(1, -2, 3, -1, -2);
    private static final int           CL_EXPECTED_MIXED   = -3;

    private static final List<Integer> CL_ALL_POSITIVE     = Arrays.asList(1, 2, 3);
    private static final int           CL_EXPECTED_POSITIVE = 1;

    private static final List<Integer> CL_ALL_NEGATIVE     = Arrays.asList(-1, -2, -3);
    private static final int           CL_EXPECTED_NEGATIVE = -6;

    private static final List<Integer> CL_SINGLE_NEGATIVE  = Arrays.asList(-5);
    private static final int           CL_EXPECTED_SINGLE_NEG = -5;

    private static final List<Integer> CL_SINGLE_POSITIVE  = Arrays.asList(7);
    private static final int           CL_EXPECTED_SINGLE_POS = 7;

    private static final List<Integer> CL_CONTIGUOUS       = Arrays.asList(2, 3, -4, -1, 2);
    private static final int           CL_EXPECTED_CONTIGUOUS = -5;

    private static final List<Integer> CL_ONLY_ZERO        = Arrays.asList(0);
    private static final int           CL_EXPECTED_ZERO    = 0;

    // ==================== GEMINI IMPROVED TESTS ====================

    @Test
    @DisplayName("Gemini: minPath should find minimum subarray sum with mixed signs")
    void gemini_minPath_mixedSigns() {
        solutions.gemini.Task129 s = new solutions.gemini.Task129();
        assertEquals(EXPECTED_MIXED_SIGNS, s.minPath(MIXED_SIGNS_ARRAY),
            "Assertion Roulette Fix: Failed to calculate minimum sum for mixed positive/negative numbers.");
    }

    @Test
    @DisplayName("Gemini: minPath should return smallest single element if all positive")
    void gemini_minPath_allPositive() {
        solutions.gemini.Task129 s = new solutions.gemini.Task129();
        assertEquals(EXPECTED_ALL_POSITIVE, s.minPath(ALL_POSITIVE_ARRAY),
            "Assertion Roulette Fix: Failed to identify smallest single element in an all-positive array.");
    }

    @Test
    @DisplayName("Gemini: minPath should return sum of all if all negative")
    void gemini_minPath_allNegative() {
        solutions.gemini.Task129 s = new solutions.gemini.Task129();
        assertEquals(EXPECTED_ALL_NEGATIVE, s.minPath(ALL_NEGATIVE_ARRAY),
            "Assertion Roulette Fix: Failed to sum all elements in an all-negative array.");
    }

    @Test
    @DisplayName("Gemini: minPath should safely handle empty or null arrays")
    void gemini_minPath_emptyOrNull() {
        solutions.gemini.Task129 s = new solutions.gemini.Task129();
        assertEquals(EXPECTED_BOUNDARY, s.minPath(EMPTY_ARRAY),
            "Assertion Roulette Fix: Empty array should return 0.");
        assertEquals(EXPECTED_BOUNDARY, s.minPath(null),
            "Assertion Roulette Fix: Null array should return 0.");
    }

    // ==================== CLAUDE IMPROVED TESTS ====================

    @Test
    @DisplayName("Claude: minPath should find minimum subarray sum with mixed signs")
    void claude_minPath_mixedSigns() {
        solutions.claude.Task129 s = new solutions.claude.Task129();
        assertEquals(CL_EXPECTED_MIXED, s.minPath(CL_MIXED_SIGNS),
            "Mixed signs minimum subarray sum failed, expected " + CL_EXPECTED_MIXED);
    }

    @Test
    @DisplayName("Claude: minPath should return smallest single element if all positive")
    void claude_minPath_allPositive() {
        solutions.claude.Task129 s = new solutions.claude.Task129();
        assertEquals(CL_EXPECTED_POSITIVE, s.minPath(CL_ALL_POSITIVE),
            "All positive list minimum failed, expected " + CL_EXPECTED_POSITIVE);
    }

    @Test
    @DisplayName("Claude: minPath should return sum of all if all negative")
    void claude_minPath_allNegative() {
        solutions.claude.Task129 s = new solutions.claude.Task129();
        assertEquals(CL_EXPECTED_NEGATIVE, s.minPath(CL_ALL_NEGATIVE),
            "All negative list sum failed, expected " + CL_EXPECTED_NEGATIVE);
    }

    @Test
    @DisplayName("Claude: minPath should return single negative element")
    void claude_minPath_singleNegative() {
        solutions.claude.Task129 s = new solutions.claude.Task129();
        assertEquals(CL_EXPECTED_SINGLE_NEG, s.minPath(CL_SINGLE_NEGATIVE),
            "Single negative element failed, expected " + CL_EXPECTED_SINGLE_NEG);
    }

    @Test
    @DisplayName("Claude: minPath should return single positive element")
    void claude_minPath_singlePositive() {
        solutions.claude.Task129 s = new solutions.claude.Task129();
        assertEquals(CL_EXPECTED_SINGLE_POS, s.minPath(CL_SINGLE_POSITIVE),
            "Single positive element failed, expected " + CL_EXPECTED_SINGLE_POS);
    }

    @Test
    @DisplayName("Claude: minPath should find minimum contiguous subarray sum")
    void claude_minPath_contiguousSubarray() {
        solutions.claude.Task129 s = new solutions.claude.Task129();
        assertEquals(CL_EXPECTED_CONTIGUOUS, s.minPath(CL_CONTIGUOUS),
            "Contiguous subarray minimum sum failed, expected " + CL_EXPECTED_CONTIGUOUS);
    }

    @Test
    @DisplayName("Claude: minPath should return zero for list containing only zero")
    void claude_minPath_onlyZero() {
        solutions.claude.Task129 s = new solutions.claude.Task129();
        assertEquals(CL_EXPECTED_ZERO, s.minPath(CL_ONLY_ZERO),
            "Single zero element failed, expected " + CL_EXPECTED_ZERO);
    }
}