package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Task31Test {

    @Test
    @DisplayName("Gemini: isPrime")
    void gemini_isPrime() {
        solutions.gemini.Task31 s = new solutions.gemini.Task31();
        assertFalse(s.isPrime(6));
        assertTrue(s.isPrime(101));
        assertTrue(s.isPrime(11));
        assertTrue(s.isPrime(13441));
        assertTrue(s.isPrime(61));
        assertFalse(s.isPrime(4));
        assertFalse(s.isPrime(1));
        assertTrue(s.isPrime(5));
        assertTrue(s.isPrime(11));
        assertTrue(s.isPrime(17));
        assertFalse(s.isPrime(5 * 17));
        assertFalse(s.isPrime(11 * 7));
        assertFalse(s.isPrime(13441 * 19));
    }

    @Test
    @DisplayName("Claude: isPrime")
    void claude_isPrime() {
        solutions.claude.Task31 s = new solutions.claude.Task31();
        assertFalse(s.isPrime(6));
        assertTrue(s.isPrime(101));
        assertTrue(s.isPrime(11));
        assertTrue(s.isPrime(13441));
        assertTrue(s.isPrime(61));
        assertFalse(s.isPrime(4));
        assertFalse(s.isPrime(1));
        assertTrue(s.isPrime(5));
        assertTrue(s.isPrime(11));
        assertTrue(s.isPrime(17));
        assertFalse(s.isPrime(5 * 17));
        assertFalse(s.isPrime(11 * 7));
        assertFalse(s.isPrime(13441 * 19));
    }

}
