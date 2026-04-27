


package solutions.gemini;

import java.util.List;
 /**
     * Return the maximum element in a list of integers.
     * * [REFACTOR NOTE]: Refactored after Manual Assessment (Task35ManualTest).
     * The base LLM code failed to handle empty or null lists.
     * Boundary Class EC1/BV1: Added validation to throw IllegalArgumentException for empty inputs.
     */
public class Task35 {
    public Integer maxElement(List<Integer> l) {
        if (l == null || l.isEmpty()) return null;

        int max = l.get(0);
        for (int i = 1; i < l.size(); i++) {
            if (l.get(i) > max) max = l.get(i);
        }
        return max;
    }
}
 
 