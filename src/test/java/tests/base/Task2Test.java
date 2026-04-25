package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Base tests for Task 2 (truncateNumber) from HumanEval dataset.
 * Tests both Gemini and Claude generated code.
 */
class Task2Test {

    // ==================== GEMINI TESTS ====================
    
    @Test
    @DisplayName("Gemini: truncateNumber(3.5) should return 0.5")
    void gemini_truncateNumber_3_5() {
        solutions.gemini.Task2 s = new solutions.gemini.Task2();
        assertEquals(0.5, s.truncateNumber(3.5), 1e-6);
    }

    @Test
    @DisplayName("Gemini: truncateNumber(1.33) should return 0.33")
    void gemini_truncateNumber_1_33() {
        solutions.gemini.Task2 s = new solutions.gemini.Task2();
        assertEquals(0.33, s.truncateNumber(1.33), 1e-6);
    }

    @Test
    @DisplayName("Gemini: truncateNumber(123.456) should return 0.456")
    void gemini_truncateNumber_123_456() {
        solutions.gemini.Task2 s = new solutions.gemini.Task2();
        assertEquals(0.456, s.truncateNumber(123.456), 1e-6);
    }

    // ==================== CLAUDE TESTS ====================
    
    @Test
    @DisplayName("Claude: truncateNumber(3.5) should return 0.5")
    void claude_truncateNumber_3_5() {
        solutions.claude.Task2 s = new solutions.claude.Task2();
        assertEquals(0.5, s.truncateNumber(3.5), 1e-6);
    }

    @Test
    @DisplayName("Claude: truncateNumber(1.33) should return 0.33")
    void claude_truncateNumber_1_33() {
        solutions.claude.Task2 s = new solutions.claude.Task2();
        assertEquals(0.33, s.truncateNumber(1.33), 1e-6);
    }

    @Test
    @DisplayName("Claude: truncateNumber(123.456) should return 0.456")
    void claude_truncateNumber_123_456() {
        solutions.claude.Task2 s = new solutions.claude.Task2();
        assertEquals(0.456, s.truncateNumber(123.456), 1e-6);
    }
}
