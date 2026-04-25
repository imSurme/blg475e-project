package solutions.gemini;

import java.util.*;
import java.lang.*;

public class Task2 {
    /**
    Given a positive floating point number, it can be decomposed into
    an integer part (largest integer smaller than given number) and decimals
    (leftover part always smaller than 1).

    Return the decimal part of the number.
    >>> truncateNumber(3.5)
    0.5
     */
    public double truncateNumber(double number) {
        return number % 1.0;
    }
}
