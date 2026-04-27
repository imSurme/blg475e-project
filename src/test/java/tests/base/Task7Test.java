package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Task7Test {

    @Test
    @DisplayName("Gemini: filterBySubstring")
    void gemini_filterBySubstring() {
        solutions.gemini.Task7 s = new solutions.gemini.Task7();
        assertEquals(List.of(), s.filterBySubstring(new ArrayList<>(List.of()), "john"));
        assertEquals(Arrays.asList("xxx", "xxxAAA", "xxx"), s.filterBySubstring(new ArrayList<>(Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx")), "xxx"));
        assertEquals(Arrays.asList("xxx", "aaaxxy", "xxxAAA", "xxx"), s.filterBySubstring(new ArrayList<>(Arrays.asList("xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx")), "xx"));
        assertEquals(Arrays.asList("grunt", "prune"), s.filterBySubstring(new ArrayList<>(Arrays.asList("grunt", "trumpet", "prune", "gruesome")), "run"));
    }

    @Test
    @DisplayName("Claude: filterBySubstring")
    void claude_filterBySubstring() {
        solutions.claude.Task7 s = new solutions.claude.Task7();
        assertEquals(List.of(), s.filterBySubstring(new ArrayList<>(List.of()), "john"));
        assertEquals(Arrays.asList("xxx", "xxxAAA", "xxx"), s.filterBySubstring(new ArrayList<>(Arrays.asList("xxx", "asd", "xxy", "john doe", "xxxAAA", "xxx")), "xxx"));
        assertEquals(Arrays.asList("xxx", "aaaxxy", "xxxAAA", "xxx"), s.filterBySubstring(new ArrayList<>(Arrays.asList("xxx", "asd", "aaaxxy", "john doe", "xxxAAA", "xxx")), "xx"));
        assertEquals(Arrays.asList("grunt", "prune"), s.filterBySubstring(new ArrayList<>(Arrays.asList("grunt", "trumpet", "prune", "gruesome")), "run"));
    }

}
