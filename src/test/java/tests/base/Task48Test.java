package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Task48Test {

    @Test
    @DisplayName("Gemini: isPalindrome")
    void gemini_isPalindrome() {
        solutions.gemini.Task48 s = new solutions.gemini.Task48();
        assertTrue(s.isPalindrome(""));
        assertTrue(s.isPalindrome("aba"));
        assertTrue(s.isPalindrome("aaaaa"));
        assertFalse(s.isPalindrome("zbcd"));
        assertTrue(s.isPalindrome("xywyx"));
        assertFalse(s.isPalindrome("xywyz"));
        assertFalse(s.isPalindrome("xywzx"));
    }

    @Test
    @DisplayName("Claude: isPalindrome")
    void claude_isPalindrome() {
        solutions.claude.Task48 s = new solutions.claude.Task48();
        assertTrue(s.isPalindrome(""));
        assertTrue(s.isPalindrome("aba"));
        assertTrue(s.isPalindrome("aaaaa"));
        assertFalse(s.isPalindrome("zbcd"));
        assertTrue(s.isPalindrome("xywyx"));
        assertFalse(s.isPalindrome("xywyz"));
        assertFalse(s.isPalindrome("xywzx"));
    }

}
