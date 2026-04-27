package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Base tests for Task 26 from HumanEval dataset.
 * Tests both Gemini and Claude generated code.
 */
class Task26Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: removeDuplicates test case 1")
    void gemini_removeDuplicates_1() {
        solutions.gemini.Task26 s = new solutions.gemini.Task26();
        assertEquals(List.of(), s.removeDuplicates(new ArrayList<>(List.of())));
    }

    @Test
    @DisplayName("Gemini: removeDuplicates test case 2")
    void gemini_removeDuplicates_2() {
        solutions.gemini.Task26 s = new solutions.gemini.Task26();
        assertEquals(Arrays.asList(1, 2, 3, 4), s.removeDuplicates(new ArrayList<>(Arrays.asList(1, 2, 3, 4))));
    }

    @Test
    @DisplayName("Gemini: removeDuplicates test case 3")
    void gemini_removeDuplicates_3() {
        solutions.gemini.Task26 s = new solutions.gemini.Task26();
        assertEquals(Arrays.asList(1, 4, 5), s.removeDuplicates(new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 3, 5))));
    }

    // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: removeDuplicates test case 1")
    void claude_removeDuplicates_1() {
        solutions.claude.Task26 s = new solutions.claude.Task26();
        assertEquals(List.of(), s.removeDuplicates(new ArrayList<>(List.of())));
    }

    @Test
    @DisplayName("Claude: removeDuplicates test case 2")
    void claude_removeDuplicates_2() {
        solutions.claude.Task26 s = new solutions.claude.Task26();
        assertEquals(Arrays.asList(1, 2, 3, 4), s.removeDuplicates(new ArrayList<>(Arrays.asList(1, 2, 3, 4))));
    }

    @Test
    @DisplayName("Claude: removeDuplicates test case 3")
    void claude_removeDuplicates_3() {
        solutions.claude.Task26 s = new solutions.claude.Task26();
        assertEquals(Arrays.asList(1, 4, 5), s.removeDuplicates(new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 3, 5))));
    }

}
