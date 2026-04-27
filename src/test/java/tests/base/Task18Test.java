package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Task18Test {

    @Test
    @DisplayName("Gemini: howManyTimes")
    void gemini_howManyTimes() {
        solutions.gemini.Task18 s = new solutions.gemini.Task18();
        assertEquals(0, s.howManyTimes("", "x"));
        assertEquals(4, s.howManyTimes("xyxyxyx", "x"));
        assertEquals(4, s.howManyTimes("cacacacac", "cac"));
        assertEquals(1, s.howManyTimes("john doe", "john"));
    }

    @Test
    @DisplayName("Claude: howManyTimes")
    void claude_howManyTimes() {
        solutions.claude.Task18 s = new solutions.claude.Task18();
        assertEquals(0, s.howManyTimes("", "x"));
        assertEquals(4, s.howManyTimes("xyxyxyx", "x"));
        assertEquals(4, s.howManyTimes("cacacacac", "cac"));
        assertEquals(1, s.howManyTimes("john doe", "john"));
    }

}
