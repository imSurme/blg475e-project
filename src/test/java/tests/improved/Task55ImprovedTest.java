package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task55ImprovedTest {

    // ==================== CLAUDE IMPROVED TESTS ====================

    @Test
    @DisplayName("Claude Task55: testNonPositiveInput")
    void testClaudeNonPositiveInput() {
        solutions.claude.Task55 task = new solutions.claude.Task55();
        assertEquals(0, task.fib(0));
        assertEquals(0, task.fib(-1));
        assertEquals(0, task.fib(-100));
    }

    // ==================== GEMINI IMPROVED TESTS ====================

    @Test
    @DisplayName("Gemini Task55: testFib_FullBranchCoverage")
    void testGeminiFib_FullBranchCoverage() {
        solutions.gemini.Task55 task = new solutions.gemini.Task55();

        assertEquals(0, task.fib(0), "Fibonacci of 0 should be 0");
        assertEquals(1, task.fib(1), "Fibonacci of 1 should be 1 (Boundary)");
        assertEquals(-1, task.fib(-1), "Fibonacci of -1 should return -1 based on the method logic");

        assertEquals(1, task.fib(2), "Fibonacci of 2 should be 1");
        assertEquals(5, task.fib(5), "Fibonacci of 5 should be 5");
    }
}
