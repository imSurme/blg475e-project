package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: makePalindrome('') should return ''")
    void gemini_makePalindrome_empty() {
        solutions.gemini.Task10 s = new solutions.gemini.Task10();
        assertEquals("", s.makePalindrome(""));
    }

    @Test
    @DisplayName("Gemini: makePalindrome('x') should return 'x'")
    void gemini_makePalindrome_singleChar() {
        solutions.gemini.Task10 s = new solutions.gemini.Task10();
        assertEquals("x", s.makePalindrome("x"));
    }

    @Test
    @DisplayName("Gemini: makePalindrome('xyz') should return 'xyzyx'")
    void gemini_makePalindrome_xyz() {
        solutions.gemini.Task10 s = new solutions.gemini.Task10();
        assertEquals("xyzyx", s.makePalindrome("xyz"));
    }

    @Test
    @DisplayName("Gemini: makePalindrome('xyx') should return 'xyx'")
    void gemini_makePalindrome_alreadyPalindrome() {
        solutions.gemini.Task10 s = new solutions.gemini.Task10();
        assertEquals("xyx", s.makePalindrome("xyx"));
    }

    @Test
    @DisplayName("Gemini: makePalindrome('jerry') should return 'jerryrrej'")
    void gemini_makePalindrome_jerry() {
        solutions.gemini.Task10 s = new solutions.gemini.Task10();
        assertEquals("jerryrrej", s.makePalindrome("jerry"));
    }

    // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: makePalindrome('') should return ''")
    void claude_makePalindrome_empty() {
        solutions.claude.Task10 s = new solutions.claude.Task10();
        assertEquals("", s.makePalindrome(""));
    }

    @Test
    @DisplayName("Claude: makePalindrome('x') should return 'x'")
    void claude_makePalindrome_singleChar() {
        solutions.claude.Task10 s = new solutions.claude.Task10();
        assertEquals("x", s.makePalindrome("x"));
    }

    @Test
    @DisplayName("Claude: makePalindrome('xyz') should return 'xyzyx'")
    void claude_makePalindrome_xyz() {
        solutions.claude.Task10 s = new solutions.claude.Task10();
        assertEquals("xyzyx", s.makePalindrome("xyz"));
    }

    @Test
    @DisplayName("Claude: makePalindrome('xyx') should return 'xyx'")
    void claude_makePalindrome_alreadyPalindrome() {
        solutions.claude.Task10 s = new solutions.claude.Task10();
        assertEquals("xyx", s.makePalindrome("xyx"));
    }

    @Test
    @DisplayName("Claude: makePalindrome('jerry') should return 'jerryrrej'")
    void claude_makePalindrome_jerry() {
        solutions.claude.Task10 s = new solutions.claude.Task10();
        assertEquals("jerryrrej", s.makePalindrome("jerry"));
    }
}
