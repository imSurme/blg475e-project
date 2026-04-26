package solutions.gemini;

import java.util.*;
import java.lang.*;

public class Task13 {
    /**
    Return a greatest common divisor of two integers a and b
    >>> greatestCommonDivisor(3, 5)
    1
    >>> greatestCommonDivisor(25, 15)
    5
     */
    public int greatestCommonDivisor(int a, int b) {
while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
