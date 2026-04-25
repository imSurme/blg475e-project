package solutions.claude;
import java.util.*;
import java.lang.*;
/* @Authors
 * Student Names: Başar Filizcan, İbrahim Mert Sürme, Ahmet Atakan Çulban
 * Student IDs: 820220722, 150220052, 820220342
 */
public class Task129 {
    /**
     * N elemanlı bir sayı listesindeki bitişik alt diziler arasından,
     * toplamı minimum olan alt dizinin toplam değerini bulur (Kadane algoritması - minimum için).
     * Örnek: [2, 3, -4, -1, 2] için -5 döndürür.
     * Örnek: [1, 2, 3] için 1 döndürür.
     * @param nums Tam sayılardan oluşan liste
     * @return Toplamı minimum olan bitişik alt dizinin toplam değeri
     */
    public int minPath(List<Integer> nums) {
        int minSum = nums.get(0);
        int currentSum = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            currentSum = Math.min(nums.get(i), currentSum + nums.get(i));
            minSum = Math.min(minSum, currentSum);
        }
        return minSum;
    }
}