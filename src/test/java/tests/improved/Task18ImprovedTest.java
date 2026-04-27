package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task18ImprovedTest {

    // ==================== CLAUDE IMPROVED TESTS ====================

    @Test
    @DisplayName("Claude Task18: testEmptyStringCombinations")
    void testClaudeEmptyStringCombinations() {
        solutions.claude.Task18 task = new solutions.claude.Task18();
        assertEquals(0, task.howManyTimes("", "abc"));
        assertEquals(0, task.howManyTimes("abc", ""));
        assertEquals(0, task.howManyTimes("", ""));
    }

    // ==================== GEMINI IMPROVED TESTS ====================

    @Test
    @DisplayName("Gemini Task18: testHowManyTimes_NullAndEmptyBranches")
    void testGeminiHowManyTimes_NullAndEmptyBranches() {
        solutions.gemini.Task18 task = new solutions.gemini.Task18();

        assertEquals(0, task.howManyTimes(null, "test"), "Should return 0 when the main string is null");
        assertEquals(0, task.howManyTimes("", "test"), "Should return 0 when the main string is empty");
        assertEquals(0, task.howManyTimes("valid string", null), "Should return 0 when the substring is null");
        assertEquals(0, task.howManyTimes("valid string", ""), "Should return 0 when the substring is empty");
        assertEquals(1, task.howManyTimes("valid string", "valid"), "Should bypass the if-condition when both strings are valid and non-empty");
    }
}
