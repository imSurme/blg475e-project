package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task23ImprovedTest {

    // ==================== GEMINI IMPROVED TESTS ====================

    // --- Test Configuration Constants ---

    // Expected length for an empty string.
    // Chosen because an empty string represents the absolute lower boundary condition for length.
    private static final int EXPECTED_EMPTY_LENGTH = 0;
    private static final String EMPTY_STRING_INPUT = "";

    // Expected length for a string with a single character.
    // Chosen to verify the function correctly identifies the smallest possible non-empty string.
    private static final int EXPECTED_SINGLE_CHAR_LENGTH = 1;
    private static final String SINGLE_CHAR_INPUT = "x";

    // Expected length for a standard, multi-character string.
    // Chosen to represent a typical, everyday use case to ensure the count is accurate beyond boundaries.
    private static final int EXPECTED_MULTI_CHAR_LENGTH = 5;
    private static final String MULTI_CHAR_INPUT = "asdfg";


    @Test
    @DisplayName("Gemini: Should correctly return 0 when measuring an empty string")
    void gemini_strlen_emptyString() {
        solutions.gemini.Task23 s = new solutions.gemini.Task23();

        assertEquals(EXPECTED_EMPTY_LENGTH,
                s.strlen(EMPTY_STRING_INPUT),
                "An empty string must evaluate to a length of 0");
    }

    @Test
    @DisplayName("Gemini: Should correctly return 1 when measuring a single-character string")
    void gemini_strlen_singleCharacter() {
        solutions.gemini.Task23 s = new solutions.gemini.Task23();

        assertEquals(EXPECTED_SINGLE_CHAR_LENGTH,
                s.strlen(SINGLE_CHAR_INPUT),
                "A string with one character must evaluate to a length of 1");
    }

    @Test
    @DisplayName("Gemini: Should accurately return the character count for a multi-character string")
    void gemini_strlen_multiCharacter() {
        solutions.gemini.Task23 s = new solutions.gemini.Task23();

        assertEquals(EXPECTED_MULTI_CHAR_LENGTH,
                s.strlen(MULTI_CHAR_INPUT),
                "Failed to count the correct number of characters in a standard string");
    }

    // ==================== CLAUDE IMPROVED TESTS ====================

    // ── Test case 1: empty string ─────────────────────────────────────────

    // Input: "" — chosen as the fundamental boundary case; an empty string
    // is the smallest possible input and must return a length of zero
    private static final String CLAUDE_EMPTY_STRING = "";

    // Expected: 0 — no characters exist in the string, so length is zero
    private static final int CLAUDE_EXPECTED_EMPTY_LENGTH = 0;

    // ── Test case 2: single character string ──────────────────────────────

    // Input: "x" — chosen to verify the minimum non-empty case; a single
    // character string is the smallest input that should return a non-zero length
    private static final String CLAUDE_SINGLE_CHAR_STRING = "x";

    // Expected: 1 — exactly one character exists in the string
    private static final int CLAUDE_EXPECTED_SINGLE_LENGTH = 1;

    // ── Test case 3: multi-character alphabetic string ────────────────────

    // Input: "asdfg" — chosen as a typical multi-character alphabetic string
    // with no special characters, spaces, or repetition to verify general case
    private static final String CLAUDE_MULTI_CHAR_STRING = "asdfg";

    // Expected: 5 — the string contains exactly 5 distinct alphabetic characters
    private static final int CLAUDE_EXPECTED_MULTI_LENGTH = 5;

    // ── Test case 4: string containing spaces ─────────────────────────────

    // Input: "hello world" — chosen to verify that spaces are counted as
    // characters and not silently ignored or skipped during length computation
    private static final String CLAUDE_STRING_WITH_SPACE = "hello world";

    // Expected: 11 — 5 chars ("hello") + 1 space + 5 chars ("world")
    private static final int CLAUDE_EXPECTED_SPACE_LENGTH = 11;

    // ── Test case 5: string with special characters ───────────────────────

    // Input: "a!@#1" — chosen to verify that non-alphabetic characters such
    // as digits and symbols are each counted as one character, just like letters
    private static final String CLAUDE_SPECIAL_CHAR_STRING = "a!@#1";

    // Expected: 5 — each symbol and digit contributes exactly 1 to the length
    private static final int CLAUDE_EXPECTED_SPECIAL_LENGTH = 5;

    // ── Test case 6: string with repeated characters ──────────────────────

    // Input: "aaa" — chosen to verify that duplicate characters are each
    // counted individually and not collapsed or deduplicated
    private static final String CLAUDE_REPEATED_CHAR_STRING = "aaa";

    // Expected: 3 — three separate 'a' characters, each counted once
    private static final int CLAUDE_EXPECTED_REPEATED_LENGTH = 3;

    @Test
    @DisplayName("Claude: Empty string → length is 0 (fundamental boundary: smallest possible input)")
    void claude_strlen_emptyString() {
        solutions.claude.Task23 s = new solutions.claude.Task23();
        assertEquals(CLAUDE_EXPECTED_EMPTY_LENGTH, s.strlen(CLAUDE_EMPTY_STRING),
            "An empty string contains no characters and must return exactly 0");
    }

    @Test
    @DisplayName("Claude: Single character 'x' → length is 1 (minimum non-empty input)")
    void claude_strlen_singleCharacter() {
        solutions.claude.Task23 s = new solutions.claude.Task23();
        assertEquals(CLAUDE_EXPECTED_SINGLE_LENGTH, s.strlen(CLAUDE_SINGLE_CHAR_STRING),
            "A single character string must return exactly 1");
    }

    @Test
    @DisplayName("Claude: 'asdfg' → length is 5 (typical multi-character alphabetic string)")
    void claude_strlen_multiCharacterString() {
        solutions.claude.Task23 s = new solutions.claude.Task23();
        assertEquals(CLAUDE_EXPECTED_MULTI_LENGTH, s.strlen(CLAUDE_MULTI_CHAR_STRING),
            "'asdfg' contains exactly 5 distinct alphabetic characters");
    }

    @Test
    @DisplayName("Claude: 'hello world' → length is 11 (spaces must be counted as characters)")
    void claude_strlen_stringWithSpace() {
        solutions.claude.Task23 s = new solutions.claude.Task23();
        assertEquals(CLAUDE_EXPECTED_SPACE_LENGTH, s.strlen(CLAUDE_STRING_WITH_SPACE),
            "Spaces are valid characters and must each contribute 1 to the total length");
    }

    @Test
    @DisplayName("Claude: 'a!@#1' → length is 5 (symbols and digits count the same as letters)")
    void claude_strlen_specialCharacters() {
        solutions.claude.Task23 s = new solutions.claude.Task23();
        assertEquals(CLAUDE_EXPECTED_SPECIAL_LENGTH, s.strlen(CLAUDE_SPECIAL_CHAR_STRING),
            "Special characters and digits must each be counted as a single character");
    }

    @Test
    @DisplayName("Claude: 'aaa' → length is 3 (repeated characters must not be deduplicated)")
    void claude_strlen_repeatedCharacters() {
        solutions.claude.Task23 s = new solutions.claude.Task23();
        assertEquals(CLAUDE_EXPECTED_REPEATED_LENGTH, s.strlen(CLAUDE_REPEATED_CHAR_STRING),
            "Each repeated character is distinct and must be counted individually");
    }
}
