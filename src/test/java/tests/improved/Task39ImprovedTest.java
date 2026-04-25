package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task39ImprovedTest {

    // ==================== GEMINI IMPROVED TESTS ====================

    // --- Input Index Constants ---
    private static final int FIRST_INDEX = 1;
    private static final int SECOND_INDEX = 2;
    private static final int THIRD_INDEX = 3;
    private static final int FOURTH_INDEX = 4;
    private static final int FIFTH_INDEX = 5;
    private static final int SIXTH_INDEX = 6;

    // --- Expected Values & Documentation ---

    // The 1st Fibonacci number that is also prime is 2.
    // Sequence: 1, 1, [2]
    private static final int EXPECTED_PRIME_FIB_1 = 2;

    // The 2nd Fibonacci number that is also prime is 3.
    // Sequence: 1, 1, 2, [3]
    private static final int EXPECTED_PRIME_FIB_2 = 3;

    // The 3rd Fibonacci number that is also prime is 5.
    // Sequence: 1, 1, 2, 3, [5]
    private static final int EXPECTED_PRIME_FIB_3 = 5;

    // The 4th Fibonacci number that is also prime is 13.
    // Sequence: 1, 1, 2, 3, 5, 8, [13]
    private static final int EXPECTED_PRIME_FIB_4 = 13;

    // The 5th Fibonacci number that is also prime is 89.
    // (Note: 21, 34, and 55 are skipped because they are not prime)
    private static final int EXPECTED_PRIME_FIB_5 = 89;

    // The 6th Fibonacci number that is also prime is 233.
    // (Note: 144 is skipped because it is not prime)
    private static final int EXPECTED_PRIME_FIB_6 = 233;


    @Test
    @DisplayName("Gemini: Should correctly identify the first three, easily computable prime Fibonacci numbers")
    void gemini_primeFib_firstThreePrimes() {
        solutions.gemini.Task39 s = new solutions.gemini.Task39();

        assertEquals(EXPECTED_PRIME_FIB_1, s.primeFib(FIRST_INDEX),
                "The 1st prime Fibonacci number must be 2");

        assertEquals(EXPECTED_PRIME_FIB_2, s.primeFib(SECOND_INDEX),
                "The 2nd prime Fibonacci number must be 3");

        assertEquals(EXPECTED_PRIME_FIB_3, s.primeFib(THIRD_INDEX),
                "The 3rd prime Fibonacci number must be 5");
    }

    @Test
    @DisplayName("Gemini: Should correctly identify larger prime Fibonacci numbers skipping non-prime sequence values")
    void gemini_primeFib_largerPrimes() {
        solutions.gemini.Task39 s = new solutions.gemini.Task39();

        assertEquals(EXPECTED_PRIME_FIB_4, s.primeFib(FOURTH_INDEX),
                "The 4th prime Fibonacci number must be 13");

        assertEquals(EXPECTED_PRIME_FIB_5, s.primeFib(FIFTH_INDEX),
                "The 5th prime Fibonacci number must be 89");

        assertEquals(EXPECTED_PRIME_FIB_6, s.primeFib(SIXTH_INDEX),
                "The 6th prime Fibonacci number must be 233");
    }

    // ==================== CLAUDE IMPROVED TESTS ====================

    // ── Ordinal inputs: which prime Fibonacci number to retrieve ──────────

    private static final int CLAUDE_RANK_1ST = 1;
    private static final int CLAUDE_RANK_2ND = 2;
    private static final int CLAUDE_RANK_3RD = 3;
    private static final int CLAUDE_RANK_4TH = 4;
    private static final int CLAUDE_RANK_5TH = 5;
    private static final int CLAUDE_RANK_6TH = 6;
    private static final int CLAUDE_RANK_7TH = 7;
    private static final int CLAUDE_RANK_8TH = 8;
    private static final int CLAUDE_RANK_9TH = 9;
    private static final int CLAUDE_RANK_10TH = 10;

    // ── Expected values: the prime Fibonacci sequence ─────────────────────
    // The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    // Prime Fibonacci numbers: 2, 3, 5, 13, 89, 233, 1597, 28657, 514229, 433494437...

    // 1st prime Fibonacci: 2 — the smallest Fibonacci number that is prime;
    // it is both the only even prime and the 3rd Fibonacci number (index 3)
    private static final int CLAUDE_PRIME_FIB_1ST = 2;

    // 2nd prime Fibonacci: 3 — the 4th Fibonacci number (index 4);
    private static final int CLAUDE_PRIME_FIB_2ND = 3;

    // 3rd prime Fibonacci: 5 — the 5th Fibonacci number (index 5);
    private static final int CLAUDE_PRIME_FIB_3RD = 5;

    // 4th prime Fibonacci: 13 — the 7th Fibonacci number (index 7);
    private static final int CLAUDE_PRIME_FIB_4TH = 13;

    // 5th prime Fibonacci: 89 — the 11th Fibonacci number (index 11);
    private static final int CLAUDE_PRIME_FIB_5TH = 89;

    // 6th prime Fibonacci: 233 — the 13th Fibonacci number (index 13);
    private static final int CLAUDE_PRIME_FIB_6TH = 233;

    // 7th prime Fibonacci: 1597 — the 17th Fibonacci number (index 17);
    private static final int CLAUDE_PRIME_FIB_7TH = 1597;

    // 8th prime Fibonacci: 28657 — the 23rd Fibonacci number (index 23);
    private static final int CLAUDE_PRIME_FIB_8TH = 28657;

    // 9th prime Fibonacci: 514229 — the 29th Fibonacci number (index 29);
    private static final int CLAUDE_PRIME_FIB_9TH = 514229;

    // 10th prime Fibonacci: 433494437 — the 43rd Fibonacci number (index 43);
    private static final int CLAUDE_PRIME_FIB_10TH = 433494437;

    @Test
    @DisplayName("Claude: Rank 1 → 2 (smallest Fibonacci prime; the only even prime)")
    void claude_primeFib_rank1() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(CLAUDE_PRIME_FIB_1ST, s.primeFib(CLAUDE_RANK_1ST),
            "The 1st prime Fibonacci number must be 2");
    }

    @Test
    @DisplayName("Claude: Rank 2 → 3 (4th Fibonacci number; prime with no non-trivial divisors)")
    void claude_primeFib_rank2() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(CLAUDE_PRIME_FIB_2ND, s.primeFib(CLAUDE_RANK_2ND),
            "The 2nd prime Fibonacci number must be 3");
    }

    @Test
    @DisplayName("Claude: Rank 3 → 5 (5th Fibonacci number; confirms 8 is correctly skipped as 2³)")
    void claude_primeFib_rank3() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(CLAUDE_PRIME_FIB_3RD, s.primeFib(CLAUDE_RANK_3RD),
            "The 3rd prime Fibonacci number must be 5; 8 must be excluded as composite");
    }

    @Test
    @DisplayName("Claude: Rank 4 → 13 (7th Fibonacci number; confirms 21=3×7 is correctly skipped)")
    void claude_primeFib_rank4() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(CLAUDE_PRIME_FIB_4TH, s.primeFib(CLAUDE_RANK_4TH),
            "The 4th prime Fibonacci number must be 13; 21 must be excluded as composite");
    }

    @Test
    @DisplayName("Claude: Rank 5 → 89 (11th Fibonacci number; confirms long gap of composites is skipped)")
    void claude_primeFib_rank5() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(CLAUDE_PRIME_FIB_5TH, s.primeFib(CLAUDE_RANK_5TH),
            "The 5th prime Fibonacci number must be 89");
    }

    @Test
    @DisplayName("Claude: Rank 6 → 233 (13th Fibonacci number; first triple-digit prime Fibonacci)")
    void claude_primeFib_rank6() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(CLAUDE_PRIME_FIB_6TH, s.primeFib(CLAUDE_RANK_6TH),
            "The 6th prime Fibonacci number must be 233");
    }

    @Test
    @DisplayName("Claude: Rank 7 → 1597 (17th Fibonacci number; first four-digit prime Fibonacci)")
    void claude_primeFib_rank7() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(CLAUDE_PRIME_FIB_7TH, s.primeFib(CLAUDE_RANK_7TH),
            "The 7th prime Fibonacci number must be 1597");
    }

    @Test
    @DisplayName("Claude: Rank 8 → 28657 (23rd Fibonacci number; five-digit prime stress test)")
    void claude_primeFib_rank8() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(CLAUDE_PRIME_FIB_8TH, s.primeFib(CLAUDE_RANK_8TH),
            "The 8th prime Fibonacci number must be 28657");
    }

    @Test
    @DisplayName("Claude: Rank 9 → 514229 (29th Fibonacci number; six-digit prime verifies scaling)")
    void claude_primeFib_rank9() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(CLAUDE_PRIME_FIB_9TH, s.primeFib(CLAUDE_RANK_9TH),
            "The 9th prime Fibonacci number must be 514229");
    }

    @Test
    @DisplayName("Claude: Rank 10 → 433494437 (43rd Fibonacci number; nine-digit prime stress test)")
    void claude_primeFib_rank10() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(CLAUDE_PRIME_FIB_10TH, s.primeFib(CLAUDE_RANK_10TH),
            "The 10th prime Fibonacci number must be 433494437");
    }
}
