package solutions.claude;
import java.util.*;
import java.lang.*;
/* @Authors
 * Student Names: Başar Filizcan, İbrahim Mert Sürme, Ahmet Atakan Çulban
 * Student IDs: 820220722, 150220052, 820220342
 */
public class Task60 {
    /**
     * 1'den başlayıp verilen n sayısına kadar (n dahil) olan tüm tam sayıların toplamını bulur.
     * Örnek: n=5 için 1+2+3+4+5=15 döndürür.
     * @param n Üst sınır tam sayısı
     * @return 1'den n'e kadar olan tam sayıların toplamı
     */
    public int sumToN(int n) {
        return n * (n + 1) / 2;
    }
}