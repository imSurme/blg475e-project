package solutions.gemini;

import java.util.*;
import java.lang.*;

public class Task18 {
    /**
    Find how many times a given substring can be found in the original string. Count overlaping cases.
    >>> howManyTimes("", "a")
    0
    >>> howManyTimes("aaa", "a")
    3
    >>> howManyTimes("aaaa", "aa")
    3
     */
    public int howManyTimes(String string, String substring) {
if (string == null || string.isEmpty() || substring == null || substring.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        int index = 0;
        
        while ((index = string.indexOf(substring, index)) != -1) {
            count++;
            index += 1; // Increment by 1 to allow overlapping matches
        }
        
        return count;
    }
}
