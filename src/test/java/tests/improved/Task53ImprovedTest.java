package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task53ImprovedTest {

    // ==================== GEMINI CONSTANTS ====================

    private static final int POS_X             = 2;
    private static final int POS_Y             = 3;
    private static final int EXPECTED_POS_SUM  = 5;

    private static final int NEG_X             = -2;
    private static final int NEG_Y             = -3;
    private static final int EXPECTED_NEG_SUM  = -5;

    private static final int MIXED_X           = 2;
    private static final int MIXED_Y           = -3;
    private static final int EXPECTED_MIXED_SUM = -1;

    private static final int ZERO_X            = 0;
    private static final int ZERO_Y            = 0;
    private static final int EXPECTED_ZERO_SUM = 0;

    // ==================== CLAUDE CONSTANTS ====================

    private static final int CL_POS_A          = 2;
    private static final int CL_POS_B          = 3;
    private static final int CL_EXPECTED_POS   = 5;

    private static final int CL_NEG_A          = -2;
    private static final int CL_NEG_B          = -3;
    private static final int CL_EXPECTED_NEG   = -5;

    private static final int CL_MIXED_A        = 2;
    private static final int CL_MIXED_B        = -3;
    private static final int CL_EXPECTED_MIXED = -1;

    private static final int CL_ZERO_A         = 0;
    private static final int CL_ZERO_B         = 0;
    private static final int CL_EXPECTED_ZERO  = 0;

    private static final int CL_ONE_ZERO_A     = 7;
    private static final int CL_ONE_ZERO_B     = 0;
    private static final int CL_EXPECTED_ONE_ZERO = 7;

    private static final int CL_LARGE_A        = 1000000;
    private static final int CL_LARGE_B        = 1000000;
    private static final int CL_EXPECTED_LARGE = 2000000;

    private static final int CL_OPPOSITE_A     = 100;
    private static final int CL_OPPOSITE_B     = -100;
    private static final int CL_EXPECTED_OPPOSITE = 0;

    // ==================== GEMINI IMPROVED TESTS ====================

    @Test
    @DisplayName("Gemini: add should calculate sum of two positive numbers")
    void gemini_add_positiveNumbers() {
        solutions.gemini.Task53 s = new solutions.gemini.Task53();
        assertEquals(EXPECTED_POS_SUM, s.add(POS_X, POS_Y),
            "Assertion Roulette Fix: Failed to calculate the sum of two positive numbers.");
    }

    @Test
    @DisplayName("Gemini: add should calculate sum of two negative numbers")
    void gemini_add_negativeNumbers() {
        solutions.gemini.Task53 s = new solutions.gemini.Task53();
        assertEquals(EXPECTED_NEG_SUM, s.add(NEG_X, NEG_Y),
            "Assertion Roulette Fix: Failed to calculate the sum of two negative numbers.");
    }

    @Test
    @DisplayName("Gemini: add should calculate sum of mixed sign numbers")
    void gemini_add_mixedNumbers() {
        solutions.gemini.Task53 s = new solutions.gemini.Task53();
        assertEquals(EXPECTED_MIXED_SUM, s.add(MIXED_X, MIXED_Y),
            "Assertion Roulette Fix: Failed to calculate the sum of a positive and a negative number.");
    }

    @Test
    @DisplayName("Gemini: add should return zero when both are zero")
    void gemini_add_zeros() {
        solutions.gemini.Task53 s = new solutions.gemini.Task53();
        assertEquals(EXPECTED_ZERO_SUM, s.add(ZERO_X, ZERO_Y),
            "Assertion Roulette Fix: Failed to return 0 when adding two zeros.");
    }

    // ==================== CLAUDE IMPROVED TESTS ====================

    @Test
    @DisplayName("Claude: add should calculate sum of two positive numbers")
    void claude_add_positiveNumbers() {
        solutions.claude.Task53 s = new solutions.claude.Task53();
        assertEquals(CL_EXPECTED_POS, s.add(CL_POS_A, CL_POS_B),
            "Sum of two positive numbers failed, expected " + CL_EXPECTED_POS);
    }

    @Test
    @DisplayName("Claude: add should calculate sum of two negative numbers")
    void claude_add_negativeNumbers() {
        solutions.claude.Task53 s = new solutions.claude.Task53();
        assertEquals(CL_EXPECTED_NEG, s.add(CL_NEG_A, CL_NEG_B),
            "Sum of two negative numbers failed, expected " + CL_EXPECTED_NEG);
    }

    @Test
    @DisplayName("Claude: add should calculate sum of mixed sign numbers")
    void claude_add_mixedNumbers() {
        solutions.claude.Task53 s = new solutions.claude.Task53();
        assertEquals(CL_EXPECTED_MIXED, s.add(CL_MIXED_A, CL_MIXED_B),
            "Sum of mixed sign numbers failed, expected " + CL_EXPECTED_MIXED);
    }

    @Test
    @DisplayName("Claude: add should return zero when both are zero")
    void claude_add_zeros() {
        solutions.claude.Task53 s = new solutions.claude.Task53();
        assertEquals(CL_EXPECTED_ZERO, s.add(CL_ZERO_A, CL_ZERO_B),
            "Sum of two zeros failed, expected " + CL_EXPECTED_ZERO);
    }

    @Test
    @DisplayName("Claude: add should return correct value when one operand is zero")
    void claude_add_oneZero() {
        solutions.claude.Task53 s = new solutions.claude.Task53();
        assertEquals(CL_EXPECTED_ONE_ZERO, s.add(CL_ONE_ZERO_A, CL_ONE_ZERO_B),
            "Sum with one zero operand failed, expected " + CL_EXPECTED_ONE_ZERO);
    }

    @Test
    @DisplayName("Claude: add should handle large positive numbers")
    void claude_add_largeNumbers() {
        solutions.claude.Task53 s = new solutions.claude.Task53();
        assertEquals(CL_EXPECTED_LARGE, s.add(CL_LARGE_A, CL_LARGE_B),
            "Sum of large numbers failed, expected " + CL_EXPECTED_LARGE);
    }

    @Test
    @DisplayName("Claude: add should return zero for opposite values")
    void claude_add_oppositeValues() {
        solutions.claude.Task53 s = new solutions.claude.Task53();
        assertEquals(CL_EXPECTED_OPPOSITE, s.add(CL_OPPOSITE_A, CL_OPPOSITE_B),
            "Sum of opposite values failed, expected " + CL_EXPECTED_OPPOSITE);
    }
}