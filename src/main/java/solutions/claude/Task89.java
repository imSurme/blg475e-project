package solutions.claude;
import java.util.*;
import java.lang.*;
/* @Authors
 * Student Names: Başar Filizcan, İbrahim Mert Sürme, Ahmet Atakan Çulban
 * Student IDs: 820220722, 150220052, 820220342
 */
public class Task89 {
    /**
     * Verilen bir metindeki harfleri İngiliz alfabesinde 4 adım ileri kaydırarak şifreler (Caesar cipher).
     * Büyük ve küçük harfler kendi aralarında döngüsel olarak kaydırılır, harf olmayan karakterler değişmez.
     * Örnek: "hi" için "lm" döndürür.
     * Örnek: "asdfghjkl" için "ewhjklnop" döndürür.
     * @param s Şifrelenecek metin
     * @return 4 adım kaydırılmış şifreli metin
     */
    public String encrypt(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                result.append((char) ('a' + (c - 'a' + 4) % 26));
            } else if (c >= 'A' && c <= 'Z') {
                result.append((char) ('A' + (c - 'A' + 4) % 26));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}