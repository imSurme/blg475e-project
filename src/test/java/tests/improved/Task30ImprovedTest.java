package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task30ImprovedTest {

    // ==================== GEMINI IMPROVED TESTS ====================

    // --- Test Data Constants & Documentation ---

    // 1. Negative Values
    // Chosen to verify that numbers strictly less than zero are correctly identified
    // and filtered out of the final list.
    private static final int STANDARD_NEG_1 = -1;
    private static final int STANDARD_NEG_2 = -2;
    private static final int LARGE_NEG = -10;

    // 2. Positive Values
    // Chosen to verify that numbers strictly greater than zero are correctly identified
    // and retained in the final list.
    private static final int STANDARD_POS_1 = 4;
    private static final int STANDARD_POS_2 = 5;
    private static final int STANDARD_POS_3 = 6;
    private static final int LARGE_POS = 123;

    // 3. Boundary Value (Zero)
    // Chosen because zero is a critical edge case. It is strictly non-positive
    // (neither positive nor negative) and must be filtered out.
    private static final int BOUNDARY_ZERO = 0;


    @Test
    @DisplayName("Gemini: Should filter out standard negative numbers and retain positive numbers")
    void gemini_getPositive_mixedStandardNumbers() {
        solutions.gemini.Task30 s = new solutions.gemini.Task30();

        List<Integer> input = Arrays.asList(STANDARD_NEG_1, STANDARD_NEG_2, STANDARD_POS_1, STANDARD_POS_2, STANDARD_POS_3);
        List<Integer> expected = Arrays.asList(STANDARD_POS_1, STANDARD_POS_2, STANDARD_POS_3);

        assertEquals(expected,
                s.getPositive(input),
                "Failed to remove standard negative numbers from the list");
    }

    @Test
    @DisplayName("Gemini: Should strictly exclude zero and handle numbers of larger magnitudes")
    void gemini_getPositive_withZeroAndLargeNumbers() {
        solutions.gemini.Task30 s = new solutions.gemini.Task30();

        // Testing the crucial edge case of 0 alongside larger positive/negative values
        List<Integer> input = Arrays.asList(BOUNDARY_ZERO, LARGE_POS, LARGE_NEG);
        List<Integer> expected = Collections.singletonList(LARGE_POS);

        assertEquals(expected,
                s.getPositive(input),
                "Failed to exclude 0 or properly evaluate larger magnitude numbers");
    }

    @Test
    @DisplayName("Gemini: Should return an empty list when provided only with non-positive numbers")
    void gemini_getPositive_onlyNonPositives() {
        solutions.gemini.Task30 s = new solutions.gemini.Task30();

        List<Integer> input = Arrays.asList(STANDARD_NEG_1, BOUNDARY_ZERO, LARGE_NEG);
        List<Integer> expected = Collections.emptyList();

        assertEquals(expected,
                s.getPositive(input),
                "A list of only negatives and zeroes must result in an empty list");
    }

    // ==================== CLAUDE IMPROVED TESTS ====================

    // ── Test case 1: mixed negatives and positives ────────────────────────

    // Input negatives: -1, -2 — chosen as small negative integers to
    // represent values that must be excluded from the output entirely
    private static final int CLAUDE_NEG_ONE = -1;
    private static final int CLAUDE_NEG_TWO = -2;

    // Input positives: 4, 5, 6 — chosen as small positive integers to
    // represent values that must be preserved in the output in original order
    private static final int CLAUDE_POS_FOUR = 4;
    private static final int CLAUDE_POS_FIVE = 5;
    private static final int CLAUDE_POS_SIX = 6;

    // ── Test case 2: list containing zero ────────────────────────────────

    // Input zero: 0 — chosen specifically to verify the boundary condition
    // that zero is NOT considered positive and must be excluded from output
    private static final int CLAUDE_ZERO = 0;

    // Input large positive: 123 — chosen to verify a non-trivial positive
    // value far from the zero boundary is correctly retained
    private static final int CLAUDE_POS_LARGE = 123;

    // ── Test case 3: all negative values ─────────────────────────────────

    // Input: -3, -7, -15 — chosen as a set of varied negative integers to
    // verify that a list with no positives returns a completely empty list
    private static final int CLAUDE_NEG_THREE = -3;
    private static final int CLAUDE_NEG_SEVEN = -7;
    private static final int CLAUDE_NEG_FIFTEEN = -15;

    // ── Test case 4: all positive values ─────────────────────────────────

    // Input: 1, 2, 3 — chosen as the smallest positive integers to verify
    // that a list with no negatives is returned completely unchanged
    private static final int CLAUDE_POS_ONE = 1;
    private static final int CLAUDE_POS_TWO = 2;
    private static final int CLAUDE_POS_THREE = 3;

    // ── Test case 6: zero boundary with negatives ─────────────────────────

    // Input: -1, 0, 1 — chosen as the tightest possible boundary triplet to
    // verify the exact cutoff: -1 excluded, 0 excluded, 1 included
    private static final int CLAUDE_NEG_BOUNDARY = -1;
    private static final int CLAUDE_ZERO_BOUNDARY = 0;
    private static final int CLAUDE_POS_BOUNDARY = 1;

    @Test
    @DisplayName("Claude: Mixed negatives and positives → only positive values retained in original order")
    void claude_getPositive_mixedNegativesAndPositives() {
        solutions.claude.Task30 s = new solutions.claude.Task30();
        List<Integer> input = Arrays.asList(CLAUDE_NEG_ONE, CLAUDE_NEG_TWO, CLAUDE_POS_FOUR, CLAUDE_POS_FIVE, CLAUDE_POS_SIX);
        List<Integer> expected = Arrays.asList(CLAUDE_POS_FOUR, CLAUDE_POS_FIVE, CLAUDE_POS_SIX);
        assertEquals(expected, s.getPositive(input),
            "Negative values must be excluded; positives must be kept in original order");
    }

    @Test
    @DisplayName("Claude: Zero and positive → zero excluded as it is not strictly positive")
    void claude_getPositive_zeroIsNotPositive() {
        solutions.claude.Task30 s = new solutions.claude.Task30();
        List<Integer> input = Arrays.asList(CLAUDE_ZERO, CLAUDE_POS_LARGE);
        List<Integer> expected = Arrays.asList(CLAUDE_POS_LARGE);
        assertEquals(expected, s.getPositive(input),
            "Zero is not a positive number and must be filtered out");
    }

    @Test
    @DisplayName("Claude: All negatives → empty list returned as no element qualifies")
    void claude_getPositive_allNegatives() {
        solutions.claude.Task30 s = new solutions.claude.Task30();
        List<Integer> input = Arrays.asList(CLAUDE_NEG_THREE, CLAUDE_NEG_SEVEN, CLAUDE_NEG_FIFTEEN);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, s.getPositive(input),
            "A list of only negative values must produce a completely empty result");
    }

    @Test
    @DisplayName("Claude: All positives → entire list returned unchanged as every element qualifies")
    void claude_getPositive_allPositives() {
        solutions.claude.Task30 s = new solutions.claude.Task30();
        List<Integer> input = Arrays.asList(CLAUDE_POS_ONE, CLAUDE_POS_TWO, CLAUDE_POS_THREE);
        List<Integer> expected = Arrays.asList(CLAUDE_POS_ONE, CLAUDE_POS_TWO, CLAUDE_POS_THREE);
        assertEquals(expected, s.getPositive(input),
            "A list of only positive values must be returned fully intact");
    }

    @Test
    @DisplayName("Claude: Empty list → empty list returned with no errors")
    void claude_getPositive_emptyList() {
        solutions.claude.Task30 s = new solutions.claude.Task30();
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, s.getPositive(input),
            "An empty input list must produce an empty result without throwing");
    }

    @Test
    @DisplayName("Claude: Boundary triplet [-1, 0, 1] → only 1 retained, confirming strict greater-than-zero cutoff")
    void claude_getPositive_zeroBoundaryTriplet() {
        solutions.claude.Task30 s = new solutions.claude.Task30();
        List<Integer> input = Arrays.asList(CLAUDE_NEG_BOUNDARY, CLAUDE_ZERO_BOUNDARY, CLAUDE_POS_BOUNDARY);
        List<Integer> expected = Arrays.asList(CLAUDE_POS_BOUNDARY);
        assertEquals(expected, s.getPositive(input),
            "Only values strictly greater than zero qualify; -1 and 0 must both be excluded");
    }
}
