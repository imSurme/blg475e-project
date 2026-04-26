package solutions.claude;

import java.util.*;
import java.lang.*;

public class Task48 {
    /**
    Checks if given string is a palindrome
    >>> isPalindrome("")
    true
    >>> isPalindrome("aba")
    true
    >>> isPalindrome("aaaaa")
    true
    >>> isPalindrome("zbcd")
    false
     */
    public boolean isPalindrome(String text) {
int left = 0, right = text.length() - 1;
while (left < right) {
    if (text.charAt(left) != text.charAt(right)) {
        return false;
    }
    left++;
    right--;
}
return true;
    }
}
