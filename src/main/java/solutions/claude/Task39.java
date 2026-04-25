package solutions.claude;

import java.util.*;
import java.lang.*;

class Task39 {
    /**
     * primeFib returns n-th number that is a Fibonacci number and it's also prime.
     * >>> primeFib(1)  -> 2
     * >>> primeFib(2)  -> 3
     * >>> primeFib(3)  -> 5
     * >>> primeFib(4)  -> 13
     * >>> primeFib(5)  -> 89
     */

    private boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public int primeFib(int n) {
        int count = 0;
        int a = 0, b = 1;

        while (true) {
            int fib = a + b;
            a = b;
            b = fib;

            if (isPrime(fib)) {
                count++;
                if (count == n) return fib;
            }
        }
    }
}
