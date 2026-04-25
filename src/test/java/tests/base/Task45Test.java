package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class Task45Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: triangleArea should calculate normal dimensions correctly")
    void gemini_triangleArea_normalValues() {
        solutions.gemini.Task45 s = new solutions.gemini.Task45();
        assertEquals(10.0, s.triangleArea(5.0, 4.0), 0.0001);
    }

    @Test
    @DisplayName("Gemini: triangleArea should yield zero when base is zero")
    void gemini_triangleArea_zeroBase() {
        solutions.gemini.Task45 s = new solutions.gemini.Task45();
        assertEquals(0.0, s.triangleArea(0.0, 10.0), 0.0001);
    }

    @Test
    @DisplayName("Gemini: triangleArea should yield zero when height is zero")
    void gemini_triangleArea_zeroHeight() {
        solutions.gemini.Task45 s = new solutions.gemini.Task45();
        assertEquals(0.0, s.triangleArea(10.0, 0.0), 0.0001);
    }

    @Test
    @DisplayName("Gemini: triangleArea should handle decimal outputs perfectly")
    void gemini_triangleArea_decimalValues() {
        solutions.gemini.Task45 s = new solutions.gemini.Task45();
        assertEquals(7.5, s.triangleArea(3.0, 5.0), 0.0001);
    }
// ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: triangleArea should calculate normal dimensions correctly")
    void claude_triangleArea_normalValues() {
        solutions.claude.Task45 s = new solutions.claude.Task45();
        assertEquals(10.0, s.triangleArea(5.0, 4.0), 0.0001);
    }

    @Test
    @DisplayName("Claude: triangleArea should yield zero when base is zero")
    void claude_triangleArea_zeroBase() {
        solutions.claude.Task45 s = new solutions.claude.Task45();
        assertEquals(0.0, s.triangleArea(0.0, 10.0), 0.0001);
    }

    @Test
    @DisplayName("Claude: triangleArea should yield zero when height is zero")
    void claude_triangleArea_zeroHeight() {
        solutions.claude.Task45 s = new solutions.claude.Task45();
        assertEquals(0.0, s.triangleArea(10.0, 0.0), 0.0001);
    }

    @Test
    @DisplayName("Claude: triangleArea should handle decimal outputs perfectly")
    void claude_triangleArea_decimalValues() {
        solutions.claude.Task45 s = new solutions.claude.Task45();
        assertEquals(7.5, s.triangleArea(3.0, 5.0), 0.0001);
    }

    @Test
    @DisplayName("Claude: triangleArea should calculate correctly when base equals height")
    void claude_triangleArea_baseEqualsHeight() {
        solutions.claude.Task45 s = new solutions.claude.Task45();
        assertEquals(8.0, s.triangleArea(4.0, 4.0), 0.0001);
    }

    @Test
    @DisplayName("Claude: triangleArea should handle large values correctly")
    void claude_triangleArea_largeValues() {
        solutions.claude.Task45 s = new solutions.claude.Task45();
        assertEquals(5000.0, s.triangleArea(100.0, 100.0), 0.0001);
    }

    @Test
    @DisplayName("Claude: triangleArea should handle small decimal values correctly")
    void claude_triangleArea_smallDecimalValues() {
        solutions.claude.Task45 s = new solutions.claude.Task45();
        assertEquals(0.25, s.triangleArea(1.0, 0.5), 0.0001);
    }
}