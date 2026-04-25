package solutions.gemini;

import java.util.*;
import java.lang.*;

public class Task1 {
    /**
    Input to this function is a string containing multiple groups of nested parentheses. Your goal is to
    separate those group into separate strings and return the list of those.
    Separate groups are balanced (each open brace is properly closed) and not nested within each other
    Ignore any spaces in the input string.
    >>> separateParenGroups("( ) (( )) (( )( ))")
    ["()", "(())", "(()())"]
     */
    public List<String> separateParenGroups(String paren_string) {
        List<String> result = new ArrayList<>();
        StringBuilder currentGroup = new StringBuilder();
        int balance = 0;

        for (char c : paren_string.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            
            currentGroup.append(c);
            
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }

            if (balance == 0 && currentGroup.length() > 0) {
                result.add(currentGroup.toString());
                currentGroup.setLength(0);
            }
        }

        return result;
    }
}
