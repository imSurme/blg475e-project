package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task31ManualTest {

    @Test
    @DisplayName("Gemini: extreme negative number")
    void gemini_extremeNegative() {
        solutions.gemini.Task31 s = new solutions.gemini.Task31();
        assertFalse(s.isPrime(Integer.MIN_VALUE));
    }

    @Test
    @DisplayName("Claude: extreme negative number")
    void claude_extremeNegative() {
        solutions.claude.Task31 s = new solutions.claude.Task31();
        assertFalse(s.isPrime(Integer.MIN_VALUE));
    }

    @Test
    @DisplayName("Both: maximum integer (prime validation)")
    void both_maxInteger() {
        solutions.gemini.Task31 g = new solutions.gemini.Task31();
        solutions.claude.Task31 c = new solutions.claude.Task31();
        // 2147483647 is a prime number
        assertTrue(g.isPrime(Integer.MAX_VALUE));
        assertTrue(c.isPrime(Integer.MAX_VALUE));
    }
}