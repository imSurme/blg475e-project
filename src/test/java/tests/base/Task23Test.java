package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Base tests for Task 23 (strlen) from HumanEval dataset.
 * Tests both Gemini and Claude generated code.
 */
class Task23Test {

    // ==================== GEMINI TESTS ====================
    
    @Test
    @DisplayName("Gemini: strlen(\"\") should return 0")
    void gemini_strlen_empty() {
        solutions.gemini.Task23 s = new solutions.gemini.Task23();
        assertEquals(0, s.strlen(""));
    }

    @Test
    @DisplayName("Gemini: strlen(\"x\") should return 1")
    void gemini_strlen_single() {
        solutions.gemini.Task23 s = new solutions.gemini.Task23();
        assertEquals(1, s.strlen("x"));
    }

    @Test
    @DisplayName("Gemini: strlen(\"asdasnakj\") should return 9")
    void gemini_strlen_multiple() {
        solutions.gemini.Task23 s = new solutions.gemini.Task23();
        assertEquals(9, s.strlen("asdasnakj"));
    }

    // ==================== CLAUDE TESTS ====================
    
    @Test
    @DisplayName("Claude: strlen(\"\") should return 0")
    void claude_strlen_empty() {
        solutions.claude.Task23 s = new solutions.claude.Task23();
        assertEquals(0, s.strlen(""));
    }

    @Test
    @DisplayName("Claude: strlen(\"x\") should return 1")
    void claude_strlen_single() {
        solutions.claude.Task23 s = new solutions.claude.Task23();
        assertEquals(1, s.strlen("x"));
    }

    @Test
    @DisplayName("Claude: strlen(\"asdasnakj\") should return 9")
    void claude_strlen_multiple() {
        solutions.claude.Task23 s = new solutions.claude.Task23();
        assertEquals(9, s.strlen("asdasnakj"));
    }
}
