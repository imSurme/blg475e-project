package solutions.claude;
import java.util.*;
import java.lang.*;
/* @Authors
 * Student Names: Başar Filizcan, İbrahim Mert Sürme, Ahmet Atakan Çulban
 * Student IDs: 820220722, 150220052, 820220342
 */
public class Task35 {
    /**
     * Verilen bir tam sayı listesi içindeki en büyük elemanı (maksimum değeri) bulup döndürür.
     * @param numbers Tam sayılardan oluşan liste
     * @return Listedeki maksimum değer
     */
    public int maxElement(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}