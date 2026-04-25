package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Base tests for Task 27 (flipCase) from HumanEval dataset.
 * Tests both Gemini and Claude generated code.
 */
class Task27Test {

    // ==================== GEMINI TESTS ====================
    
    @Test
    @DisplayName("Gemini: flipCase(\"\") should return \"\"")
    void gemini_flipCase_empty() {
        solutions.gemini.Task27 s = new solutions.gemini.Task27();
        assertEquals("", s.flipCase(""));
    }

    @Test
    @DisplayName("Gemini: flipCase(\"Hello!\") should return \"hELLO!\"")
    void gemini_flipCase_hello() {
        solutions.gemini.Task27 s = new solutions.gemini.Task27();
        assertEquals("hELLO!", s.flipCase("Hello!"));
    }

    @Test
    @DisplayName("Gemini: flipCase with long sentence")
    void gemini_flipCase_sentence() {
        solutions.gemini.Task27 s = new solutions.gemini.Task27();
        assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", 
                     s.flipCase("These violent delights have violent ends"));
    }

    // ==================== CLAUDE TESTS ====================
    
    @Test
    @DisplayName("Claude: flipCase(\"\") should return \"\"")
    void claude_flipCase_empty() {
        solutions.claude.Task27 s = new solutions.claude.Task27();
        assertEquals("", s.flipCase(""));
    }

    @Test
    @DisplayName("Claude: flipCase(\"Hello!\") should return \"hELLO!\"")
    void claude_flipCase_hello() {
        solutions.claude.Task27 s = new solutions.claude.Task27();
        assertEquals("hELLO!", s.flipCase("Hello!"));
    }

    @Test
    @DisplayName("Claude: flipCase with long sentence")
    void claude_flipCase_sentence() {
        solutions.claude.Task27 s = new solutions.claude.Task27();
        assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", 
                     s.flipCase("These violent delights have violent ends"));
    }
}
