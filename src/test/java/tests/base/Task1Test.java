package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class Task1Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: separateParenGroups with multiple groups")
    void gemini_separateParenGroups_multipleGroups() {
        solutions.gemini.Task1 s = new solutions.gemini.Task1();
        assertEquals(Arrays.asList("(()())", "((()))", "()", "((())()())"), 
                     s.separateParenGroups("(()()) ((())) () ((())()())"));
    }

    @Test
    @DisplayName("Gemini: separateParenGroups with nested groups")
    void gemini_separateParenGroups_nestedGroups() {
        solutions.gemini.Task1 s = new solutions.gemini.Task1();
        assertEquals(Arrays.asList("()", "(())", "((()))", "(((())))"), 
                     s.separateParenGroups("() (()) ((())) (((())))"));
    }

    @Test
    @DisplayName("Gemini: separateParenGroups with single group")
    void gemini_separateParenGroups_singleGroup() {
        solutions.gemini.Task1 s = new solutions.gemini.Task1();
        assertEquals(Arrays.asList("(()(())((())))"), 
                     s.separateParenGroups("(()(())((())))"));
    }

    @Test
    @DisplayName("Gemini: separateParenGroups with spaces inside")
    void gemini_separateParenGroups_spacesInside() {
        solutions.gemini.Task1 s = new solutions.gemini.Task1();
        assertEquals(Arrays.asList("()", "(())", "(()())"), 
                     s.separateParenGroups("( ) (( )) (( )( ))"));
    }

    // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: separateParenGroups with multiple groups")
    void claude_separateParenGroups_multipleGroups() {
        solutions.claude.Task1 s = new solutions.claude.Task1();
        assertEquals(Arrays.asList("(()())", "((()))", "()", "((())()())"), 
                     s.separateParenGroups("(()()) ((())) () ((())()())"));
    }

    @Test
    @DisplayName("Claude: separateParenGroups with nested groups")
    void claude_separateParenGroups_nestedGroups() {
        solutions.claude.Task1 s = new solutions.claude.Task1();
        assertEquals(Arrays.asList("()", "(())", "((()))", "(((())))"), 
                     s.separateParenGroups("() (()) ((())) (((())))"));
    }

    @Test
    @DisplayName("Claude: separateParenGroups with single group")
    void claude_separateParenGroups_singleGroup() {
        solutions.claude.Task1 s = new solutions.claude.Task1();
        assertEquals(Arrays.asList("(()(())((())))"), 
                     s.separateParenGroups("(()(())((())))"));
    }

    @Test
    @DisplayName("Claude: separateParenGroups with spaces inside")
    void claude_separateParenGroups_spacesInside() {
        solutions.claude.Task1 s = new solutions.claude.Task1();
        assertEquals(Arrays.asList("()", "(())", "(()())"), 
                     s.separateParenGroups("( ) (( )) (( )( ))"));
    }
}
