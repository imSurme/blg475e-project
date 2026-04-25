package solutions.claude;

import java.util.*;
import java.lang.*;

class Task1 {
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
        StringBuilder current = new StringBuilder();
        int depth = 0;

        for (char c : paren_string.toCharArray()) {
            if (c == ' ') continue;  // ignore spaces

            if (c == '(') {
                depth++;
                current.append(c);
            } else if (c == ')') {
                depth--;
                current.append(c);

                if (depth == 0) {  // completed a top-level group
                    result.add(current.toString());
                    current.setLength(0);  // reset builder
                }
            }
        }

        return result;
    }
}
