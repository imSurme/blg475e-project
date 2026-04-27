package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Base tests for Task 7 from HumanEval dataset.
 * Tests both Gemini and Claude generated code.
 */
class Task7Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: filterBySubstring test case 1")
    void gemini_filterBySubstring_1() {
        solutions.gemini.Task7 s = new solutions.gemini.Task7();
        assertEquals(List.of(), s.filterBySubstring(new ArrayList<>(List.of()), "john"));
    }

    @Test
    @DisplayName("Gemini: filterBySubstring test case 2")
    void gemini_filterBySubstring_2() {
        solutions.gemini.Task7 s = new solutions.gemini.Task7();
        assertEquals(Arrays.asList("xxx", "xxxAAA", "xxx"), s.filterBySubstring(new ArrayList<>(Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx")), "xxx"));
    }

    @Test
    @DisplayName("Gemini: filterBySubstring test case 3")
    void gemini_filterBySubstring_3() {
        solutions.gemini.Task7 s = new solutions.gemini.Task7();
        assertEquals(Arrays.asList("xxx", "aaaxxy", "xxxAAA", "xxx"), s.filterBySubstring(new ArrayList<>(Arrays.asList("xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx")), "xx"));
    }

    @Test
    @DisplayName("Gemini: filterBySubstring test case 4")
    void gemini_filterBySubstring_4() {
        solutions.gemini.Task7 s = new solutions.gemini.Task7();
        assertEquals(Arrays.asList("grunt", "prune"), s.filterBySubstring(new ArrayList<>(Arrays.asList("grunt", "trumpet", "prune", "gruesome")), "run"));
    }

    // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: filterBySubstring test case 1")
    void claude_filterBySubstring_1() {
        solutions.claude.Task7 s = new solutions.claude.Task7();
        assertEquals(List.of(), s.filterBySubstring(new ArrayList<>(List.of()), "john"));
    }

    @Test
    @DisplayName("Claude: filterBySubstring test case 2")
    void claude_filterBySubstring_2() {
        solutions.claude.Task7 s = new solutions.claude.Task7();
        assertEquals(Arrays.asList("xxx", "xxxAAA", "xxx"), s.filterBySubstring(new ArrayList<>(Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx")), "xxx"));
    }

    @Test
    @DisplayName("Claude: filterBySubstring test case 3")
    void claude_filterBySubstring_3() {
        solutions.claude.Task7 s = new solutions.claude.Task7();
        assertEquals(Arrays.asList("xxx", "aaaxxy", "xxxAAA", "xxx"), s.filterBySubstring(new ArrayList<>(Arrays.asList("xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx")), "xx"));
    }

    @Test
    @DisplayName("Claude: filterBySubstring test case 4")
    void claude_filterBySubstring_4() {
        solutions.claude.Task7 s = new solutions.claude.Task7();
        assertEquals(Arrays.asList("grunt", "prune"), s.filterBySubstring(new ArrayList<>(Arrays.asList("grunt", "trumpet", "prune", "gruesome")), "run"));
    }

}
