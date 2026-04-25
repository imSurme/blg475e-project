package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
class Task129Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: minPath should find minimum subarray sum with mixed signs")
    void gemini_minPath_mixedSigns() {
        solutions.gemini.Task129 s = new solutions.gemini.Task129();
        assertEquals(-3, s.minPath(new int[]{1, -2, 3, -1, -2}));
    }

    @Test
    @DisplayName("Gemini: minPath should return smallest single element if all positive")
    void gemini_minPath_allPositive() {
        solutions.gemini.Task129 s = new solutions.gemini.Task129();
        assertEquals(1, s.minPath(new int[]{1, 2, 3}));
    }

    @Test
    @DisplayName("Gemini: minPath should return sum of all if all negative")
    void gemini_minPath_allNegative() {
        solutions.gemini.Task129 s = new solutions.gemini.Task129();
        assertEquals(-6, s.minPath(new int[]{-1, -2, -3}));
    }

    @Test
    @DisplayName("Gemini: minPath should handle empty or null array")
    void gemini_minPath_emptyOrNull() {
        solutions.gemini.Task129 s = new solutions.gemini.Task129();
        assertEquals(0, s.minPath(new int[0]));
        assertEquals(0, s.minPath(null));
    }
// ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: minPath should find minimum subarray sum with mixed signs")
    void claude_minPath_mixedSigns() {
        solutions.claude.Task129 s = new solutions.claude.Task129();
        assertEquals(-3, s.minPath(Arrays.asList(1, -2, 3, -1, -2)));
    }

    @Test
    @DisplayName("Claude: minPath should return smallest single element if all positive")
    void claude_minPath_allPositive() {
        solutions.claude.Task129 s = new solutions.claude.Task129();
        assertEquals(1, s.minPath(Arrays.asList(1, 2, 3)));
    }

    @Test
    @DisplayName("Claude: minPath should return sum of all if all negative")
    void claude_minPath_allNegative() {
        solutions.claude.Task129 s = new solutions.claude.Task129();
        assertEquals(-6, s.minPath(Arrays.asList(-1, -2, -3)));
    }

    @Test
    @DisplayName("Claude: minPath should return single negative element")
    void claude_minPath_singleNegative() {
        solutions.claude.Task129 s = new solutions.claude.Task129();
        assertEquals(-5, s.minPath(Arrays.asList(-5)));
    }

    @Test
    @DisplayName("Claude: minPath should return single positive element")
    void claude_minPath_singlePositive() {
        solutions.claude.Task129 s = new solutions.claude.Task129();
        assertEquals(7, s.minPath(Arrays.asList(7)));
    }

    @Test
    @DisplayName("Claude: minPath should find minimum contiguous subarray sum")
    void claude_minPath_contiguousSubarray() {
        solutions.claude.Task129 s = new solutions.claude.Task129();
        assertEquals(-5, s.minPath(Arrays.asList(2, 3, -4, -1, 2)));
    }

    @Test
    @DisplayName("Claude: minPath should return zero for list containing only zero")
    void claude_minPath_onlyZero() {
        solutions.claude.Task129 s = new solutions.claude.Task129();
        assertEquals(0, s.minPath(Arrays.asList(0)));
    }
}