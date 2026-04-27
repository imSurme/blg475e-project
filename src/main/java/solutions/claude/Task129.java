

package solutions.claude;

import java.util.List;
/**
     * N elemanlı bir sayı listesindeki bitişik alt diziler arasından,
     * toplamı minimum olan alt dizinin toplam değerini bulur (Kadane algoritması - minimum için).
     * Örnek: [2, 3, -4, -1, 2] için -5 döndürür.
     * Örnek: [1, 2, 3] için 1 döndürür.
     * @param nums Tam sayılardan oluşan liste
     * @return Toplamı minimum olan bitişik alt dizinin toplam değeri
     */
public class Task129 {
    public int minPath(List<Integer> grid) {
        if (grid == null || grid.isEmpty()) return 0;

        int minSum = grid.get(0);
        int currentSum = grid.get(0);

        for (int i = 1; i < grid.size(); i++) {
            int val = grid.get(i);
            currentSum = Math.min(val, currentSum + val);
            minSum = Math.min(minSum, currentSum);
        }

        return minSum;
    }
}