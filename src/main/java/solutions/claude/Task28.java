package solutions.claude;

import java.util.*;
import java.lang.*;

class Task28 {
    /**
    Concatenate list of strings into a single string
    >>> concatenate(List.of())
    ""
    >>> concatenate(Arrays.asList("a", "b", "c"))
    "abc"
     */
    public String concatenate(List<String> strings) {
        return String.join("", strings);
    }
}
