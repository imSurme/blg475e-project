package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task10ManualTest {

    @Test
    @DisplayName("Both: even-length palindrome boundary")
    void both_evenPalindrome() {
        solutions.gemini.Task10 g = new solutions.gemini.Task10();
        solutions.claude.Task10 c = new solutions.claude.Task10();
        assertEquals("abba", g.makePalindrome("abba"));
        assertEquals("abba", c.makePalindrome("abba"));
    }

    @Test
    @DisplayName("Both: two-char mutation from base")
    void both_twoCharMutation() {
        solutions.gemini.Task10 g = new solutions.gemini.Task10();
        solutions.claude.Task10 c = new solutions.claude.Task10();
        assertEquals("aba", g.makePalindrome("ab"));
        assertEquals("aba", c.makePalindrome("ab"));
    }

    @Test
    @DisplayName("Both: partial palindromic suffix")
    void both_partialSuffixCase() {
        solutions.gemini.Task10 g = new solutions.gemini.Task10();
        solutions.claude.Task10 c = new solutions.claude.Task10();
        assertEquals("catac", g.makePalindrome("cata"));
        assertEquals("catac", c.makePalindrome("cata"));
    }
}
