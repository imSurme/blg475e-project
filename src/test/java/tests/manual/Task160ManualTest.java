package tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task160ManualTest {

    @Test
    @DisplayName("Both: remove all operators boundary")
    void both_emptyOperators() {
        solutions.gemini.Task160 g = new solutions.gemini.Task160();
        solutions.claude.Task160 c = new solutions.claude.Task160();
        
        
        String[] emptyOpsArray = new String[0];
        int[] singleOperandArray = {42};
        assertEquals(42, g.doAlgebra(emptyOpsArray, singleOperandArray), 
            "Gemini: Empty operators should return the single operand.");
        
        
        List<String> emptyOpsList = new ArrayList<>(); 
        List<Integer> singleOperandList = Collections.singletonList(42); 
        assertEquals(42, c.doAlgebra(emptyOpsList, singleOperandList), 
            "Claude: Empty operators should return the single operand."); 
    }

    @Test
    @DisplayName("Gemini: invalid operator mutation")
    void gemini_invalidOp() {
        solutions.gemini.Task160 s = new solutions.gemini.Task160();
        
   
        String[] ops = {"?"};
        int[] vals = {10, 5};
        
        
        assertEquals(10, s.doAlgebra(ops, vals));
    }

    @Test
    @DisplayName("Claude: set to zero mutation")
    void claude_multiplyByZero() {
        solutions.claude.Task160 s = new solutions.claude.Task160();
        
        // Claude List bekliyor
        List<String> ops = Collections.singletonList("*");
        List<Integer> vals = Arrays.asList(10, 0);
        
        assertEquals(0, s.doAlgebra(ops, vals));
    }
}