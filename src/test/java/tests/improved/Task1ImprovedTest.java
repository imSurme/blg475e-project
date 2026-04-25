package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1ImprovedTest {

    // ==================== GEMINI IMPROVED TESTS ====================

    @Test
    @DisplayName("Gemini: Should return an empty list when input is an empty string")
    void gemini_separateParenGroups_emptyString() {
        solutions.gemini.Task1 s = new solutions.gemini.Task1();
        assertEquals(Collections.emptyList(), s.separateParenGroups(""));
    }

    @Test
    @DisplayName("Gemini: Should return an empty list when input contains only spaces")
    void gemini_separateParenGroups_onlySpaces() {
        solutions.gemini.Task1 s = new solutions.gemini.Task1();
        assertEquals(Collections.emptyList(), s.separateParenGroups("     "));
    }

    @Test
    @DisplayName("Gemini: Should cover branch edge cases for balance condition")
    void gemini_separateParenGroups_balanceEdgeCases() {
        solutions.gemini.Task1 s = new solutions.gemini.Task1();
        
        // Unclosed group leaves balance > 0 at the end
        assertEquals(Collections.emptyList(), s.separateParenGroups("(()"));
    }

    @Test
    @DisplayName("Gemini: Should cover the false branch of else if (c == ')') with non-parenthesis characters")
    void gemini_separateParenGroups_invalidCharacters() {
        solutions.gemini.Task1 s = new solutions.gemini.Task1();
        
        // The character 'a' skips `if (c == '(')` and `else if (c == ')')` ensuring the false branch is covered.
        // The balance remains 1 during 'a', and drops to 0 at ')', grouping the entire sequence together.
        assertEquals(Collections.singletonList("(a)"), s.separateParenGroups("(a)"));
        
        // For a standalone non-parenthesis character, it also hits the false branches.
        // Since balance starts at 0 and remains 0, it is immediately evaluated and added to the list.
        assertEquals(Collections.singletonList("a"), s.separateParenGroups("a"));
    }

    @Test
    @DisplayName("Gemini: Should handle unbalanced closing parenthesis dropping balance below zero")
    void gemini_separateParenGroups_negativeBalance() {
        solutions.gemini.Task1 s = new solutions.gemini.Task1();
        
        // Starts with ')', balance drops to -1, which skips the `balance == 0` block.
        assertEquals(Collections.emptyList(), s.separateParenGroups(")"));
    }

    // ==================== CLAUDE IMPROVED TESTS ====================

    @Test
    @DisplayName("Claude: Empty string returns empty list")
    void claude_separateParenGroups_emptyString() {
        solutions.claude.Task1 s = new solutions.claude.Task1();
        assertEquals(Collections.emptyList(), s.separateParenGroups(""));
    }

    @Test
    @DisplayName("Claude: String with only spaces returns empty list")
    void claude_separateParenGroups_onlySpaces() {
        solutions.claude.Task1 s = new solutions.claude.Task1();
        assertEquals(Collections.emptyList(), s.separateParenGroups("     "));
    }

    @Test
    @DisplayName("Claude: Unbalanced opening parens - depth never reaches zero")
    void claude_separateParenGroups_depthNeverReachesZero() {
        solutions.claude.Task1 s = new solutions.claude.Task1();
        assertEquals(Collections.emptyList(), s.separateParenGroups("((("));
    }

    @Test
    @DisplayName("Claude: Single simple group exercises full branch")
    void claude_separateParenGroups_singleSimpleGroup() {
        solutions.claude.Task1 s = new solutions.claude.Task1();
        assertEquals(Arrays.asList("()"), s.separateParenGroups("()"));
    }

    @Test
    @DisplayName("Claude: Non-paren, non-space character hits false branch of else-if (c == ')') and is silently skipped")
    void claude_separateParenGroups_nonParenCharacter() {
        solutions.claude.Task1 s = new solutions.claude.Task1();
        // 'a' is neither '(' nor ')' nor ' ', so it falls through
        // both branches without being appended — the group still closes
        // correctly, but 'a' is excluded from the output.
        assertEquals(
            Arrays.asList("()"),
            s.separateParenGroups("(a)"),
            "Non-paren characters should be silently skipped; only parens are captured"
        );
    }
}
