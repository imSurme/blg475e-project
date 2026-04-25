package solutions.gemini;

import java.util.*;
import java.lang.*;

/* @Authors
 * Student Names: Başar Filizcan, İbrahim Mert Sürme, Ahmet Atakan Çulban
 * Student IDs: 820220722, 150220052, 820220342
 */
public class Task68 {
    /**
     * Verilen bir tam sayı dizisindeki en küçük çift sayıyı ve indeksini [değer, indeks] formatında bir dizi olarak döndüren 'pluck' adında bir Java metodu yaz. 
     * Çift sayı yoksa boş dizi döndürsün.
     */
    public int[] pluck(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        
        int minEven = Integer.MAX_VALUE;
        int minIndex = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] < minEven) {
                    minEven = arr[i];
                    minIndex = i;
                }
            }
        }
        
        if (minIndex == -1) {
            return new int[0];
        }
        
        return new int[]{minEven, minIndex};
    }
}