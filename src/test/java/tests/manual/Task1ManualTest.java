package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1ManualTest {

    @Test
    @DisplayName("Gemini: empty input boundary")
    void gemini_emptyInput() {
        solutions.gemini.Task1 s = new solutions.gemini.Task1();
        assertEquals(Collections.emptyList(), s.separateParenGroups(""));
    }

    @Test
    @DisplayName("Claude: empty input boundary")
    void claude_emptyInput() {
        solutions.claude.Task1 s = new solutions.claude.Task1();
        assertEquals(Collections.emptyList(), s.separateParenGroups(""));
    }

    @Test
    @DisplayName("Gemini: minimum valid group mutation")
    void gemini_minGroup() {
        solutions.gemini.Task1 s = new solutions.gemini.Task1();
        assertEquals(Collections.singletonList("()"), s.separateParenGroups("()"));
    }

    @Test
    @DisplayName("Claude: spaces-only input mutation")
    void claude_spacesOnly() {
        solutions.claude.Task1 s = new solutions.claude.Task1();
        assertEquals(Collections.emptyList(), s.separateParenGroups("   "));
    }

    @Test
    @DisplayName("Both: repeated group mutation from base pattern")
    void both_repeatedGroups() {
        solutions.gemini.Task1 g = new solutions.gemini.Task1();
        solutions.claude.Task1 c = new solutions.claude.Task1();
        assertEquals(Arrays.asList("()", "()", "()", "()", "()"), g.separateParenGroups("()()()()()"));
        assertEquals(Arrays.asList("()", "()", "()", "()", "()"), c.separateParenGroups("()()()()()"));
    }
}
