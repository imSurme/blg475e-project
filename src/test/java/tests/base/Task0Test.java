package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Base tests for Task 0 from HumanEval dataset.
 * Tests both Gemini and Claude generated code.
 */
class Task0Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: hasCloseElements test case 1")
    void gemini_hasCloseElements_1() {
        solutions.gemini.Task0 s = new solutions.gemini.Task0();
        assertTrue(s.hasCloseElements(new ArrayList<>(Arrays.asList(11.0, 2.0, 3.9, 4.0, 5.0, 2.2)), 0.3));
    }

    @Test
    @DisplayName("Gemini: hasCloseElements test case 2")
    void gemini_hasCloseElements_2() {
        solutions.gemini.Task0 s = new solutions.gemini.Task0();
        assertFalse(s.hasCloseElements(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2)), 0.05));
    }

    @Test
    @DisplayName("Gemini: hasCloseElements test case 3")
    void gemini_hasCloseElements_3() {
        solutions.gemini.Task0 s = new solutions.gemini.Task0();
        assertTrue(s.hasCloseElements(new ArrayList<>(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)), 0.95));
    }

    @Test
    @DisplayName("Gemini: hasCloseElements test case 4")
    void gemini_hasCloseElements_4() {
        solutions.gemini.Task0 s = new solutions.gemini.Task0();
        assertFalse(s.hasCloseElements(new ArrayList<>(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)), 0.8));
    }

    @Test
    @DisplayName("Gemini: hasCloseElements test case 5")
    void gemini_hasCloseElements_5() {
        solutions.gemini.Task0 s = new solutions.gemini.Task0();
        assertTrue(s.hasCloseElements(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0)), 0.1));
    }

    @Test
    @DisplayName("Gemini: hasCloseElements test case 6")
    void gemini_hasCloseElements_6() {
        solutions.gemini.Task0 s = new solutions.gemini.Task0();
        assertTrue(s.hasCloseElements(new ArrayList<>(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1)), 1.0));
    }

    @Test
    @DisplayName("Gemini: hasCloseElements test case 7")
    void gemini_hasCloseElements_7() {
        solutions.gemini.Task0 s = new solutions.gemini.Task0();
        assertFalse(s.hasCloseElements(new ArrayList<>(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1)), 0.5));
    }

    // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: hasCloseElements test case 1")
    void claude_hasCloseElements_1() {
        solutions.claude.Task0 s = new solutions.claude.Task0();
        assertTrue(s.hasCloseElements(new ArrayList<>(Arrays.asList(11.0, 2.0, 3.9, 4.0, 5.0, 2.2)), 0.3));
    }

    @Test
    @DisplayName("Claude: hasCloseElements test case 2")
    void claude_hasCloseElements_2() {
        solutions.claude.Task0 s = new solutions.claude.Task0();
        assertFalse(s.hasCloseElements(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2)), 0.05));
    }

    @Test
    @DisplayName("Claude: hasCloseElements test case 3")
    void claude_hasCloseElements_3() {
        solutions.claude.Task0 s = new solutions.claude.Task0();
        assertTrue(s.hasCloseElements(new ArrayList<>(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)), 0.95));
    }

    @Test
    @DisplayName("Claude: hasCloseElements test case 4")
    void claude_hasCloseElements_4() {
        solutions.claude.Task0 s = new solutions.claude.Task0();
        assertFalse(s.hasCloseElements(new ArrayList<>(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)), 0.8));
    }

    @Test
    @DisplayName("Claude: hasCloseElements test case 5")
    void claude_hasCloseElements_5() {
        solutions.claude.Task0 s = new solutions.claude.Task0();
        assertTrue(s.hasCloseElements(new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0)), 0.1));
    }

    @Test
    @DisplayName("Claude: hasCloseElements test case 6")
    void claude_hasCloseElements_6() {
        solutions.claude.Task0 s = new solutions.claude.Task0();
        assertTrue(s.hasCloseElements(new ArrayList<>(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1)), 1.0));
    }

    @Test
    @DisplayName("Claude: hasCloseElements test case 7")
    void claude_hasCloseElements_7() {
        solutions.claude.Task0 s = new solutions.claude.Task0();
        assertFalse(s.hasCloseElements(new ArrayList<>(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1)), 0.5));
    }

}
