package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Base tests for Task 48 from HumanEval dataset.
 * Tests both Gemini and Claude generated code.
 */
class Task48Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: isPalindrome test case 1")
    void gemini_isPalindrome_1() {
        solutions.gemini.Task48 s = new solutions.gemini.Task48();
        assertTrue(s.isPalindrome(""));
    }

    @Test
    @DisplayName("Gemini: isPalindrome test case 2")
    void gemini_isPalindrome_2() {
        solutions.gemini.Task48 s = new solutions.gemini.Task48();
        assertTrue(s.isPalindrome("aba"));
    }

    @Test
    @DisplayName("Gemini: isPalindrome test case 3")
    void gemini_isPalindrome_3() {
        solutions.gemini.Task48 s = new solutions.gemini.Task48();
        assertTrue(s.isPalindrome("aaaaa"));
    }

    @Test
    @DisplayName("Gemini: isPalindrome test case 4")
    void gemini_isPalindrome_4() {
        solutions.gemini.Task48 s = new solutions.gemini.Task48();
        assertFalse(s.isPalindrome("zbcd"));
    }

    @Test
    @DisplayName("Gemini: isPalindrome test case 5")
    void gemini_isPalindrome_5() {
        solutions.gemini.Task48 s = new solutions.gemini.Task48();
        assertTrue(s.isPalindrome("xywyx"));
    }

    @Test
    @DisplayName("Gemini: isPalindrome test case 6")
    void gemini_isPalindrome_6() {
        solutions.gemini.Task48 s = new solutions.gemini.Task48();
        assertFalse(s.isPalindrome("xywyz"));
    }

    @Test
    @DisplayName("Gemini: isPalindrome test case 7")
    void gemini_isPalindrome_7() {
        solutions.gemini.Task48 s = new solutions.gemini.Task48();
        assertFalse(s.isPalindrome("xywzx"));
    }

    // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: isPalindrome test case 1")
    void claude_isPalindrome_1() {
        solutions.claude.Task48 s = new solutions.claude.Task48();
        assertTrue(s.isPalindrome(""));
    }

    @Test
    @DisplayName("Claude: isPalindrome test case 2")
    void claude_isPalindrome_2() {
        solutions.claude.Task48 s = new solutions.claude.Task48();
        assertTrue(s.isPalindrome("aba"));
    }

    @Test
    @DisplayName("Claude: isPalindrome test case 3")
    void claude_isPalindrome_3() {
        solutions.claude.Task48 s = new solutions.claude.Task48();
        assertTrue(s.isPalindrome("aaaaa"));
    }

    @Test
    @DisplayName("Claude: isPalindrome test case 4")
    void claude_isPalindrome_4() {
        solutions.claude.Task48 s = new solutions.claude.Task48();
        assertFalse(s.isPalindrome("zbcd"));
    }

    @Test
    @DisplayName("Claude: isPalindrome test case 5")
    void claude_isPalindrome_5() {
        solutions.claude.Task48 s = new solutions.claude.Task48();
        assertTrue(s.isPalindrome("xywyx"));
    }

    @Test
    @DisplayName("Claude: isPalindrome test case 6")
    void claude_isPalindrome_6() {
        solutions.claude.Task48 s = new solutions.claude.Task48();
        assertFalse(s.isPalindrome("xywyz"));
    }

    @Test
    @DisplayName("Claude: isPalindrome test case 7")
    void claude_isPalindrome_7() {
        solutions.claude.Task48 s = new solutions.claude.Task48();
        assertFalse(s.isPalindrome("xywzx"));
    }

}
