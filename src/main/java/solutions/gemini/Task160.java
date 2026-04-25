package solutions.gemini;

import java.util.*;
import java.lang.*;

/* @Authors
 * Student Names: Başar Filizcan, İbrahim Mert Sürme, Ahmet Atakan Çulban
 * Student IDs: 820220722, 150220052, 820220342
 */
public class Task160 {
    /**
     * String dizisi olarak verilen basit operatörleri ("+", "-", "*") ve tam sayı dizisini kullanarak matematiksel işlemi soldan sağa doğru uygulayan 'doAlgebra' adında bir Java metodu yaz.
     */
    public int doAlgebra(String[] operators, int[] operands) {
        if (operands == null || operands.length == 0) {
            return 0;
        }
        
        int result = operands[0];
        
        for (int i = 0; i < operators.length; i++) {
            String op = operators[i];
            int nextVal = operands[i + 1];
            
            switch (op) {
                case "+":
                    result += nextVal;
                    break;
                case "-":
                    result -= nextVal;
                    break;
                case "*":
                    result *= nextVal;
                    break;
                default:
                    // Bilinmeyen operatör durumunda işlemi değiştirme
                    break;
            }
        }
        
        return result;
    }
}