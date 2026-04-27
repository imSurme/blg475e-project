package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Task129ManualTest {

    @Test
    @DisplayName("Both: 1x1 matrix boundary")
    void both_matrix1x1() {
        solutions.gemini.Task129 g = new solutions.gemini.Task129();
        solutions.claude.Task129 c = new solutions.claude.Task129();
        
       
        int[] gridArray = {5};
        assertEquals(5, g.minPath(gridArray), "Gemini: 1x1 array should return 5");
        
        
        List<Integer> gridList = Collections.singletonList(5);
        assertEquals(5, c.minPath(gridList), "Claude: 1x1 list should return 5");
    }

    @Test
@DisplayName("Gemini: single row mutation")
void gemini_singleRow() {
    solutions.gemini.Task129 s = new solutions.gemini.Task129();
    int[] grid = {1, 2, 3};
    assertEquals(1, s.minPath(grid), "Gemini: Single row should return minimum element");
}

   @Test
@DisplayName("Claude: remove all mutation (empty grid)")
void claude_emptyGrid() {
    solutions.claude.Task129 s = new solutions.claude.Task129();
    List<Integer> emptyGrid = new ArrayList<>();
    assertEquals(0, s.minPath(emptyGrid), "Claude: Empty list should return 0");
}
}