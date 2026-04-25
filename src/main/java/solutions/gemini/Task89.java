package solutions.gemini;

import java.util.*;
import java.lang.*;

/* @Authors
 * Student Names: Başar Filizcan, İbrahim Mert Sürme, Ahmet Atakan Çulban
 * Student IDs: 820220722, 150220052, 820220342
 */
public class Task89 {
    /**
     * Verilen bir metindeki harfleri İngiliz alfabesinde 4 adım ileri kaydırarak şifreleyen (Caesar cipher) 'encrypt' adında bir Java metodu yaz.
     */
    public String encrypt(String s) {
        if (s == null) return null;
        
        StringBuilder result = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                // 4 adım ileri kaydır ve alfabeyi döngüsel yap
                char shifted = (char) ((c - base + 4) % 26 + base);
                result.append(shifted);
            } else {
                // Harf dışındaki karakterleri (boşluk, nokta vs.) aynen bırak
                result.append(c);
            }
        }
        
        return result.toString();
    }
}