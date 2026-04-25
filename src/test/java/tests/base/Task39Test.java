package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class Task39Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: primeFib(1) should return 2")
    void gemini_primeFib_1() {
        solutions.gemini.Task39 s = new solutions.gemini.Task39();
        assertEquals(2, s.primeFib(1));
    }

    @Test
    @DisplayName("Gemini: primeFib(2) should return 3")
    void gemini_primeFib_2() {
        solutions.gemini.Task39 s = new solutions.gemini.Task39();
        assertEquals(3, s.primeFib(2));
    }

    @Test
    @DisplayName("Gemini: primeFib(3) should return 5")
    void gemini_primeFib_3() {
        solutions.gemini.Task39 s = new solutions.gemini.Task39();
        assertEquals(5, s.primeFib(3));
    }

    @Test
    @DisplayName("Gemini: primeFib(4) should return 13")
    void gemini_primeFib_4() {
        solutions.gemini.Task39 s = new solutions.gemini.Task39();
        assertEquals(13, s.primeFib(4));
    }

    @Test
    @DisplayName("Gemini: primeFib(5) should return 89")
    void gemini_primeFib_5() {
        solutions.gemini.Task39 s = new solutions.gemini.Task39();
        assertEquals(89, s.primeFib(5));
    }

    @Test
    @DisplayName("Gemini: primeFib(6) should return 233")
    void gemini_primeFib_6() {
        solutions.gemini.Task39 s = new solutions.gemini.Task39();
        assertEquals(233, s.primeFib(6));
    }

    @Test
    @DisplayName("Gemini: primeFib(7) should return 1597")
    void gemini_primeFib_7() {
        solutions.gemini.Task39 s = new solutions.gemini.Task39();
        assertEquals(1597, s.primeFib(7));
    }

    @Test
    @DisplayName("Gemini: primeFib(8) should return 28657")
    void gemini_primeFib_8() {
        solutions.gemini.Task39 s = new solutions.gemini.Task39();
        assertEquals(28657, s.primeFib(8));
    }

    @Test
    @DisplayName("Gemini: primeFib(9) should return 514229")
    void gemini_primeFib_9() {
        solutions.gemini.Task39 s = new solutions.gemini.Task39();
        assertEquals(514229, s.primeFib(9));
    }

    @Test
    @DisplayName("Gemini: primeFib(10) should return 433494437")
    void gemini_primeFib_10() {
        solutions.gemini.Task39 s = new solutions.gemini.Task39();
        assertEquals(433494437, s.primeFib(10));
    }

    // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: primeFib(1) should return 2")
    void claude_primeFib_1() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(2, s.primeFib(1));
    }

    @Test
    @DisplayName("Claude: primeFib(2) should return 3")
    void claude_primeFib_2() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(3, s.primeFib(2));
    }

    @Test
    @DisplayName("Claude: primeFib(3) should return 5")
    void claude_primeFib_3() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(5, s.primeFib(3));
    }

    @Test
    @DisplayName("Claude: primeFib(4) should return 13")
    void claude_primeFib_4() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(13, s.primeFib(4));
    }

    @Test
    @DisplayName("Claude: primeFib(5) should return 89")
    void claude_primeFib_5() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(89, s.primeFib(5));
    }

    @Test
    @DisplayName("Claude: primeFib(6) should return 233")
    void claude_primeFib_6() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(233, s.primeFib(6));
    }

    @Test
    @DisplayName("Claude: primeFib(7) should return 1597")
    void claude_primeFib_7() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(1597, s.primeFib(7));
    }

    @Test
    @DisplayName("Claude: primeFib(8) should return 28657")
    void claude_primeFib_8() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(28657, s.primeFib(8));
    }

    @Test
    @DisplayName("Claude: primeFib(9) should return 514229")
    void claude_primeFib_9() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(514229, s.primeFib(9));
    }

    @Test
    @DisplayName("Claude: primeFib(10) should return 433494437")
    void claude_primeFib_10() {
        solutions.claude.Task39 s = new solutions.claude.Task39();
        assertEquals(433494437, s.primeFib(10));
    }
}
