package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Task48ManualTest {

    @Test
    @DisplayName("Gemini: empty string")
    void gemini_emptyString() {
        solutions.gemini.Task48 s = new solutions.gemini.Task48();
        assertTrue(s.isPalindrome(""));
    }

    @Test
    @DisplayName("Claude: empty string")
    void claude_emptyString() {
        solutions.claude.Task48 s = new solutions.claude.Task48();
        assertTrue(s.isPalindrome(""));
    }
}