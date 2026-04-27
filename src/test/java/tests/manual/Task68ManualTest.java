package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task68ManualTest {

    @Test
    @DisplayName("Both: remove all boundary (empty structures)")
    void both_emptyInput() {
        solutions.gemini.Task68 g = new solutions.gemini.Task68();
        solutions.claude.Task68 c = new solutions.claude.Task68();
        
        
        int[] emptyArray = new int[0];
        assertArrayEquals(emptyArray, g.pluck(emptyArray), 
            "Gemini: Empty array should return an empty array.");
            
        
        List<Long> emptyList = new ArrayList<>();
        assertEquals(emptyList, c.pluck(emptyList), 
            "Claude: Empty list should return an empty list.");
    }

    @Test
    @DisplayName("Gemini: make odd mutation")
    void gemini_makeOdd() {
        solutions.gemini.Task68 s = new solutions.gemini.Task68();
        
        
        int[] input = {5, 3, 7};
        int[] expectedOutput = new int[0];
        
        assertArrayEquals(expectedOutput, s.pluck(input), 
            "Gemini: Array with only odd numbers should return an empty array.");
    }

    @Test
    @DisplayName("Claude: make negative mutation")
    void claude_makeNegative() {
        solutions.claude.Task68 s = new solutions.claude.Task68();
        
        
        List<Long> input = Arrays.asList(-4L, -2L, -6L);
        List<Long> expectedOutput = Arrays.asList(-6L, 2L);
        
        assertEquals(expectedOutput, s.pluck(input), 
            "Claude: Should correctly identify the smallest negative even number and its index.");
    }
}