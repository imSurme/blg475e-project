package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class Task89Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: encrypt should shift lowercase letters by 4")
    void gemini_encrypt_lowercaseLetters() {
        solutions.gemini.Task89 s = new solutions.gemini.Task89();
        assertEquals("fghi", s.encrypt("bcde"));
    }

    @Test
    @DisplayName("Gemini: encrypt should shift uppercase letters and wrap around alphabet")
    void gemini_encrypt_uppercaseAndWrap() {
        solutions.gemini.Task89 s = new solutions.gemini.Task89();
        assertEquals("Bcde", s.encrypt("Xyza"));
    }

    @Test
    @DisplayName("Gemini: encrypt should ignore non-alphabet characters")
    void gemini_encrypt_mixedWithSymbols() {
        solutions.gemini.Task89 s = new solutions.gemini.Task89();
        assertEquals("e!f@", s.encrypt("a!b@"));
    }

    @Test
    @DisplayName("Gemini: encrypt should handle null input safely")
    void gemini_encrypt_nullString() {
        solutions.gemini.Task89 s = new solutions.gemini.Task89();
        assertNull(s.encrypt(null));
    }
// ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: encrypt should shift lowercase letters by 4")
    void claude_encrypt_lowercaseLetters() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals("fghi", s.encrypt("bcde"));
    }

    @Test
    @DisplayName("Claude: encrypt should shift uppercase letters and wrap around alphabet")
    void claude_encrypt_uppercaseAndWrap() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals("Bcde", s.encrypt("Xyza"));
    }

    @Test
    @DisplayName("Claude: encrypt should ignore non-alphabet characters")
    void claude_encrypt_mixedWithSymbols() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals("e!f@", s.encrypt("a!b@"));
    }

    @Test
    @DisplayName("Claude: encrypt should wrap around end of lowercase alphabet")
    void claude_encrypt_lowercaseWrapAround() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals("lm", s.encrypt("hi"));
    }

    @Test
    @DisplayName("Claude: encrypt should return empty string for empty input")
    void claude_encrypt_emptyString() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals("", s.encrypt(""));
    }

    @Test
    @DisplayName("Claude: encrypt should handle mixed case letters")
    void claude_encrypt_mixedCase() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals("Efgh", s.encrypt("Abcd"));
    }

    @Test
    @DisplayName("Claude: encrypt should handle full alphabet wrap for z and Z")
    void claude_encrypt_zWrapAround() {
        solutions.claude.Task89 s = new solutions.claude.Task89();
        assertEquals("dD", s.encrypt("zZ"));
    }
}