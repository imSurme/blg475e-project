package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task2ManualTest {

    private static final double EPS = 1e-6;

    @Test
    @DisplayName("Gemini: boundary x=0.0")
    void gemini_zeroBoundary() {
        solutions.gemini.Task2 s = new solutions.gemini.Task2();
        assertEquals(0.0, s.truncateNumber(0.0), EPS);
    }

    @Test
    @DisplayName("Claude: boundary x=1.0")
    void claude_oneBoundary() {
        solutions.claude.Task2 s = new solutions.claude.Task2();
        assertEquals(0.0, s.truncateNumber(1.0), EPS);
    }

    @Test
    @DisplayName("Both: mutation 0<x<1 from base input")
    void both_fractionOnlyInput() {
        solutions.gemini.Task2 g = new solutions.gemini.Task2();
        solutions.claude.Task2 c = new solutions.claude.Task2();
        assertEquals(0.75, g.truncateNumber(0.75), EPS);
        assertEquals(0.75, c.truncateNumber(0.75), EPS);
    }

    @Test
    @DisplayName("Both: whole-number mutation from base input")
    void both_wholeNumberMutation() {
        solutions.gemini.Task2 g = new solutions.gemini.Task2();
        solutions.claude.Task2 c = new solutions.claude.Task2();
        assertEquals(0.0, g.truncateNumber(5.0), EPS);
        assertEquals(0.0, c.truncateNumber(5.0), EPS);
    }
}
