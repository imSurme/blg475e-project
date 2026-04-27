package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Task14Test {

    @Test
    @DisplayName("Gemini: allPrefixes")
    void gemini_allPrefixes() {
        solutions.gemini.Task14 s = new solutions.gemini.Task14();
        assertEquals(List.of(), s.allPrefixes(""));
        assertEquals(Arrays.asList("a", "as", "asd", "asdf", "asdfg", "asdfgh"), s.allPrefixes("asdfgh"));
        assertEquals(Arrays.asList("W", "WW", "WWW"), s.allPrefixes("WWW"));
    }

    @Test
    @DisplayName("Claude: allPrefixes")
    void claude_allPrefixes() {
        solutions.claude.Task14 s = new solutions.claude.Task14();
        assertEquals(List.of(), s.allPrefixes(""));
        assertEquals(Arrays.asList("a", "as", "asd", "asdf", "asdfg", "asdfgh"), s.allPrefixes("asdfgh"));
        assertEquals(Arrays.asList("W", "WW", "WWW"), s.allPrefixes("WWW"));
    }

}
