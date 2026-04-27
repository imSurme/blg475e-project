package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task18ManualTest {

    @Test
    @DisplayName("Gemini: substring longer than string")
    void gemini_subLonger() {
        solutions.gemini.Task18 s = new solutions.gemini.Task18();
        assertEquals(0, s.howManyTimes("a", "aa"));
    }

    @Test
    @DisplayName("Claude: substring longer than string")
    void claude_subLonger() {
        solutions.claude.Task18 s = new solutions.claude.Task18();
        assertEquals(0, s.howManyTimes("a", "aa"));
    }

    @Test
    @DisplayName("Both: both string and substring empty")
    void both_bothEmpty() {
        solutions.gemini.Task18 g = new solutions.gemini.Task18();
        solutions.claude.Task18 c = new solutions.claude.Task18();
        assertEquals(0, g.howManyTimes("", ""));
        assertEquals(0, c.howManyTimes("", ""));
    }
    
    @Test
    @DisplayName("Both: empty substring on non-empty string validation")
    void both_emptySubstring() {
        solutions.gemini.Task18 g = new solutions.gemini.Task18();
        solutions.claude.Task18 c = new solutions.claude.Task18();
        assertEquals(0, g.howManyTimes("abc", ""));
        assertEquals(0, c.howManyTimes("abc", ""));
    }
}