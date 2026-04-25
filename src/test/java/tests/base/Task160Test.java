package tests.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class Task160Test {

    // ==================== GEMINI TESTS ====================

    @Test
    @DisplayName("Gemini: doAlgebra should perform simple addition")
    void gemini_doAlgebra_addition() {
        solutions.gemini.Task160 s = new solutions.gemini.Task160();
        assertEquals(5, s.doAlgebra(new String[]{"+"}, new int[]{2, 3}));
    }

    @Test
    @DisplayName("Gemini: doAlgebra should perform simple subtraction")
    void gemini_doAlgebra_subtraction() {
        solutions.gemini.Task160 s = new solutions.gemini.Task160();
        assertEquals(2, s.doAlgebra(new String[]{"-"}, new int[]{5, 3}));
    }

    @Test
    @DisplayName("Gemini: doAlgebra should compute mixed operations strictly left to right")
    void gemini_doAlgebra_mixedOperations() {
        solutions.gemini.Task160 s = new solutions.gemini.Task160();
        // ((2 + 3) * 4) - 5 = (5 * 4) - 5 = 15
        assertEquals(15, s.doAlgebra(new String[]{"+", "*", "-"}, new int[]{2, 3, 4, 5}));
    }

    @Test
    @DisplayName("Gemini: doAlgebra should return 0 for empty or null operands")
    void gemini_doAlgebra_emptyOrNull() {
        solutions.gemini.Task160 s = new solutions.gemini.Task160();
        assertEquals(0, s.doAlgebra(new String[]{}, new int[]{}));
        assertEquals(0, s.doAlgebra(null, null));
    }
// ==================== CLAUDE TESTS ====================

    @Test
    @DisplayName("Claude: doAlgebra should perform simple addition")
    void claude_doAlgebra_addition() {
        solutions.claude.Task160 s = new solutions.claude.Task160();
        assertEquals(5, s.doAlgebra(Arrays.asList("+"), Arrays.asList(2, 3)));
    }

    @Test
    @DisplayName("Claude: doAlgebra should perform simple subtraction")
    void claude_doAlgebra_subtraction() {
        solutions.claude.Task160 s = new solutions.claude.Task160();
        assertEquals(2, s.doAlgebra(Arrays.asList("-"), Arrays.asList(5, 3)));
    }

    @Test
    @DisplayName("Claude: doAlgebra should perform simple multiplication")
    void claude_doAlgebra_multiplication() {
        solutions.claude.Task160 s = new solutions.claude.Task160();
        assertEquals(12, s.doAlgebra(Arrays.asList("*"), Arrays.asList(3, 4)));
    }

    @Test
    @DisplayName("Claude: doAlgebra should compute mixed operations strictly left to right")
    void claude_doAlgebra_mixedOperations() {
        solutions.claude.Task160 s = new solutions.claude.Task160();
        assertEquals(15, s.doAlgebra(Arrays.asList("+", "*", "-"), Arrays.asList(2, 3, 4, 5)));
    }

    @Test
    @DisplayName("Claude: doAlgebra should handle all same operators")
    void claude_doAlgebra_allAddition() {
        solutions.claude.Task160 s = new solutions.claude.Task160();
        assertEquals(10, s.doAlgebra(Arrays.asList("+", "+", "+"), Arrays.asList(1, 2, 3, 4)));
    }

    @Test
    @DisplayName("Claude: doAlgebra should handle negative result from subtraction")
    void claude_doAlgebra_negativeResult() {
        solutions.claude.Task160 s = new solutions.claude.Task160();
        assertEquals(-3, s.doAlgebra(Arrays.asList("-", "-"), Arrays.asList(10, 8, 5)));
    }

    @Test
    @DisplayName("Claude: doAlgebra should handle single zero operand multiplication")
    void claude_doAlgebra_multiplyByZero() {
        solutions.claude.Task160 s = new solutions.claude.Task160();
        assertEquals(0, s.doAlgebra(Arrays.asList("*"), Arrays.asList(5, 0)));
    }
}