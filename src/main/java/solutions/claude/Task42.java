package solutions.claude;
import java.util.*;
import java.lang.*;
/* @Authors
 * Student Names: Başar Filizcan, İbrahim Mert Sürme, Ahmet Atakan Çulban
 * Student IDs: 820220722, 150220052, 820220342
 */
public class Task42 {
    /**
     * Verilen bir tam sayı listesindeki her bir elemanın değerini 1 artırır ve yeni bir liste olarak döndürür.
     * @param numbers Tam sayılardan oluşan liste
     * @return Her elemanı 1 artırılmış yeni liste
     */
    public List<Integer> incrList(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int num : numbers) {
            result.add(num + 1);
        }
        return result;
    }
}