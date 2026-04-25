package solutions.claude;

import java.util.*;
import java.lang.*;

public class Task32 {
    /**
     * Evaluates polynomial with coefficients xs at point x.
     * return xs[0] + xs[1] * x + xs[1] * x^2 + .... xs[n] * x^n
     */
    public double poly(List<Double> xs, double x) {
        double result = 0;
        for (int i = 0; i < xs.size(); i++) {
            result += xs.get(i) * Math.pow(x, i);
        }
        return result;
    }

    /**
     * xs are coefficients of a polynomial.
     * findZero find x such that poly(x) = 0.
     * findZero returns only one zero point, even if there are many.
     * Moreover, findZero only takes list xs having even number of coefficients
     * and largest non zero coefficient as it guarantees a solution.
     * >>> findZero(Arrays.asList(1, 2)) // f(x) = 1 + 2x
     * -0.5
     * >>> findZero(Arrays.asList(-6, 11, -6, 1)) // (x - 1) * (x - 2) * (x - 3)
     * 1.0
     */
    public double findZero(List<Double> xs) {
        double left = -1000.0;
        double right = 1000.0;
        double epsilon = 1e-9;

        // Expand search bounds until we find an interval with a sign change
        while (poly(xs, left) * poly(xs, right) > 0) {
            left *= 2;
            right *= 2;
        }

        // Binary search (bisection method) for the zero
        while ((right - left) > epsilon) {
            double mid = (left + right) / 2.0;
            if (poly(xs, left) * poly(xs, mid) <= 0) {
                right = mid;
            } else {
                left = mid;
            }
        }

        return (left + right) / 2.0;
    }
}
