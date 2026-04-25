package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task46ImprovedTest {

    // ==================== GEMINI IMPROVED TESTS ====================

    // --- Base Case Constants ---
    // These constants represent the hardcoded initial values of the fib4 sequence.
    // Testing these guarantees that the true branches of the if-statements are covered.
    private static final int BASE_INDEX_0 = 0;
    private static final int EXPECTED_BASE_VAL_0 = 0;

    private static final int BASE_INDEX_1 = 1;
    private static final int EXPECTED_BASE_VAL_1 = 0;

    private static final int BASE_INDEX_2 = 2;
    private static final int EXPECTED_BASE_VAL_2 = 2;

    private static final int BASE_INDEX_3 = 3;
    private static final int EXPECTED_BASE_VAL_3 = 0;

    // --- Recursive Case Constants ---
    // These constants represent values further down the sequence to verify
    // the iterative loop logic computes the correct sum of the previous four terms.
    private static final int INDEX_5 = 5;
    private static final int EXPECTED_FIB4_5 = 4;

    private static final int INDEX_8 = 8;
    private static final int EXPECTED_FIB4_8 = 28;

    private static final int INDEX_10 = 10;
    private static final int EXPECTED_FIB4_10 = 104;

    private static final int INDEX_12 = 12;
    private static final int EXPECTED_FIB4_12 = 386;


    @Test
    @DisplayName("Gemini: Should correctly return predefined values for the initial base cases (n=0 to n=3)")
    void gemini_fib4_baseCases() {
        solutions.gemini.Task46 s = new solutions.gemini.Task46();

        assertEquals(EXPECTED_BASE_VAL_0, s.fib4(BASE_INDEX_0),
                "fib4(0) must return the base case value of 0");

        assertEquals(EXPECTED_BASE_VAL_1, s.fib4(BASE_INDEX_1),
                "fib4(1) must return the base case value of 0");

        assertEquals(EXPECTED_BASE_VAL_2, s.fib4(BASE_INDEX_2),
                "fib4(2) must return the base case value of 2");

        assertEquals(EXPECTED_BASE_VAL_3, s.fib4(BASE_INDEX_3),
                "fib4(3) must return the base case value of 0");
    }

    @Test
    @DisplayName("Gemini: Should accurately compute larger sequence numbers using the iterative logic")
    void gemini_fib4_recursiveCases() {
        solutions.gemini.Task46 s = new solutions.gemini.Task46();

        assertEquals(EXPECTED_FIB4_5, s.fib4(INDEX_5),
                "fib4(5) computation failed");

        assertEquals(EXPECTED_FIB4_8, s.fib4(INDEX_8),
                "fib4(8) computation failed");

        assertEquals(EXPECTED_FIB4_10, s.fib4(INDEX_10),
                "fib4(10) computation failed");

        assertEquals(EXPECTED_FIB4_12, s.fib4(INDEX_12),
                "fib4(12) computation failed");
    }

    // ==================== CLAUDE IMPROVED TESTS ====================

    // ── Base case inputs: each targets one specific if-branch ─────────────
    // fib4(0) -> 0   [line 20: if (n == 0)]
    // fib4(1) -> 0   [line 21: if (n == 1)]
    // fib4(2) -> 2   [line 22: if (n == 2)]
    // fib4(3) -> 0   [line 23: if (n == 3)]

    // Input: 0 — chosen to trigger the first base-case guard (n == 0)
    private static final int CLAUDE_INPUT_BASE_CASE_0 = 0;

    // Input: 1 — chosen to trigger the second base-case guard (n == 1)
    private static final int CLAUDE_INPUT_BASE_CASE_1 = 1;

    // Input: 2 — chosen to trigger the third base-case guard (n == 2)
    private static final int CLAUDE_INPUT_BASE_CASE_2 = 2;

    // Input: 3 — chosen to trigger the fourth base-case guard (n == 3)
    private static final int CLAUDE_INPUT_BASE_CASE_3 = 3;

    // ── Iterative case inputs: each triggers all four false branches ───────
    private static final int CLAUDE_INPUT_ITERATIVE_N5 = 5;
    private static final int CLAUDE_INPUT_ITERATIVE_N8 = 8;
    private static final int CLAUDE_INPUT_ITERATIVE_N10 = 10;
    private static final int CLAUDE_INPUT_ITERATIVE_N12 = 12;

    // ── Expected values for base cases ───────────────────────────────────
    private static final int CLAUDE_EXPECTED_BASE_CASE_0 = 0;
    private static final int CLAUDE_EXPECTED_BASE_CASE_1 = 0;
    private static final int CLAUDE_EXPECTED_BASE_CASE_2 = 2;
    private static final int CLAUDE_EXPECTED_BASE_CASE_3 = 0;

    // ── Expected values for iterative cases ──────────────────────────────
    // Sequence: n:    0  1  2   3   4   5    6    7    8     9    10    11    12
    //           fib4: 0, 0, 2,  0,  2,  4,   8,  14,  28,  54,  104,  200,  386

    // Expected: 4 — fib4(5) = fib4(4)+fib4(3)+fib4(2)+fib4(1) = 2+0+2+0
    private static final int CLAUDE_EXPECTED_N5 = 4;

    // Expected: 28 — fib4(8) = fib4(7)+fib4(6)+fib4(5)+fib4(4) = 14+8+4+2
    private static final int CLAUDE_EXPECTED_N8 = 28;

    // Expected: 104 — fib4(10) = fib4(9)+fib4(8)+fib4(7)+fib4(6) = 54+28+14+8
    private static final int CLAUDE_EXPECTED_N10 = 104;

    // Expected: 386 — fib4(12) = fib4(11)+fib4(10)+fib4(9)+fib4(8) = 200+104+54+28
    private static final int CLAUDE_EXPECTED_N12 = 386;

    // ── Base case tests: each covers one true branch ───────

    @Test
    @DisplayName("Claude: n=0 → 0 (covers true branch of line 20: if n==0; first seed value)")
    void claude_fib4_baseCaseN0() {
        solutions.claude.Task46 s = new solutions.claude.Task46();
        assertEquals(CLAUDE_EXPECTED_BASE_CASE_0, s.fib4(CLAUDE_INPUT_BASE_CASE_0),
            "fib4(0) must return the first seed value 0 via the n==0 guard");
    }

    @Test
    @DisplayName("Claude: n=1 → 0 (covers true branch of line 21: if n==1; second seed value)")
    void claude_fib4_baseCaseN1() {
        solutions.claude.Task46 s = new solutions.claude.Task46();
        assertEquals(CLAUDE_EXPECTED_BASE_CASE_1, s.fib4(CLAUDE_INPUT_BASE_CASE_1),
            "fib4(1) must return the second seed value 0 via the n==1 guard");
    }

    @Test
    @DisplayName("Claude: n=2 → 2 (covers true branch of line 22: if n==2; only non-zero seed)")
    void claude_fib4_baseCaseN2() {
        solutions.claude.Task46 s = new solutions.claude.Task46();
        assertEquals(CLAUDE_EXPECTED_BASE_CASE_2, s.fib4(CLAUDE_INPUT_BASE_CASE_2),
            "fib4(2) must return the unique non-zero seed value 2 via the n==2 guard");
    }

    @Test
    @DisplayName("Claude: n=3 → 0 (covers true branch of line 23: if n==3; fourth seed value)")
    void claude_fib4_baseCaseN3() {
        solutions.claude.Task46 s = new solutions.claude.Task46();
        assertEquals(CLAUDE_EXPECTED_BASE_CASE_3, s.fib4(CLAUDE_INPUT_BASE_CASE_3),
            "fib4(3) must return the fourth seed value 0 via the n==3 guard");
    }

    // ── Iterative case tests: all four if-guards evaluate to false ─────────

    @Test
    @DisplayName("Claude: n=5 → 4 (covers all false branches; minimum iterative case)")
    void claude_fib4_iterativeN5() {
        solutions.claude.Task46 s = new solutions.claude.Task46();
        assertEquals(CLAUDE_EXPECTED_N5, s.fib4(CLAUDE_INPUT_ITERATIVE_N5),
            "fib4(5) = fib4(4)+fib4(3)+fib4(2)+fib4(1) = 2+0+2+0 = 4");
    }

    @Test
    @DisplayName("Claude: n=8 → 28 (mid-range iterative; verifies multi-cycle accumulation)")
    void claude_fib4_iterativeN8() {
        solutions.claude.Task46 s = new solutions.claude.Task46();
        assertEquals(CLAUDE_EXPECTED_N8, s.fib4(CLAUDE_INPUT_ITERATIVE_N8),
            "fib4(8) = fib4(7)+fib4(6)+fib4(5)+fib4(4) = 14+8+4+2 = 28");
    }

    @Test
    @DisplayName("Claude: n=10 → 104 (round-number iterative; verifies correctness past n=8)")
    void claude_fib4_iterativeN10() {
        solutions.claude.Task46 s = new solutions.claude.Task46();
        assertEquals(CLAUDE_EXPECTED_N10, s.fib4(CLAUDE_INPUT_ITERATIVE_N10),
            "fib4(10) = fib4(9)+fib4(8)+fib4(7)+fib4(6) = 54+28+14+8 = 104");
    }

    @Test
    @DisplayName("Claude: n=12 → 386 (larger iterative; stress-tests extended sliding window)")
    void claude_fib4_iterativeN12() {
        solutions.claude.Task46 s = new solutions.claude.Task46();
        assertEquals(CLAUDE_EXPECTED_N12, s.fib4(CLAUDE_INPUT_ITERATIVE_N12),
            "fib4(12) = fib4(11)+fib4(10)+fib4(9)+fib4(8) = 200+104+54+28 = 386");
    }
}
