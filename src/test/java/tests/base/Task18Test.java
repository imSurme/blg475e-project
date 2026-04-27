package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Base tests for Task 18 from HumanEval dataset.
 * Tests both Gemini and Claude generated code.
 */
class Task18Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: howManyTimes test case 1")
    void gemini_howManyTimes_1() {
        solutions.gemini.Task18 s = new solutions.gemini.Task18();
        assertEquals(0, s.howManyTimes("", "x"));
    }

    @Test
    @DisplayName("Gemini: howManyTimes test case 2")
    void gemini_howManyTimes_2() {
        solutions.gemini.Task18 s = new solutions.gemini.Task18();
        assertEquals(4, s.howManyTimes("xyxyxyx", "x"));
    }

    @Test
    @DisplayName("Gemini: howManyTimes test case 3")
    void gemini_howManyTimes_3() {
        solutions.gemini.Task18 s = new solutions.gemini.Task18();
        assertEquals(4, s.howManyTimes("cacacacac", "cac"));
    }

    @Test
    @DisplayName("Gemini: howManyTimes test case 4")
    void gemini_howManyTimes_4() {
        solutions.gemini.Task18 s = new solutions.gemini.Task18();
        assertEquals(1, s.howManyTimes("john doe", "john"));
    }

    // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: howManyTimes test case 1")
    void claude_howManyTimes_1() {
        solutions.claude.Task18 s = new solutions.claude.Task18();
        assertEquals(0, s.howManyTimes("", "x"));
    }

    @Test
    @DisplayName("Claude: howManyTimes test case 2")
    void claude_howManyTimes_2() {
        solutions.claude.Task18 s = new solutions.claude.Task18();
        assertEquals(4, s.howManyTimes("xyxyxyx", "x"));
    }

    @Test
    @DisplayName("Claude: howManyTimes test case 3")
    void claude_howManyTimes_3() {
        solutions.claude.Task18 s = new solutions.claude.Task18();
        assertEquals(4, s.howManyTimes("cacacacac", "cac"));
    }

    @Test
    @DisplayName("Claude: howManyTimes test case 4")
    void claude_howManyTimes_4() {
        solutions.claude.Task18 s = new solutions.claude.Task18();
        assertEquals(1, s.howManyTimes("john doe", "john"));
    }

}
