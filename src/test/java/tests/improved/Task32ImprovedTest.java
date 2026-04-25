package tests.improved;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

class Task32ImprovedTest {

    // ==================== GEMINI IMPROVED TESTS ====================

    // Replaces the "1e-4" magic number with a descriptive constant
    private static final double TOLERANCE = 1e-4;

    @Test
    @DisplayName("Gemini: Should find the zero for a linear polynomial: f(x) = 1 + 2x")
    void gemini_findZero_linearPolynomial() {
        solutions.gemini.Task32 s = new solutions.gemini.Task32();

        // Coefficients for f(x) = 1 + 2x
        List<Double> coefficients = Arrays.asList(1.0, 2.0);
        double expectedRoot = -0.5;

        assertEquals(expectedRoot, s.findZero(coefficients), TOLERANCE,
                "Root of 1 + 2x should be exactly -0.5");
    }

    @Test
    @DisplayName("Gemini: Should find a zero for a cubic polynomial with multiple roots: f(x) = -6 + 11x - 6x^2 + x^3")
    void gemini_findZero_cubicPolynomialMultipleRoots() {
        solutions.gemini.Task32 s = new solutions.gemini.Task32();

        // Coefficients for f(x) = -6 + 11x - 6x^2 + x^3  --> (x-1)(x-2)(x-3)
        List<Double> coefficients = Arrays.asList(-6.0, 11.0, -6.0, 1.0);
        double expectedRoot = 1.0;

        assertEquals(expectedRoot, s.findZero(coefficients), TOLERANCE,
                "Root should be 1.0 based on the algorithm's bisection behavior");
    }

    @Test
    @DisplayName("Gemini: Should find the zero for a cubic polynomial with a single real root: f(x) = -8 + x^3")
    void gemini_findZero_cubicPolynomialSingleRoot() {
        solutions.gemini.Task32 s = new solutions.gemini.Task32();

        // Coefficients for f(x) = -8 + 0x + 0x^2 + 1x^3
        List<Double> coefficients = Arrays.asList(-8.0, 0.0, 0.0, 1.0);
        double expectedRoot = 2.0;

        assertEquals(expectedRoot, s.findZero(coefficients), TOLERANCE,
                "Root of -8 + x^3 should be 2.0");
    }

    // ==================== CLAUDE IMPROVED TESTS ====================

    // ── Named constants to eliminate Magic Number smell ───────────────────

    /** Tolerance for floating-point zero comparisons */
    private static final double EPSILON = 1e-4;

    /** f(x) = -3 + 2x  →  zero at x = 1.5  (within [-1000, 1000]) */
    private static final List<Double> LINEAR_ZERO_AT_1_5 = Arrays.asList(-3.0, 2.0);

    /** f(x) = 1 + 2x  →  zero at x = -0.5  (within [-1000, 1000]) */
    private static final List<Double> LINEAR_ZERO_AT_NEG_0_5 = Arrays.asList(1.0, 2.0);

    /** f(x) = -6 + 11x - 6x² + x³  →  zeros at x = 1, 2, 3  (within [-1000, 1000]) */
    private static final List<Double> CUBIC_ZEROS_AT_1_2_3 = Arrays.asList(-6.0, 11.0, -6.0, 1.0);

    /** f(x) = -5000 + x  →  zero at x = 5000  (OUTSIDE [-1000, 1000]) */
    private static final List<Double> LINEAR_ZERO_AT_5000 = Arrays.asList(-5000.0, 1.0);

    /** f(x) = 10000 + x  →  zero at x = -10000  (OUTSIDE [-1000, 1000]) */
    private static final List<Double> LINEAR_ZERO_AT_NEG_10000 = Arrays.asList(10000.0, 1.0);

    /** Expected zero of LINEAR_ZERO_AT_1_5 */
    private static final double EXPECTED_ZERO_1_5 = 1.5;

    /** Expected zero of LINEAR_ZERO_AT_NEG_0_5 */
    private static final double EXPECTED_ZERO_NEG_0_5 = -0.5;

    /** Expected zero of CUBIC_ZEROS_AT_1_2_3 (smallest root) */
    private static final double EXPECTED_ZERO_CUBIC = 1.0;

    /** Expected zero of LINEAR_ZERO_AT_5000 */
    private static final double EXPECTED_ZERO_5000 = 5000.0;

    /** Expected zero of LINEAR_ZERO_AT_NEG_10000 */
    private static final double EXPECTED_ZERO_NEG_10000 = -10000.0;

    // ── Issue 1: Cover missing branch — zero OUTSIDE [-1000, 1000] ────────
    // These tests force the while loop body (lines 37-38) to execute,
    // covering the red no-coverage lines in JaCoCo.

    @Test
    @DisplayName("Claude: Zero at x=5000 (outside initial bounds) - forces bound expansion loop to execute")
    void claude_findZero_zeroOutsideInitialBoundsPositive() {
        solutions.claude.Task32 s = new solutions.claude.Task32();
        double result = s.findZero(LINEAR_ZERO_AT_5000);
        // f(x) = -5000 + x → zero at x = 5000, well beyond initial right=1000
        // left and right must double repeatedly before bisection can begin
        assertEquals(EXPECTED_ZERO_5000, result, EPSILON,
            "Should expand bounds rightward and converge to x=5000");
    }

    @Test
    @DisplayName("Claude: Zero at x=-10000 (outside initial bounds) - forces bound expansion loop to execute")
    void claude_findZero_zeroOutsideInitialBoundsNegative() {
        solutions.claude.Task32 s = new solutions.claude.Task32();
        double result = s.findZero(LINEAR_ZERO_AT_NEG_10000);
        // f(x) = 10000 + x → zero at x = -10000, well beyond initial left=-1000
        // bounds must expand leftward before a sign change is detected
        assertEquals(EXPECTED_ZERO_NEG_10000, result, EPSILON,
            "Should expand bounds leftward and converge to x=-10000");
    }

    // ── Issue 2a: Fix Magic Number smell — zeros within [-1000, 1000] ─────
    // All numeric literals replaced with named constants and descriptive comments.

    @Test
    @DisplayName("Claude: Linear polynomial f(x) = 1 + 2x - zero within initial bounds at x=-0.5")
    void claude_findZero_linearPolynomialZeroAtNegHalf() {
        solutions.claude.Task32 s = new solutions.claude.Task32();
        double result = s.findZero(LINEAR_ZERO_AT_NEG_0_5);
        // f(-0.5) = 1 + 2(-0.5) = 0 — sign change found immediately within [-1000, 1000]
        assertEquals(EXPECTED_ZERO_NEG_0_5, result, EPSILON,
            "Bisection should converge to x=-0.5 for f(x) = 1 + 2x");
    }

    @Test
    @DisplayName("Claude: Linear polynomial f(x) = -3 + 2x - zero within initial bounds at x=1.5")
    void claude_findZero_linearPolynomialZeroAtOnePointFive() {
        solutions.claude.Task32 s = new solutions.claude.Task32();
        double result = s.findZero(LINEAR_ZERO_AT_1_5);
        // f(1.5) = -3 + 2(1.5) = 0 — positive zero within initial bounds
        assertEquals(EXPECTED_ZERO_1_5, result, EPSILON,
            "Bisection should converge to x=1.5 for f(x) = -3 + 2x");
    }

    @Test
    @DisplayName("Claude: Cubic polynomial f(x) = -6 + 11x - 6x² + x³ - finds smallest root at x=1")
    void claude_findZero_cubicPolynomialZeroAtOne() {
        solutions.claude.Task32 s = new solutions.claude.Task32();
        double result = s.findZero(CUBIC_ZEROS_AT_1_2_3);
        // f(x) = (x-1)(x-2)(x-3) → roots at 1, 2, 3; bisection finds x=1 first
        assertEquals(EXPECTED_ZERO_CUBIC, result, EPSILON,
            "Bisection should converge to x=1 for (x-1)(x-2)(x-3)");
    }

    // ── Issue 2b: Verify result is an actual zero using poly() ────────────
    // Direct assertion on poly(result) ≈ 0, no loops or conditionals needed.

    @Test
    @DisplayName("Claude: Result of findZero satisfies poly(result) ≈ 0 for linear case")
    void claude_findZero_resultSatisfiesPolynomialEquation() {
        solutions.claude.Task32 s = new solutions.claude.Task32();
        double result = s.findZero(LINEAR_ZERO_AT_NEG_0_5);
        double polyAtResult = s.poly(LINEAR_ZERO_AT_NEG_0_5, result);
        // If findZero is correct, substituting result back into f(x) must yield ~0
        assertEquals(0.0, polyAtResult, EPSILON,
            "poly(findZero(xs), xs) must evaluate to approximately zero");
    }
}
