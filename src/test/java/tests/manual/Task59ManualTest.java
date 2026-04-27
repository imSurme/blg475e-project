package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task59ManualTest {

    @Test
    @DisplayName("Both: minimum valid prime boundary")
    void both_minimumPrime() {
        solutions.gemini.Task59 g = new solutions.gemini.Task59();
        solutions.claude.Task59 c = new solutions.claude.Task59();
        assertEquals(2, g.largestPrimeFactor(2));
        assertEquals(2, c.largestPrimeFactor(2));
    }

    @Test
    @DisplayName("Gemini: smallest odd prime boundary")
    void gemini_oddPrime() {
        solutions.gemini.Task59 s = new solutions.gemini.Task59();
        assertEquals(3, s.largestPrimeFactor(3));
    }

    @Test
    @DisplayName("Claude: scale up product mutation")
    void claude_scaleUpProduct() {
        solutions.claude.Task59 s = new solutions.claude.Task59();
        // 390 = 2 * 3 * 5 * 13
        assertEquals(13, s.largestPrimeFactor(390));
    }

    @Test
    @DisplayName("Both: large composite threshold")
    void both_largeComposite() {
        solutions.gemini.Task59 g = new solutions.gemini.Task59();
        solutions.claude.Task59 c = new solutions.claude.Task59();
        assertEquals(29, g.largestPrimeFactor(13195));
        assertEquals(29, c.largestPrimeFactor(13195));
    }
}