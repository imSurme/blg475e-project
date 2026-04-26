package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task45ImprovedTest {

    // ==================== SHARED CONSTANTS ====================

    private static final double DELTA                  = 0.0001;

    // ==================== GEMINI CONSTANTS ====================

    private static final double NORMAL_BASE            = 5.0;
    private static final double NORMAL_HEIGHT          = 4.0;
    private static final double EXPECTED_NORMAL        = 10.0;

    private static final double ZERO_BASE              = 0.0;
    private static final double HEIGHT_FOR_ZERO        = 10.0;
    private static final double EXPECTED_ZERO_AREA     = 0.0;

    private static final double BASE_FOR_ZERO          = 10.0;
    private static final double ZERO_HEIGHT            = 0.0;

    private static final double DECIMAL_BASE           = 3.0;
    private static final double DECIMAL_HEIGHT         = 5.0;
    private static final double EXPECTED_DECIMAL       = 7.5;

    // ==================== CLAUDE CONSTANTS ====================

    private static final double CL_NORMAL_BASE         = 5.0;
    private static final double CL_NORMAL_HEIGHT       = 4.0;
    private static final double CL_EXPECTED_NORMAL     = 10.0;

    private static final double CL_ZERO_BASE           = 0.0;
    private static final double CL_HEIGHT_FOR_ZERO     = 10.0;
    private static final double CL_EXPECTED_ZERO       = 0.0;

    private static final double CL_BASE_FOR_ZERO       = 10.0;
    private static final double CL_ZERO_HEIGHT         = 0.0;

    private static final double CL_DECIMAL_BASE        = 3.0;
    private static final double CL_DECIMAL_HEIGHT      = 5.0;
    private static final double CL_EXPECTED_DECIMAL    = 7.5;

    private static final double CL_EQUAL_BASE          = 4.0;
    private static final double CL_EQUAL_HEIGHT        = 4.0;
    private static final double CL_EXPECTED_EQUAL      = 8.0;

    private static final double CL_LARGE_BASE          = 100.0;
    private static final double CL_LARGE_HEIGHT        = 100.0;
    private static final double CL_EXPECTED_LARGE      = 5000.0;

    private static final double CL_SMALL_BASE          = 1.0;
    private static final double CL_SMALL_HEIGHT        = 0.5;
    private static final double CL_EXPECTED_SMALL      = 0.25;

    // ==================== GEMINI IMPROVED TESTS ====================

    @Test
    @DisplayName("Gemini: triangleArea should calculate normal dimensions correctly")
    void gemini_triangleArea_normalValues() {
        solutions.gemini.Task45 s = new solutions.gemini.Task45();
        assertEquals(EXPECTED_NORMAL, s.triangleArea(NORMAL_BASE, NORMAL_HEIGHT), DELTA,
            "Assertion Roulette Fix: Failed to calculate the area for standard integer-like dimensions.");
    }

    @Test
    @DisplayName("Gemini: triangleArea should yield zero when base is zero")
    void gemini_triangleArea_zeroBase() {
        solutions.gemini.Task45 s = new solutions.gemini.Task45();
        assertEquals(EXPECTED_ZERO_AREA, s.triangleArea(ZERO_BASE, HEIGHT_FOR_ZERO), DELTA,
            "Assertion Roulette Fix: Area must be zero when the base is zero.");
    }

    @Test
    @DisplayName("Gemini: triangleArea should yield zero when height is zero")
    void gemini_triangleArea_zeroHeight() {
        solutions.gemini.Task45 s = new solutions.gemini.Task45();
        assertEquals(EXPECTED_ZERO_AREA, s.triangleArea(BASE_FOR_ZERO, ZERO_HEIGHT), DELTA,
            "Assertion Roulette Fix: Area must be zero when the height is zero.");
    }

    @Test
    @DisplayName("Gemini: triangleArea should handle decimal outputs perfectly")
    void gemini_triangleArea_decimalValues() {
        solutions.gemini.Task45 s = new solutions.gemini.Task45();
        assertEquals(EXPECTED_DECIMAL, s.triangleArea(DECIMAL_BASE, DECIMAL_HEIGHT), DELTA,
            "Assertion Roulette Fix: Failed to calculate precise area for odd decimal inputs.");
    }

    // ==================== CLAUDE IMPROVED TESTS ====================

    @Test
    @DisplayName("Claude: triangleArea should calculate normal dimensions correctly")
    void claude_triangleArea_normalValues() {
        solutions.claude.Task45 s = new solutions.claude.Task45();
        assertEquals(CL_EXPECTED_NORMAL, s.triangleArea(CL_NORMAL_BASE, CL_NORMAL_HEIGHT), DELTA,
            "Normal dimensions failed, expected " + CL_EXPECTED_NORMAL);
    }

    @Test
    @DisplayName("Claude: triangleArea should yield zero when base is zero")
    void claude_triangleArea_zeroBase() {
        solutions.claude.Task45 s = new solutions.claude.Task45();
        assertEquals(CL_EXPECTED_ZERO, s.triangleArea(CL_ZERO_BASE, CL_HEIGHT_FOR_ZERO), DELTA,
            "Area must be zero when base is zero, expected " + CL_EXPECTED_ZERO);
    }

    @Test
    @DisplayName("Claude: triangleArea should yield zero when height is zero")
    void claude_triangleArea_zeroHeight() {
        solutions.claude.Task45 s = new solutions.claude.Task45();
        assertEquals(CL_EXPECTED_ZERO, s.triangleArea(CL_BASE_FOR_ZERO, CL_ZERO_HEIGHT), DELTA,
            "Area must be zero when height is zero, expected " + CL_EXPECTED_ZERO);
    }

    @Test
    @DisplayName("Claude: triangleArea should handle decimal outputs correctly")
    void claude_triangleArea_decimalValues() {
        solutions.claude.Task45 s = new solutions.claude.Task45();
        assertEquals(CL_EXPECTED_DECIMAL, s.triangleArea(CL_DECIMAL_BASE, CL_DECIMAL_HEIGHT), DELTA,
            "Decimal area calculation failed, expected " + CL_EXPECTED_DECIMAL);
    }

    @Test
    @DisplayName("Claude: triangleArea should calculate correctly when base equals height")
    void claude_triangleArea_baseEqualsHeight() {
        solutions.claude.Task45 s = new solutions.claude.Task45();
        assertEquals(CL_EXPECTED_EQUAL, s.triangleArea(CL_EQUAL_BASE, CL_EQUAL_HEIGHT), DELTA,
            "Equal base and height failed, expected " + CL_EXPECTED_EQUAL);
    }

    @Test
    @DisplayName("Claude: triangleArea should handle large values correctly")
    void claude_triangleArea_largeValues() {
        solutions.claude.Task45 s = new solutions.claude.Task45();
        assertEquals(CL_EXPECTED_LARGE, s.triangleArea(CL_LARGE_BASE, CL_LARGE_HEIGHT), DELTA,
            "Large values failed, expected " + CL_EXPECTED_LARGE);
    }

    @Test
    @DisplayName("Claude: triangleArea should handle small decimal values correctly")
    void claude_triangleArea_smallDecimalValues() {
        solutions.claude.Task45 s = new solutions.claude.Task45();
        assertEquals(CL_EXPECTED_SMALL, s.triangleArea(CL_SMALL_BASE, CL_SMALL_HEIGHT), DELTA,
            "Small decimal values failed, expected " + CL_EXPECTED_SMALL);
    }
}