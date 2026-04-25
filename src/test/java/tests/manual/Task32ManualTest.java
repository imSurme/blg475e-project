package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Task32ManualTest {

    private static final double EPS = 1e-6;

    @Test
    @DisplayName("Both: root at zero boundary")
    void both_rootAtZero() {
        List<Double> coeffs = Arrays.asList(0.0, 1.0);
        solutions.gemini.Task32 g = new solutions.gemini.Task32();
        solutions.claude.Task32 c = new solutions.claude.Task32();

        double rg = g.findZero(coeffs);
        double rc = c.findZero(coeffs);

        assertTrue(Math.abs(g.poly(coeffs, rg)) < EPS);
        assertTrue(Math.abs(c.poly(coeffs, rc)) < EPS);
    }

    @Test
    @DisplayName("Both: small-coefficient mutation")
    void both_smallCoeffMutation() {
        List<Double> coeffs = Arrays.asList(0.001, 1.0);
        solutions.gemini.Task32 g = new solutions.gemini.Task32();
        solutions.claude.Task32 c = new solutions.claude.Task32();

        double rg = g.findZero(coeffs);
        double rc = c.findZero(coeffs);

        assertTrue(Math.abs(g.poly(coeffs, rg)) < EPS);
        assertTrue(Math.abs(c.poly(coeffs, rc)) < EPS);
    }

    @Test
    @DisplayName("Both: large-coefficient mutation")
    void both_largeCoeffMutation() {
        List<Double> coeffs = Arrays.asList(-1000.0, 1.0);
        solutions.gemini.Task32 g = new solutions.gemini.Task32();
        solutions.claude.Task32 c = new solutions.claude.Task32();

        double rg = g.findZero(coeffs);
        double rc = c.findZero(coeffs);

        assertTrue(Math.abs(g.poly(coeffs, rg)) < EPS);
        assertTrue(Math.abs(c.poly(coeffs, rc)) < EPS);
    }
}
