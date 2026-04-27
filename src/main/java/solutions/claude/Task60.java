package solutions.claude;

public class Task60 {
    /**
     * Return the sum of numbers from 1 to n.
     * * [REFACTOR NOTE]: Refactored after Manual Assessment (Task60ManualTest).
     * The initial LLM implementation applied the mathematical formula incorrectly 
     * for negative integers (EC4). Added a defensive check to return 0 for n <= 0.
     */
    public int sumToN(int n) {
        if (n <= 0) {
            return 0;
        }
        return n * (n + 1) / 2;
    }
}