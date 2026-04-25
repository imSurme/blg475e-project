package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class Task59Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: largestPrimeFactor should return the number itself if prime")
    void gemini_largestPrimeFactor_primeNumber() {
        solutions.gemini.Task59 s = new solutions.gemini.Task59();
        assertEquals(29, s.largestPrimeFactor(29));
    }

    @Test
    @DisplayName("Gemini: largestPrimeFactor should find factor for composite number")
    void gemini_largestPrimeFactor_compositeNumber() {
        solutions.gemini.Task59 s = new solutions.gemini.Task59();
        assertEquals(5, s.largestPrimeFactor(15));
        assertEquals(7, s.largestPrimeFactor(21));
    }

    @Test
    @DisplayName("Gemini: largestPrimeFactor should find factor for power of two")
    void gemini_largestPrimeFactor_powerOfTwo() {
        solutions.gemini.Task59 s = new solutions.gemini.Task59();
        assertEquals(2, s.largestPrimeFactor(64));
    }

    @Test
    @DisplayName("Gemini: largestPrimeFactor should handle large composite numbers")
    void gemini_largestPrimeFactor_largeComposite() {
        solutions.gemini.Task59 s = new solutions.gemini.Task59();
        assertEquals(29, s.largestPrimeFactor(13195));
    }
// ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: largestPrimeFactor should return the number itself if prime")
    void claude_largestPrimeFactor_primeNumber() {
        solutions.claude.Task59 s = new solutions.claude.Task59();
        assertEquals(29, s.largestPrimeFactor(29));
    }

    @Test
    @DisplayName("Claude: largestPrimeFactor should find factor for composite number")
    void claude_largestPrimeFactor_compositeNumber() {
        solutions.claude.Task59 s = new solutions.claude.Task59();
        assertEquals(5, s.largestPrimeFactor(15));
        assertEquals(7, s.largestPrimeFactor(21));
    }

    @Test
    @DisplayName("Claude: largestPrimeFactor should find factor for power of two")
    void claude_largestPrimeFactor_powerOfTwo() {
        solutions.claude.Task59 s = new solutions.claude.Task59();
        assertEquals(2, s.largestPrimeFactor(64));
    }

    @Test
    @DisplayName("Claude: largestPrimeFactor should handle large composite numbers")
    void claude_largestPrimeFactor_largeComposite() {
        solutions.claude.Task59 s = new solutions.claude.Task59();
        assertEquals(29, s.largestPrimeFactor(13195));
    }

    @Test
    @DisplayName("Claude: largestPrimeFactor should return 2 for smallest prime")
    void claude_largestPrimeFactor_two() {
        solutions.claude.Task59 s = new solutions.claude.Task59();
        assertEquals(2, s.largestPrimeFactor(2));
    }

    @Test
    @DisplayName("Claude: largestPrimeFactor should return 3 for number 3")
    void claude_largestPrimeFactor_three() {
        solutions.claude.Task59 s = new solutions.claude.Task59();
        assertEquals(3, s.largestPrimeFactor(3));
    }

    @Test
    @DisplayName("Claude: largestPrimeFactor should find largest factor for product of primes")
    void claude_largestPrimeFactor_productOfPrimes() {
        solutions.claude.Task59 s = new solutions.claude.Task59();
        assertEquals(13, s.largestPrimeFactor(2 * 3 * 5 * 13));
    }
}