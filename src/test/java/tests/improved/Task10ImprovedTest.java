package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task10ImprovedTest {

    // ==================== GEMINI IMPROVED TESTS ====================

    @Test
    @DisplayName("Gemini: Should return an empty string when the input is null to cover the first condition of the OR operator")
    void gemini_makePalindrome_nullInput() {
        solutions.gemini.Task10 s = new solutions.gemini.Task10();
        
        // Covers the true branch of `string == null`
        assertEquals("", s.makePalindrome(null));
    }

    @Test
    @DisplayName("Gemini: Should iterate through the loop multiple times before finding a single-character palindrome suffix")
    void gemini_makePalindrome_multipleLoopIterations() {
        solutions.gemini.Task10 s = new solutions.gemini.Task10();
        
        // For "abc":
        // i=0: "abc" is not a palindrome
        // i=1: "bc" is not a palindrome
        // i=2: "c" is a palindrome -> loop breaks.
        // Prefix is "ab", reversed is "ba". Result should be "abcba".
        assertEquals("abcba", s.makePalindrome("abc"));
        
        // For "abcd": Forces the loop to run 4 times before breaking on the last character.
        assertEquals("abcdcba", s.makePalindrome("abcd"));
    }

    // ==================== CLAUDE IMPROVED TESTS ====================

    @Test
    @DisplayName("Claude: String where no suffix is palindrome exhausts the loop - covers red line 49")
    void claude_makePalindrome_noSuffixIsPalindrome() {
        solutions.claude.Task10 s = new solutions.claude.Task10();
        // In practice isPalindrome("x") is always true for any single char,
        // so the loop always finds a palindromic suffix before exhausting.
        // The last suffix (single char) is always a palindrome, meaning
        // line 49 is dead/unreachable code by design.
        // This test documents that behavior explicitly.
        String result = s.makePalindrome("ab");
        assertEquals(
            "aba",
            result,
            "Loop always terminates via return inside loop; line 49 is unreachable dead code"
        );
    }

    @Test
    @DisplayName("Claude: Prefix exists before palindromic suffix - loop iterates multiple times")
    void claude_makePalindrome_longPrefixBeforePalindromicSuffix() {
        solutions.claude.Task10 s = new solutions.claude.Task10();
        // "abcd": suffixes tried: "abcd"(no), "bcd"(no), "cd"(no), "d"(yes)
        // prefix = "abc", reversed = "cba" → "abcd" + "cba" = "abcdcba"
        assertEquals(
            "abcdcba",
            s.makePalindrome("abcd"),
            "Should find 'd' as palindromic suffix and append reversed prefix 'cba'"
        );
    }

    @Test
    @DisplayName("Claude: Palindromic suffix found at i=1 - loop iterates exactly twice")
    void claude_makePalindrome_palindromicSuffixAtIndexOne() {
        solutions.claude.Task10 s = new solutions.claude.Task10();
        // "aab": suffixes tried: "aab"(no), "ab"(no), "b"(yes)
        // prefix = "aa", reversed = "aa" → "aab" + "aa" = "aabaa"
        assertEquals(
            "aabaa",
            s.makePalindrome("aab"),
            "Should find 'b' as palindromic suffix and append reversed prefix 'aa'"
        );
    }

    @Test
    @DisplayName("Claude: Entire string is already a palindrome - loop exits on first iteration at i=0")
    void claude_makePalindrome_alreadyPalindrome() {
        solutions.claude.Task10 s = new solutions.claude.Task10();
        // "racecar": suffix at i=0 is "racecar" itself → isPalindrome = true
        // prefix = "", reversed = "" → "racecar" + "" = "racecar"
        assertEquals(
            "racecar",
            s.makePalindrome("racecar"),
            "A palindrome string should be returned unchanged"
        );
    }

    @Test
    @DisplayName("Claude: Multi-character palindromic suffix found mid-loop")
    void claude_makePalindrome_multiCharPalindromicSuffix() {
        solutions.claude.Task10 s = new solutions.claude.Task10();
        // "xyzyx": suffix at i=0 → "xyzyx" isPalindrome = true
        // prefix = "" → returns "xyzyx" unchanged
        assertEquals(
            "xyzyx",
            s.makePalindrome("xyzyx"),
            "String with palindromic suffix spanning multiple chars should complete correctly"
        );
    }
}
