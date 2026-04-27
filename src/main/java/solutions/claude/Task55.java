package solutions.claude;

import java.util.*;
import java.lang.*;

public class Task55 {
    /**
    Return n-th Fibonacci number.
    >>> fib(10)
    55
    >>> fib(1)
    1
    >>> fib(8)
    21
     */
    public int fib(int n) {
if (n <= 0) return 0;
if (n == 1) return 1;
int a = 0, b = 1;
for (int i = 2; i <= n; i++) {
    int temp = a + b;
    a = b;
    b = temp;
}
return b;
    }
}
