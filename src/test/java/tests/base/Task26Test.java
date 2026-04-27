package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Task26Test {

    @Test
    @DisplayName("Gemini: removeDuplicates")
    void gemini_removeDuplicates() {
        solutions.gemini.Task26 s = new solutions.gemini.Task26();
        assertEquals(List.of(), s.removeDuplicates(new ArrayList<>(List.of())));
        assertEquals(Arrays.asList(1, 2, 3, 4), s.removeDuplicates(new ArrayList<>(Arrays.asList(1, 2, 3, 4))));
        assertEquals(Arrays.asList(1, 4, 5), s.removeDuplicates(new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 3, 5))));
    }

    @Test
    @DisplayName("Claude: removeDuplicates")
    void claude_removeDuplicates() {
        solutions.claude.Task26 s = new solutions.claude.Task26();
        assertEquals(List.of(), s.removeDuplicates(new ArrayList<>(List.of())));
        assertEquals(Arrays.asList(1, 2, 3, 4), s.removeDuplicates(new ArrayList<>(Arrays.asList(1, 2, 3, 4))));
        assertEquals(Arrays.asList(1, 4, 5), s.removeDuplicates(new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 3, 5))));
    }

}
