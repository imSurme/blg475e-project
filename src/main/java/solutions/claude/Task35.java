
package solutions.claude;

import java.util.List;
 /**
     * Return the maximum element in a list of integers.
     * * [REFACTOR NOTE]: Refactored after Manual Assessment (Task35ManualTest).
     * Integrated boundary checks to ensure robust handling of EC1/BV1 (empty/null cases)
     * as required by manual black-box testing results.
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