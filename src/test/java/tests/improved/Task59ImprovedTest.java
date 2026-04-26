package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task59ImprovedTest {

   // ==================== GEMINI CONSTANTS (int) ====================

    private static final int INPUT_PRIME           = 29;
    private static final int EXPECTED_PRIME        = 29;

    private static final int INPUT_COMPOSITE_1     = 15;
    private static final int EXPECTED_COMPOSITE_1  = 5;

    private static final int INPUT_COMPOSITE_2     = 21;
    private static final int EXPECTED_COMPOSITE_2  = 7;

    private static final int INPUT_POWER_OF_TWO    = 64;
    private static final int EXPECTED_POWER_OF_TWO = 2;

    private static final int INPUT_LARGE           = 13195;
    private static final int EXPECTED_LARGE        = 29;

    // ==================== CLAUDE CONSTANTS (long) ====================

    private static final long CL_INPUT_PRIME        = 29L;
    private static final long CL_EXPECTED_PRIME     = 29L;

    private static final long CL_INPUT_COMP_1       = 15L;
    private static final long CL_EXPECTED_COMP_1    = 5L;

    private static final long CL_INPUT_COMP_2       = 21L;
    private static final long CL_EXPECTED_COMP_2    = 7L;

    private static final long CL_INPUT_POW_TWO      = 64L;
    private static final long CL_EXPECTED_POW_TWO   = 2L;

    private static final long CL_INPUT_TWO          = 2L;
    private static final long CL_EXPECTED_TWO       = 2L;

    private static final long CL_INPUT_THREE        = 3L;
    private static final long CL_EXPECTED_THREE     = 3L;

    private static final long CL_INPUT_PRODUCT      = 2L * 3L * 5L * 13L;
    private static final long CL_EXPECTED_PRODUCT   = 13L;

    private static final long CL_INPUT_LARGE        = 13195L;
    private static final long CL_EXPECTED_LARGE     = 29L;

    // ==================== GEMINI IMPROVED TESTS ====================

    @Test
    @DisplayName("Gemini: largestPrimeFactor should return the number itself if prime")
    void gemini_largestPrimeFactor_primeNumber() {
        solutions.gemini.Task59 s = new solutions.gemini.Task59();
        assertEquals(EXPECTED_PRIME, s.largestPrimeFactor(INPUT_PRIME),
            "Assertion Roulette Fix: Failed to return the prime number itself as its largest factor.");
    }

    @Test
    @DisplayName("Gemini: largestPrimeFactor should find largest factor for 15")
    void gemini_largestPrimeFactor_compositeNumber_15() {
        solutions.gemini.Task59 s = new solutions.gemini.Task59();
        assertEquals(EXPECTED_COMPOSITE_1, s.largestPrimeFactor(INPUT_COMPOSITE_1),
            "Assertion Roulette Fix: Failed to find the largest prime factor for 15.");
    }

    @Test
    @DisplayName("Gemini: largestPrimeFactor should find largest factor for 21")
    void gemini_largestPrimeFactor_compositeNumber_21() {
        solutions.gemini.Task59 s = new solutions.gemini.Task59();
        assertEquals(EXPECTED_COMPOSITE_2, s.largestPrimeFactor(INPUT_COMPOSITE_2),
            "Assertion Roulette Fix: Failed to find the largest prime factor for 21.");
    }

    @Test
    @DisplayName("Gemini: largestPrimeFactor should find factor for power of two")
    void gemini_largestPrimeFactor_powerOfTwo() {
        solutions.gemini.Task59 s = new solutions.gemini.Task59();
        assertEquals(EXPECTED_POWER_OF_TWO, s.largestPrimeFactor(INPUT_POWER_OF_TWO),
            "Assertion Roulette Fix: Failed to return 2 for a power of two.");
    }

    @Test
    @DisplayName("Gemini: largestPrimeFactor should handle large composite numbers")
    void gemini_largestPrimeFactor_largeComposite() {
        solutions.gemini.Task59 s = new solutions.gemini.Task59();
        assertEquals(EXPECTED_LARGE, s.largestPrimeFactor(INPUT_LARGE),
            "Assertion Roulette Fix: Failed to correctly compute the largest prime factor for 13195.");
    }

    // ==================== CLAUDE IMPROVED TESTS ====================

    @Test
    @DisplayName("Claude: largestPrimeFactor should return the number itself if prime")
    void claude_largestPrimeFactor_primeNumber() {
        solutions.claude.Task59 s = new solutions.claude.Task59();
        assertEquals(CL_EXPECTED_PRIME, s.largestPrimeFactor(CL_INPUT_PRIME),
            "Prime number should return itself, expected " + CL_EXPECTED_PRIME);
    }

    @Test
    @DisplayName("Claude: largestPrimeFactor should find largest factor for 15")
    void claude_largestPrimeFactor_composite_15() {
        solutions.claude.Task59 s = new solutions.claude.Task59();
        assertEquals(CL_EXPECTED_COMP_1, s.largestPrimeFactor(CL_INPUT_COMP_1),
            "Largest prime factor of 15 failed, expected " + CL_EXPECTED_COMP_1);
    }

    @Test
    @DisplayName("Claude: largestPrimeFactor should find largest factor for 21")
    void claude_largestPrimeFactor_composite_21() {
        solutions.claude.Task59 s = new solutions.claude.Task59();
        assertEquals(CL_EXPECTED_COMP_2, s.largestPrimeFactor(CL_INPUT_COMP_2),
            "Largest prime factor of 21 failed, expected " + CL_EXPECTED_COMP_2);
    }

    @Test
    @DisplayName("Claude: largestPrimeFactor should return 2 for power of two")
    void claude_largestPrimeFactor_powerOfTwo() {
        solutions.claude.Task59 s = new solutions.claude.Task59();
        assertEquals(CL_EXPECTED_POW_TWO, s.largestPrimeFactor(CL_INPUT_POW_TWO),
            "Power of two failed, expected " + CL_EXPECTED_POW_TWO);
    }

    @Test
    @DisplayName("Claude: largestPrimeFactor should return 2 for smallest prime")
    void claude_largestPrimeFactor_two() {
        solutions.claude.Task59 s = new solutions.claude.Task59();
        assertEquals(CL_EXPECTED_TWO, s.largestPrimeFactor(CL_INPUT_TWO),
            "Smallest prime failed, expected " + CL_EXPECTED_TWO);
    }

    @Test
    @DisplayName("Claude: largestPrimeFactor should return 3 for number 3")
    void claude_largestPrimeFactor_three() {
        solutions.claude.Task59 s = new solutions.claude.Task59();
        assertEquals(CL_EXPECTED_THREE, s.largestPrimeFactor(CL_INPUT_THREE),
            "Number 3 failed, expected " + CL_EXPECTED_THREE);
    }

    @Test
    @DisplayName("Claude: largestPrimeFactor should find largest factor for product of primes")
    void claude_largestPrimeFactor_productOfPrimes() {
        solutions.claude.Task59 s = new solutions.claude.Task59();
        assertEquals(CL_EXPECTED_PRODUCT, s.largestPrimeFactor(CL_INPUT_PRODUCT),
            "Product of primes failed, expected " + CL_EXPECTED_PRODUCT);
    }

    @Test
    @DisplayName("Claude: largestPrimeFactor should handle large composite numbers")
    void claude_largestPrimeFactor_largeComposite() {
        solutions.claude.Task59 s = new solutions.claude.Task59();
        assertEquals(CL_EXPECTED_LARGE, s.largestPrimeFactor(CL_INPUT_LARGE),
            "Large composite number failed, expected " + CL_EXPECTED_LARGE);
    }
}