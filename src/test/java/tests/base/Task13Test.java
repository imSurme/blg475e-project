package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Task13Test {

    @Test
    @DisplayName("Gemini: greatestCommonDivisor")
    void gemini_greatestCommonDivisor() {
        solutions.gemini.Task13 s = new solutions.gemini.Task13();
        assertEquals(1, s.greatestCommonDivisor(3, 7));
        assertEquals(5, s.greatestCommonDivisor(10, 15));
        assertEquals(7, s.greatestCommonDivisor(49, 14));
        assertEquals(12, s.greatestCommonDivisor(144, 60));
    }

    @Test
    @DisplayName("Claude: greatestCommonDivisor")
    void claude_greatestCommonDivisor() {
        solutions.claude.Task13 s = new solutions.claude.Task13();
        assertEquals(1, s.greatestCommonDivisor(3, 7));
        assertEquals(5, s.greatestCommonDivisor(10, 15));
        assertEquals(7, s.greatestCommonDivisor(49, 14));
        assertEquals(12, s.greatestCommonDivisor(144, 60));
    }

}
