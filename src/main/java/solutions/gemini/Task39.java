package solutions.gemini;

import java.util.*;
import java.lang.*;

class Task39 {
    /**
    primeFib returns n-th number that is a Fibonacci number and it's also prime.
    >>> primeFib(1)
    2
    >>> primeFib(2)
    3
    >>> primeFib(3)
    5
    >>> primeFib(4)
    13
    >>> primeFib(5)
    89
     */
    public int primeFib(int n) {
        int count = 0;
        int a = 1;
        int b = 1;

        while (true) {
            int next = a + b;
            a = b;
            b = next;
            
            if (isPrime(a)) {
                count++;
                if (count == n) {
                    return a;
                }
            }
        }
    }
    
    private boolean isPrime(int k) {
        if (k < 2) {
            return false;
        }
        if (k == 2 || k == 3) {
            return true;
        }
        if (k % 2 == 0 || k % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= k; i += 6) {
            if (k % i == 0 || k % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
