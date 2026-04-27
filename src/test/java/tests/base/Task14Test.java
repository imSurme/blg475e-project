package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Base tests for Task 14 from HumanEval dataset.
 * Tests both Gemini and Claude generated code.
 */
class Task14Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: allPrefixes test case 1")
    void gemini_allPrefixes_1() {
        solutions.gemini.Task14 s = new solutions.gemini.Task14();
        assertEquals(List.of(), s.allPrefixes(""));
    }

    @Test
    @DisplayName("Gemini: allPrefixes test case 2")
    void gemini_allPrefixes_2() {
        solutions.gemini.Task14 s = new solutions.gemini.Task14();
        assertEquals(Arrays.asList("a", "as", "asd", "asdf", "asdfg", "asdfgh"), s.allPrefixes("asdfgh"));
    }

    @Test
    @DisplayName("Gemini: allPrefixes test case 3")
    void gemini_allPrefixes_3() {
        solutions.gemini.Task14 s = new solutions.gemini.Task14();
        assertEquals(Arrays.asList("W", "WW", "WWW"), s.allPrefixes("WWW"));
    }

    // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: allPrefixes test case 1")
    void claude_allPrefixes_1() {
        solutions.claude.Task14 s = new solutions.claude.Task14();
        assertEquals(List.of(), s.allPrefixes(""));
    }

    @Test
    @DisplayName("Claude: allPrefixes test case 2")
    void claude_allPrefixes_2() {
        solutions.claude.Task14 s = new solutions.claude.Task14();
        assertEquals(Arrays.asList("a", "as", "asd", "asdf", "asdfg", "asdfgh"), s.allPrefixes("asdfgh"));
    }

    @Test
    @DisplayName("Claude: allPrefixes test case 3")
    void claude_allPrefixes_3() {
        solutions.claude.Task14 s = new solutions.claude.Task14();
        assertEquals(Arrays.asList("W", "WW", "WWW"), s.allPrefixes("WWW"));
    }

}
