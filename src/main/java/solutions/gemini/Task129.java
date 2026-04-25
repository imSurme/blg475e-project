package solutions.gemini;

import java.util.*;
import java.lang.*;

/* @Authors
 * Student Names: Başar Filizcan, İbrahim Mert Sürme, Ahmet Atakan Çulban
 * Student IDs: 820220722, 150220052, 820220342
 */
public class Task129 {
    /**
     * N elemanlı bir sayı listesindeki bitişik alt diziler arasından, toplamı minimum olan alt dizinin toplam değerini bulan 'minPath' adında bir Java metodu yaz.
     */
    public int minPath(int[] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        // Kadane Algoritması'nın minimum toplam için modifiye edilmiş hali
        int minEndingHere = grid[0];
        int minSoFar = grid[0];
        
        for (int i = 1; i < grid.length; i++) {
            // Ya mevcut elemanı önceki toplama ekle ya da mevcut elemandan yeni bir seri başlat
            minEndingHere = Math.min(grid[i], minEndingHere + grid[i]);
            // Şimdiye kadar gördüğümüz en küçük değeri güncelle
            minSoFar = Math.min(minSoFar, minEndingHere);
        }
        
        return minSoFar;
    }
}