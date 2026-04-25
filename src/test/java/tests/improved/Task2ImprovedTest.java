package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task2ImprovedTest {

    // ==================== SHARED CONSTANTS ====================

    // Floating-point comparison tolerance: accounts for IEEE 754 rounding
    // errors that arise when subtracting the integer part from a double
    private static final double FLOATING_POINT_TOLERANCE = 1e-6;

    // ==================== GEMINI IMPROVED TESTS ====================

    // --- Configuration Constants ---

    // The maximum delta allowed between the expected and actual double values
    // to account for standard floating-point arithmetic precision issues.
    private static final double FLOAT_TOLERANCE = 1e-6;

    // --- Test Data Constants ---

    // Values for testing a clean, exact binary fraction (0.5 = 1/2)
    // Chosen because 0.5 can be represented exactly in IEEE 754 floating-point format.
    private static final double EXACT_FRACTION_INPUT = 3.5;
    private static final double EXACT_FRACTION_EXPECTED = 0.5;

    // Values for testing a repeating decimal approximation
    // Chosen to ensure the modulo operation handles numbers that cannot be represented
    // exactly in binary (like 0.33) without introducing large precision errors.
    private static final double REPEATING_DECIMAL_INPUT = 1.33;
    private static final double REPEATING_DECIMAL_EXPECTED = 0.33;

    // Values for testing larger numbers with multiple integer and fractional digits
    // Chosen to verify that a larger integer part does not interfere with the extraction
    // of a multi-digit fractional part.
    private static final double COMPLEX_DECIMAL_INPUT = 123.456;
    private static final double COMPLEX_DECIMAL_EXPECTED = 0.456;


    @Test
    @DisplayName("Gemini: Should extract the exact decimal part when the fraction is a perfect power of two")
    void gemini_truncateNumber_exactFraction() {
        solutions.gemini.Task2 s = new solutions.gemini.Task2();

        assertEquals(EXACT_FRACTION_EXPECTED,
                s.truncateNumber(EXACT_FRACTION_INPUT),
                FLOAT_TOLERANCE,
                "Failed to extract the 0.5 decimal part correctly");
    }

    @Test
    @DisplayName("Gemini: Should safely extract repeating decimal parts within the allowed float tolerance")
    void gemini_truncateNumber_repeatingDecimal() {
        solutions.gemini.Task2 s = new solutions.gemini.Task2();

        assertEquals(REPEATING_DECIMAL_EXPECTED,
                s.truncateNumber(REPEATING_DECIMAL_INPUT),
                FLOAT_TOLERANCE,
                "Failed to extract the 0.33 decimal part correctly due to precision issues");
    }

    @Test
    @DisplayName("Gemini: Should accurately isolate the decimal portion from a number with a large integer part")
    void gemini_truncateNumber_complexDecimal() {
        solutions.gemini.Task2 s = new solutions.gemini.Task2();

        assertEquals(COMPLEX_DECIMAL_EXPECTED,
                s.truncateNumber(COMPLEX_DECIMAL_INPUT),
                FLOAT_TOLERANCE,
                "Failed to extract the 0.456 decimal part from a larger starting number");
    }

    // ==================== CLAUDE IMPROVED TESTS ====================

    // ── Test case 1: simple half-decimal (3.5) ────────────────────────────

    // Input: 3.5 — chosen because it has an exact binary representation,
    // making the expected decimal part (.5) completely unambiguous
    private static final double CLAUDE_INPUT_SIMPLE_HALF = 3.5;

    // Expected: 0.5 — the integer part (3) is stripped, leaving exactly 0.5
    private static final double CLAUDE_EXPECTED_SIMPLE_HALF = 0.5;

    // ── Test case 2: repeating decimal (1.33) ────────────────────────────

    // Input: 1.33 — chosen to verify behaviour with a value whose decimal
    // part cannot be represented exactly in binary floating point (1/3 ≈ 0.333…)
    private static final double CLAUDE_INPUT_REPEATING_DECIMAL = 1.33;

    // Expected: 0.33 — integer part (1) stripped; tolerance covers the
    // unavoidable IEEE 754 rounding error in the subtraction
    private static final double CLAUDE_EXPECTED_REPEATING_DECIMAL = 0.33;

    // ── Test case 3: many decimal places (123.456) ────────────────────────

    // Input: 123.456 — chosen to stress-test with a large integer part and
    // a multi-digit decimal that is not a simple power-of-two fraction
    private static final double CLAUDE_INPUT_MANY_DECIMALS = 123.456;

    // Expected: 0.456 — only the fractional part survives after truncation
    private static final double CLAUDE_EXPECTED_MANY_DECIMALS = 0.456;

    // ── Test case 4: just above a whole number ────────────────────────────

    // Input: 5.0000001 — chosen to verify that a near-integer value still
    // yields a non-zero decimal part and is not incorrectly rounded to 0
    private static final double CLAUDE_INPUT_NEAR_WHOLE_NUMBER = 5.0000001;

    // Expected: 0.0000001 — the tiny fractional remainder must be preserved
    private static final double CLAUDE_EXPECTED_NEAR_WHOLE = 0.0000001;

    // ── Test case 5: exact whole number ──────────────────────────────────

    // Input: 7.0 — chosen to verify that a number with no fractional part
    // returns exactly 0.0 (the modulo of a whole number is always zero)
    private static final double CLAUDE_INPUT_EXACT_WHOLE = 7.0;

    // Expected: 0.0 — no decimal part exists; result must be exactly zero
    private static final double CLAUDE_EXPECTED_EXACT_WHOLE = 0.0;

    @Test
    @DisplayName("Claude: 3.5 → decimal part is 0.5 (exact binary representation, unambiguous)")
    void claude_truncateNumber_simpleHalfDecimal() {
        solutions.claude.Task2 s = new solutions.claude.Task2();
        assertEquals(CLAUDE_EXPECTED_SIMPLE_HALF, s.truncateNumber(CLAUDE_INPUT_SIMPLE_HALF),
            FLOATING_POINT_TOLERANCE,
            "3.5 has an exact binary form; decimal part must be exactly 0.5");
    }

    @Test
    @DisplayName("Claude: 1.33 → decimal part is ~0.33 (repeating binary, tolerance required)")
    void claude_truncateNumber_repeatingDecimal() {
        solutions.claude.Task2 s = new solutions.claude.Task2();
        assertEquals(CLAUDE_EXPECTED_REPEATING_DECIMAL, s.truncateNumber(CLAUDE_INPUT_REPEATING_DECIMAL),
            FLOATING_POINT_TOLERANCE,
            "1.33 cannot be represented exactly in binary; result should be ~0.33");
    }

    @Test
    @DisplayName("Claude: 123.456 → decimal part is ~0.456 (large integer part, multi-digit fraction)")
    void claude_truncateNumber_manyDecimalPlaces() {
        solutions.claude.Task2 s = new solutions.claude.Task2();
        assertEquals(CLAUDE_EXPECTED_MANY_DECIMALS, s.truncateNumber(CLAUDE_INPUT_MANY_DECIMALS),
            FLOATING_POINT_TOLERANCE,
            "123.456 should strip the large integer part 123, leaving ~0.456");
    }

    @Test
    @DisplayName("Claude: 5.0000001 → decimal part is ~0.0000001 (near-whole number is not rounded to zero)")
    void claude_truncateNumber_nearWholeNumber() {
        solutions.claude.Task2 s = new solutions.claude.Task2();
        assertEquals(CLAUDE_EXPECTED_NEAR_WHOLE, s.truncateNumber(CLAUDE_INPUT_NEAR_WHOLE_NUMBER),
            FLOATING_POINT_TOLERANCE,
            "A value just above a whole number must preserve the tiny fractional remainder");
    }

    @Test
    @DisplayName("Claude: 7.0 → decimal part is 0.0 (exact whole number has no fractional part)")
    void claude_truncateNumber_exactWholeNumber() {
        solutions.claude.Task2 s = new solutions.claude.Task2();
        assertEquals(CLAUDE_EXPECTED_EXACT_WHOLE, s.truncateNumber(CLAUDE_INPUT_EXACT_WHOLE),
            FLOATING_POINT_TOLERANCE,
            "An exact whole number has no decimal part; result must be 0.0");
    }
}
