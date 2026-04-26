package tests.improved;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task160ImprovedTest {

    // ==================== SHARED OPERATOR CONSTANTS ====================

    private static final String OP_ADD = "+";
    private static final String OP_SUB = "-";
    private static final String OP_MUL = "*";

    // ==================== GEMINI CONSTANTS ====================

    private static final List<String>  ADD_OPS              = Arrays.asList(OP_ADD);
    private static final List<Integer> ADD_VALS             = Arrays.asList(10, 5);
    private static final int           EXPECTED_ADD         = 15;

    private static final List<String>  SUB_OPS              = Arrays.asList(OP_SUB);
    private static final List<Integer> SUB_VALS             = Arrays.asList(10, 5);
    private static final int           EXPECTED_SUB         = 5;

    private static final List<String>  MUL_OPS              = Arrays.asList(OP_MUL);
    private static final List<Integer> MUL_VALS             = Arrays.asList(10, 5);
    private static final int           EXPECTED_MUL         = 50;

    private static final List<String>  COMBO_OPS            = Arrays.asList(OP_ADD, OP_MUL, OP_SUB);
    private static final List<Integer> COMBO_VALS           = Arrays.asList(2, 3, 4, 5);
    private static final int           EXPECTED_COMBO       = 15;

    private static final int[]         NULL_OPERANDS        = null;
    private static final int[]         EMPTY_OPERANDS       = new int[0];
    private static final String[]      EMPTY_OPS_FOR_NULL   = new String[0];
    private static final int           EXPECTED_NULL_RESULT = 0;

    // ==================== CLAUDE CONSTANTS ====================

    private static final List<String>  ALL_ADD_OPS          = Arrays.asList(OP_ADD, OP_ADD, OP_ADD);
    private static final List<Integer> ALL_ADD_VALS         = Arrays.asList(1, 2, 3, 4);
    private static final int           EXPECTED_ALL_ADD     = 10;

    private static final List<String>  NEG_OPS              = Arrays.asList(OP_SUB, OP_SUB);
    private static final List<Integer> NEG_VALS             = Arrays.asList(10, 8, 5);
    private static final int           EXPECTED_NEG         = -3;

    private static final List<String>  MUL_ZERO_OPS         = Arrays.asList(OP_MUL);
    private static final List<Integer> MUL_ZERO_VALS        = Arrays.asList(5, 0);
    private static final int           EXPECTED_MUL_ZERO    = 0;

    private static final List<Integer> SINGLE_VAL           = Collections.singletonList(42);
    private static final int           EXPECTED_SINGLE      = 42;

    // ==================== GEMINI IMPROVED TESTS ====================

    @Test
    @DisplayName("Gemini: Should correctly perform addition using String[] and int[]")
    void gemini_doAlgebra_addition() {
        solutions.gemini.Task160 s = new solutions.gemini.Task160();
        String[] ops = ADD_OPS.toArray(new String[0]);
        int[] vals = ADD_VALS.stream().mapToInt(Integer::intValue).toArray();
        assertEquals(EXPECTED_ADD, s.doAlgebra(ops, vals),
            "Assertion Roulette Fix: Addition branch failed in Gemini implementation.");
    }

    @Test
    @DisplayName("Gemini: Should correctly perform subtraction branch")
    void gemini_doAlgebra_subtraction() {
        solutions.gemini.Task160 s = new solutions.gemini.Task160();
        String[] ops = SUB_OPS.toArray(new String[0]);
        int[] vals = SUB_VALS.stream().mapToInt(Integer::intValue).toArray();
        assertEquals(EXPECTED_SUB, s.doAlgebra(ops, vals),
            "Assertion Roulette Fix: Subtraction branch failed in Gemini implementation.");
    }

    @Test
    @DisplayName("Gemini: Should correctly perform multiplication branch")
    void gemini_doAlgebra_multiplication() {
        solutions.gemini.Task160 s = new solutions.gemini.Task160();
        String[] ops = MUL_OPS.toArray(new String[0]);
        int[] vals = MUL_VALS.stream().mapToInt(Integer::intValue).toArray();
        assertEquals(EXPECTED_MUL, s.doAlgebra(ops, vals),
            "Assertion Roulette Fix: Multiplication branch failed in Gemini implementation.");
    }

    @Test
    @DisplayName("Gemini: Should process combined operations in sequence")
    void gemini_doAlgebra_combined() {
        solutions.gemini.Task160 s = new solutions.gemini.Task160();
        String[] ops = COMBO_OPS.toArray(new String[0]);
        int[] vals = COMBO_VALS.stream().mapToInt(Integer::intValue).toArray();
        assertEquals(EXPECTED_COMBO, s.doAlgebra(ops, vals),
            "Assertion Roulette Fix: Combined algebra sequence failed in Gemini implementation.");
    }

    @Test
    @DisplayName("Gemini: Should return 0 for null operands")
    void gemini_doAlgebra_nullOperands() {
        solutions.gemini.Task160 s = new solutions.gemini.Task160();
        assertEquals(EXPECTED_NULL_RESULT, s.doAlgebra(EMPTY_OPS_FOR_NULL, NULL_OPERANDS),
            "Null operands should return 0.");
    }

    @Test
    @DisplayName("Gemini: Should return 0 for empty operands")
    void gemini_doAlgebra_emptyOperands() {
        solutions.gemini.Task160 s = new solutions.gemini.Task160();
        assertEquals(EXPECTED_NULL_RESULT, s.doAlgebra(EMPTY_OPS_FOR_NULL, EMPTY_OPERANDS),
            "Empty operands should return 0.");
    }

    // ==================== CLAUDE IMPROVED TESTS ====================

    @Test
    @DisplayName("Claude: Should correctly perform addition using Lists")
    void claude_doAlgebra_addition() {
        solutions.claude.Task160 s = new solutions.claude.Task160();
        assertEquals(EXPECTED_ADD, s.doAlgebra(ADD_OPS, ADD_VALS),
            "Simple addition failed: 10 + 5 should be " + EXPECTED_ADD);
    }

    @Test
    @DisplayName("Claude: Should correctly perform subtraction using Lists")
    void claude_doAlgebra_subtraction() {
        solutions.claude.Task160 s = new solutions.claude.Task160();
        assertEquals(EXPECTED_SUB, s.doAlgebra(SUB_OPS, SUB_VALS),
            "Simple subtraction failed: 10 - 5 should be " + EXPECTED_SUB);
    }

    @Test
    @DisplayName("Claude: Should correctly perform multiplication using Lists")
    void claude_doAlgebra_multiplication() {
        solutions.claude.Task160 s = new solutions.claude.Task160();
        assertEquals(EXPECTED_MUL, s.doAlgebra(MUL_OPS, MUL_VALS),
            "Simple multiplication failed: 10 * 5 should be " + EXPECTED_MUL);
    }

    @Test
    @DisplayName("Claude: Should correctly compute mixed operations using Lists")
    void claude_doAlgebra_mixedOperations() {
        solutions.claude.Task160 s = new solutions.claude.Task160();
        assertEquals(EXPECTED_COMBO, s.doAlgebra(COMBO_OPS, COMBO_VALS),
            "Mixed operations left to right failed, expected " + EXPECTED_COMBO);
    }

    @Test
    @DisplayName("Claude: Should handle all addition operators")
    void claude_doAlgebra_allAddition() {
        solutions.claude.Task160 s = new solutions.claude.Task160();
        assertEquals(EXPECTED_ALL_ADD, s.doAlgebra(ALL_ADD_OPS, ALL_ADD_VALS),
            "All addition failed: 1+2+3+4 should be " + EXPECTED_ALL_ADD);
    }

    @Test
    @DisplayName("Claude: Should handle negative result from subtraction")
    void claude_doAlgebra_negativeResult() {
        solutions.claude.Task160 s = new solutions.claude.Task160();
        assertEquals(EXPECTED_NEG, s.doAlgebra(NEG_OPS, NEG_VALS),
            "Negative result failed: 10-8-5 should be " + EXPECTED_NEG);
    }

    @Test
    @DisplayName("Claude: Should handle multiplication by zero")
    void claude_doAlgebra_multiplyByZero() {
        solutions.claude.Task160 s = new solutions.claude.Task160();
        assertEquals(EXPECTED_MUL_ZERO, s.doAlgebra(MUL_ZERO_OPS, MUL_ZERO_VALS),
            "Multiply by zero failed: 5 * 0 should be " + EXPECTED_MUL_ZERO);
    }

    @Test
    @DisplayName("Claude: Should return first operand when operator list is empty")
    void claude_doAlgebra_emptyOperators() {
        solutions.claude.Task160 s = new solutions.claude.Task160();
        assertEquals(EXPECTED_SINGLE, s.doAlgebra(Collections.emptyList(), SINGLE_VAL),
            "Empty operator list should return first operand: " + EXPECTED_SINGLE);
    }
}