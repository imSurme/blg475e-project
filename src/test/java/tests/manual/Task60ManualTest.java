package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task60ManualTest {

    @Test
    @DisplayName("Both: set to zero boundary")
    void both_zeroBoundary() {
        solutions.gemini.Task60 g = new solutions.gemini.Task60();
        solutions.claude.Task60 c = new solutions.claude.Task60();
        assertEquals(0, g.sumToN(0));
        assertEquals(0, c.sumToN(0));
    }

    @Test
    @DisplayName("Gemini: set to one mutation")
    void gemini_setToOne() {
        solutions.gemini.Task60 s = new solutions.gemini.Task60();
        assertEquals(1, s.sumToN(1));
    }

    @Test
    @DisplayName("Claude: make negative mutation")
    void claude_makeNegative() {
        solutions.claude.Task60 s = new solutions.claude.Task60();
        // Negatif girdilerde toplamın 0 (veya döngüye girmiyorsa 0) olmasını bekleriz
        assertEquals(0, s.sumToN(-5));
    }

    @Test
    @DisplayName("Both: scale up to large values boundary")
    void both_largeValues() {
        solutions.gemini.Task60 g = new solutions.gemini.Task60();
        solutions.claude.Task60 c = new solutions.claude.Task60();
        // Gauss formülü: 100 * 101 / 2 = 5050
        assertEquals(5050, g.sumToN(100));
        assertEquals(5050, c.sumToN(100));
    }
}