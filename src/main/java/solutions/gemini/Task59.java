package solutions.gemini;

import java.util.*;
import java.lang.*;

/* @Authors
 * Student Names: Başar Filizcan, İbrahim Mert Sürme, Ahmet Atakan Çulban
 * Student IDs: 820220722, 150220052, 820220342
 */
public class Task59 {
    /**
     * Verilen pozitif bir sayının en büyük asal çarpanını bulan 'largestPrimeFactor' adında bir Java metodu yaz.
     */
    public int largestPrimeFactor(int n) {
        int largest = 1;
        int temp = n;
        
        // 2'ye bölünebildiği sürece böl
        while (temp % 2 == 0) {
            largest = 2;
            temp /= 2;
        }
        
        // Tek sayılara bak
        for (int i = 3; i <= Math.sqrt(temp); i += 2) {
            while (temp % i == 0) {
                largest = i;
                temp /= i;
            }
        }
        
        // Eğer temp 2'den büyük kalmışsa o da bir asaldır
        if (temp > 2) {
            largest = temp;
        }
        
        return largest;
    }
}