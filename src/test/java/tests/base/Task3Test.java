package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Base tests for Task 3 from HumanEval dataset.
 * Tests both Gemini and Claude generated code.
 */
class Task3Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: belowZero test case 1")
    void gemini_belowZero_1() {
        solutions.gemini.Task3 s = new solutions.gemini.Task3();
        assertFalse(s.belowZero(new ArrayList<>(Arrays.asList())));
    }

    @Test
    @DisplayName("Gemini: belowZero test case 2")
    void gemini_belowZero_2() {
        solutions.gemini.Task3 s = new solutions.gemini.Task3();
        assertFalse(s.belowZero(new ArrayList<>(Arrays.asList(1, 2, -3, 1, 2, -3))));
    }

    @Test
    @DisplayName("Gemini: belowZero test case 3")
    void gemini_belowZero_3() {
        solutions.gemini.Task3 s = new solutions.gemini.Task3();
        assertTrue(s.belowZero(new ArrayList<>(Arrays.asList(1, 2, -4, 5, 6))));
    }

    @Test
    @DisplayName("Gemini: belowZero test case 4")
    void gemini_belowZero_4() {
        solutions.gemini.Task3 s = new solutions.gemini.Task3();
        assertFalse(s.belowZero(new ArrayList<>(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4))));
    }

    @Test
    @DisplayName("Gemini: belowZero test case 5")
    void gemini_belowZero_5() {
        solutions.gemini.Task3 s = new solutions.gemini.Task3();
        assertTrue(s.belowZero(new ArrayList<>(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5))));
    }

    @Test
    @DisplayName("Gemini: belowZero test case 6")
    void gemini_belowZero_6() {
        solutions.gemini.Task3 s = new solutions.gemini.Task3();
        assertTrue(s.belowZero(new ArrayList<>(Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4))));
    }

    // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: belowZero test case 1")
    void claude_belowZero_1() {
        solutions.claude.Task3 s = new solutions.claude.Task3();
        assertFalse(s.belowZero(new ArrayList<>(Arrays.asList())));
    }

    @Test
    @DisplayName("Claude: belowZero test case 2")
    void claude_belowZero_2() {
        solutions.claude.Task3 s = new solutions.claude.Task3();
        assertFalse(s.belowZero(new ArrayList<>(Arrays.asList(1, 2, -3, 1, 2, -3))));
    }

    @Test
    @DisplayName("Claude: belowZero test case 3")
    void claude_belowZero_3() {
        solutions.claude.Task3 s = new solutions.claude.Task3();
        assertTrue(s.belowZero(new ArrayList<>(Arrays.asList(1, 2, -4, 5, 6))));
    }

    @Test
    @DisplayName("Claude: belowZero test case 4")
    void claude_belowZero_4() {
        solutions.claude.Task3 s = new solutions.claude.Task3();
        assertFalse(s.belowZero(new ArrayList<>(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4))));
    }

    @Test
    @DisplayName("Claude: belowZero test case 5")
    void claude_belowZero_5() {
        solutions.claude.Task3 s = new solutions.claude.Task3();
        assertTrue(s.belowZero(new ArrayList<>(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5))));
    }

    @Test
    @DisplayName("Claude: belowZero test case 6")
    void claude_belowZero_6() {
        solutions.claude.Task3 s = new solutions.claude.Task3();
        assertTrue(s.belowZero(new ArrayList<>(Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4))));
    }

}
