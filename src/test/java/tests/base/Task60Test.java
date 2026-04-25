package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class Task60Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: sumToN should compute sum for normal positive value")
    void gemini_sumToN_normalValue() {
        solutions.gemini.Task60 s = new solutions.gemini.Task60();
        assertEquals(15, s.sumToN(5));
    }

    @Test
    @DisplayName("Gemini: sumToN should compute sum when N is one")
    void gemini_sumToN_one() {
        solutions.gemini.Task60 s = new solutions.gemini.Task60();
        assertEquals(1, s.sumToN(1));
    }

    @Test
    @DisplayName("Gemini: sumToN should return zero when N is zero")
    void gemini_sumToN_zero() {
        solutions.gemini.Task60 s = new solutions.gemini.Task60();
        assertEquals(0, s.sumToN(0));
    }

    @Test
    @DisplayName("Gemini: sumToN should compute sum for large N")
    void gemini_sumToN_largeNumber() {
        solutions.gemini.Task60 s = new solutions.gemini.Task60();
        assertEquals(5050, s.sumToN(100));
    }
// ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: sumToN should compute sum for normal positive value")
    void claude_sumToN_normalValue() {
        solutions.claude.Task60 s = new solutions.claude.Task60();
        assertEquals(15, s.sumToN(5));
    }

    @Test
    @DisplayName("Claude: sumToN should compute sum when N is one")
    void claude_sumToN_one() {
        solutions.claude.Task60 s = new solutions.claude.Task60();
        assertEquals(1, s.sumToN(1));
    }

    @Test
    @DisplayName("Claude: sumToN should return zero when N is zero")
    void claude_sumToN_zero() {
        solutions.claude.Task60 s = new solutions.claude.Task60();
        assertEquals(0, s.sumToN(0));
    }

    @Test
    @DisplayName("Claude: sumToN should compute sum for large N")
    void claude_sumToN_largeNumber() {
        solutions.claude.Task60 s = new solutions.claude.Task60();
        assertEquals(5050, s.sumToN(100));
    }

    @Test
    @DisplayName("Claude: sumToN should compute sum for N equals two")
    void claude_sumToN_two() {
        solutions.claude.Task60 s = new solutions.claude.Task60();
        assertEquals(3, s.sumToN(2));
    }

    @Test
    @DisplayName("Claude: sumToN should compute sum for N equals ten")
    void claude_sumToN_ten() {
        solutions.claude.Task60 s = new solutions.claude.Task60();
        assertEquals(55, s.sumToN(10));
    }

    @Test
    @DisplayName("Claude: sumToN should compute sum for N equals fifty")
    void claude_sumToN_fifty() {
        solutions.claude.Task60 s = new solutions.claude.Task60();
        assertEquals(1275, s.sumToN(50));
    }
}