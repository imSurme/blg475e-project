package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task31ImprovedTest {

    // ==================== CLAUDE IMPROVED TESTS ====================

    @Test
    @DisplayName("Claude Task31: testCompositeOddNumber")
    void testClaudeCompositeOddNumber() {
        solutions.claude.Task31 task = new solutions.claude.Task31();
        assertEquals(false, task.isPrime(9));
        assertEquals(false, task.isPrime(15));
        assertEquals(false, task.isPrime(25));
    }

    // ==================== GEMINI IMPROVED TESTS ====================

    @Test
    @DisplayName("Gemini Task31: testIsPrime_FullBranchCoverage")
    void testGeminiIsPrime_FullBranchCoverage() {
        solutions.gemini.Task31 task = new solutions.gemini.Task31();

        // 1. THE MISSING BRANCH: Odd composite number
        // Bypasses the i=2 check, hits the 'if' condition when i=3
        assertEquals(false, task.isPrime(9), "9 is an odd composite number, should return false");

        // 2. Branch: n < 2 (Hits the first if-statement)
        assertEquals(false, task.isPrime(1), "1 is not prime");
        assertEquals(false, task.isPrime(-5), "Negative numbers are not prime");

        // 3. Branch: Even composite number
        assertEquals(false, task.isPrime(4), "4 is an even composite number, should return false");

        // 4. Branch: Loop condition becomes false immediately
        assertEquals(true, task.isPrime(2), "2 is a prime number");

        // 5. Branch: Loop executes but never hits the internal 'if' condition
        assertEquals(true, task.isPrime(5), "5 is a prime number");
    }
}
