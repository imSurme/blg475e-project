package solutions.claude;

import java.util.*;
import java.lang.*;

public class Task10 {
    /**
     * Test if given string is a palindrome
     */
    public boolean isPalindrome(String string) {
        int i = 0;
        int j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /**
     * Find the shortest palindrome that begins with a supplied string.
     * Algorithm idea is simple:
     * - Find the longest postfix of supplied string that is a palindrome.
     * - Append to the end of the string reverse of a string prefix that comes before the palindromic suffix.
     * >>> makePalindrome("")
     * ""
     * >>> makePalindrome("cat")
     * "catac"
     * >>> makePalindrome("cata")
     * "catac"
     */
    public String makePalindrome(String string) {
        if (string.isEmpty()) return "";

        // Find the longest palindromic suffix
        for (int i = 0; i < string.length(); i++) {
            String suffix = string.substring(i);
            if (isPalindrome(suffix)) {
                // Reverse the prefix that comes before the palindromic suffix
                String prefix = string.substring(0, i);
                String reversedPrefix = new StringBuilder(prefix).reverse().toString();
                return string + reversedPrefix;
            }
        }

        return string;
    }
}
