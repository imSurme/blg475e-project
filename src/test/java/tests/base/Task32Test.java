package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Task32Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: findZero should find polynomial roots correctly")
    void gemini_findZero_randomPolynomials() {
        solutions.gemini.Task32 s = new solutions.gemini.Task32();
        Random rand = new Random(42);
        for (int i = 0; i < 100; i++) {
            int ncoeff = 2 * (rand.nextInt(3) + 1);
            List<Double> coeffs = new ArrayList<>();
            for (int j = 0; j < ncoeff; j++) {
                int coeff = rand.nextInt(20) - 10;
                if (coeff == 0) {
                    coeff = 1;
                }
                coeffs.add((double) coeff);
            }
            double solution = s.findZero(coeffs);
            assertTrue(Math.abs(s.poly(coeffs, solution)) < 1e-4,
                    "poly(coeffs, solution) should be close to zero for iteration " + i);
        }
    }

    // ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: findZero should find polynomial roots correctly")
    void claude_findZero_randomPolynomials() {
        solutions.claude.Task32 s = new solutions.claude.Task32();
        Random rand = new Random(42);
        for (int i = 0; i < 100; i++) {
            int ncoeff = 2 * (rand.nextInt(3) + 1);
            List<Double> coeffs = new ArrayList<>();
            for (int j = 0; j < ncoeff; j++) {
                int coeff = rand.nextInt(20) - 10;
                if (coeff == 0) {
                    coeff = 1;
                }
                coeffs.add((double) coeff);
            }
            double solution = s.findZero(coeffs);
            assertTrue(Math.abs(s.poly(coeffs, solution)) < 1e-4,
                    "poly(coeffs, solution) should be close to zero for iteration " + i);
        }
    }
}
