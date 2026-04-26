package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task60ImprovedTest {

    // ==================== GEMINI CONSTANTS ====================

    private static final int INPUT_NORMAL    = 5;
    private static final int EXPECTED_NORMAL = 15;

    private static final int INPUT_ONE       = 1;
    private static final int EXPECTED_ONE    = 1;

    private static final int INPUT_ZERO      = 0;
    private static final int EXPECTED_ZERO   = 0;

    private static final int INPUT_LARGE     = 100;
    private static final int EXPECTED_LARGE  = 5050;

    // ==================== CLAUDE CONSTANTS ====================

    private static final int CL_INPUT_TWO      = 2;
    private static final int CL_EXPECTED_TWO   = 3;

    private static final int CL_INPUT_TEN      = 10;
    private static final int CL_EXPECTED_TEN   = 55;

    private static final int CL_INPUT_FIFTY    = 50;
    private static final int CL_EXPECTED_FIFTY = 1275;

    private static final int CL_INPUT_ZERO     = 0;
    private static final int CL_EXPECTED_ZERO  = 0;

    private static final int CL_INPUT_ONE      = 1;
    private static final int CL_EXPECTED_ONE   = 1;

    private static final int CL_INPUT_NORMAL   = 5;
    private static final int CL_EXPECTED_NORMAL = 15;

    private static final int CL_INPUT_LARGE    = 100;
    private static final int CL_EXPECTED_LARGE = 5050;

    // ==================== GEMINI IMPROVED TESTS ====================

    @Test
    @DisplayName("Gemini: sumToN should compute sum for normal positive value")
    void gemini_sumToN_normalValue() {
        solutions.gemini.Task60 s = new solutions.gemini.Task60();
        assertEquals(EXPECTED_NORMAL, s.sumToN(INPUT_NORMAL),
            "Assertion Roulette Fix: Gauss formula failed for N=5.");
    }

    @Test
    @DisplayName("Gemini: sumToN should compute sum when N is one")
    void gemini_sumToN_one() {
        solutions.gemini.Task60 s = new solutions.gemini.Task60();
        assertEquals(EXPECTED_ONE, s.sumToN(INPUT_ONE),
            "Assertion Roulette Fix: Gauss formula failed for boundary case N=1.");
    }

    @Test
    @DisplayName("Gemini: sumToN should return zero when N is zero")
    void gemini_sumToN_zero() {
        solutions.gemini.Task60 s = new solutions.gemini.Task60();
        assertEquals(EXPECTED_ZERO, s.sumToN(INPUT_ZERO),
            "Assertion Roulette Fix: Gauss formula failed for boundary case N=0.");
    }

    @Test
    @DisplayName("Gemini: sumToN should compute sum for large N")
    void gemini_sumToN_largeNumber() {
        solutions.gemini.Task60 s = new solutions.gemini.Task60();
        assertEquals(EXPECTED_LARGE, s.sumToN(INPUT_LARGE),
            "Assertion Roulette Fix: Gauss formula failed for a large number (N=100).");
    }

    // ==================== CLAUDE IMPROVED TESTS ====================

    @Test
    @DisplayName("Claude: sumToN should return zero when N is zero")
    void claude_sumToN_zero() {
        solutions.claude.Task60 s = new solutions.claude.Task60();
        assertEquals(CL_EXPECTED_ZERO, s.sumToN(CL_INPUT_ZERO),
            "sumToN failed for N=0, expected " + CL_EXPECTED_ZERO);
    }

    @Test
    @DisplayName("Claude: sumToN should return one when N is one")
    void claude_sumToN_one() {
        solutions.claude.Task60 s = new solutions.claude.Task60();
        assertEquals(CL_EXPECTED_ONE, s.sumToN(CL_INPUT_ONE),
            "sumToN failed for N=1, expected " + CL_EXPECTED_ONE);
    }

    @Test
    @DisplayName("Claude: sumToN should compute sum for N equals two")
    void claude_sumToN_two() {
        solutions.claude.Task60 s = new solutions.claude.Task60();
        assertEquals(CL_EXPECTED_TWO, s.sumToN(CL_INPUT_TWO),
            "sumToN failed for N=2, expected " + CL_EXPECTED_TWO);
    }

    @Test
    @DisplayName("Claude: sumToN should compute sum for normal positive value")
    void claude_sumToN_normalValue() {
        solutions.claude.Task60 s = new solutions.claude.Task60();
        assertEquals(CL_EXPECTED_NORMAL, s.sumToN(CL_INPUT_NORMAL),
            "sumToN failed for N=5, expected " + CL_EXPECTED_NORMAL);
    }

    @Test
    @DisplayName("Claude: sumToN should compute sum for N equals ten")
    void claude_sumToN_ten() {
        solutions.claude.Task60 s = new solutions.claude.Task60();
        assertEquals(CL_EXPECTED_TEN, s.sumToN(CL_INPUT_TEN),
            "sumToN failed for N=10, expected " + CL_EXPECTED_TEN);
    }

    @Test
    @DisplayName("Claude: sumToN should compute sum for N equals fifty")
    void claude_sumToN_fifty() {
        solutions.claude.Task60 s = new solutions.claude.Task60();
        assertEquals(CL_EXPECTED_FIFTY, s.sumToN(CL_INPUT_FIFTY),
            "sumToN failed for N=50, expected " + CL_EXPECTED_FIFTY);
    }

    @Test
    @DisplayName("Claude: sumToN should compute sum for large N")
    void claude_sumToN_largeNumber() {
        solutions.claude.Task60 s = new solutions.claude.Task60();
        assertEquals(CL_EXPECTED_LARGE, s.sumToN(CL_INPUT_LARGE),
            "sumToN failed for N=100, expected " + CL_EXPECTED_LARGE);
    }
}