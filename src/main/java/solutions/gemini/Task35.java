package solutions.gemini;

import java.util.*;
import java.lang.*;

/* @Authors
 * Student Names: Başar Filizcan, İbrahim Mert Sürme, Ahmet Atakan Çulban
 * Student IDs: 820220722, 150220052, 820220342
 */
public class Task35 {
    /**
     * Verilen bir tam sayı listesi içindeki en büyük elemanı (maksimum değeri) bulup döndüren 'maxElement' adında bir Java metodu yaz.
     */
    public Integer maxElement(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return null;
        }
        return Collections.max(numbers);
    }
}