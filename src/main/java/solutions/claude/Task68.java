package solutions.claude;
import java.util.*;
import java.lang.*;
/* @Authors
 * Student Names: Başar Filizcan, İbrahim Mert Sürme, Ahmet Atakan Çulban
 * Student IDs: 820220722, 150220052, 820220342
 */
public class Task68 {
    /**
     * Verilen bir tam sayı dizisindeki en küçük çift sayıyı ve indeksini döndürür.
     * Sonuç [değer, indeks] formatında bir dizi olarak döndürülür.
     * Eğer dizide hiç çift sayı yoksa boş dizi döndürür.
     * Örnek: [4, 2, 3] için [2, 1] döndürür.
     * Örnek: [1, 3, 5] için [] döndürür.
     * @param arr Tam sayılardan oluşan dizi
     * @return En küçük çift sayı ve indeksini içeren dizi, çift sayı yoksa boş dizi
     */
    public List<Long> pluck(List<Long> arr) {
        List<Long> result = new ArrayList<>();
        if (arr == null || arr.isEmpty()) {
            return result;
        }
        long minEven = Long.MAX_VALUE;
        long minIndex = -1;
        for (int i = 0; i < arr.size(); i++) {
            long val = arr.get(i);
            if (val % 2 == 0 && val < minEven) {
                minEven = val;
                minIndex = i;
            }
        }
        if (minIndex != -1) {
            result.add(minEven);
            result.add(minIndex);
        }
        return result;
    }
}