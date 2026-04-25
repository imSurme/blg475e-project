package solutions.claude;
import java.util.*;
import java.lang.*;
/* @Authors
 * Student Names: Başar Filizcan, İbrahim Mert Sürme, Ahmet Atakan Çulban
 * Student IDs: 820220722, 150220052, 820220342
 */
public class Task59 {
    /**
     * Verilen pozitif bir sayının en büyük asal çarpanını bulur.
     * Örnek: n=13195 için 29 döndürür (13195 = 5 * 7 * 13 * 29).
     * @param n En büyük asal çarpanı bulunacak pozitif tam sayı
     * @return n'in en büyük asal çarpanı
     */
    public long largestPrimeFactor(long n) {
        long largest = -1;
        while (n % 2 == 0) {
            largest = 2;
            n /= 2;
        }
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largest = i;
                n /= i;
            }
        }
        if (n > 1) {
            largest = n;
        }
        return largest;
    }
}