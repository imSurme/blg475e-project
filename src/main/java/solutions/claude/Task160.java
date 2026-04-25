package solutions.claude;
import java.util.*;
import java.lang.*;
/* @Authors
 * Student Names: Başar Filizcan, İbrahim Mert Sürme, Ahmet Atakan Çulban
 * Student IDs: 820220722, 150220052, 820220342
 */
public class Task160 {
    /**
     * String dizisi olarak verilen basit operatörleri ("+", "-", "*") ve tam sayı dizisini
     * kullanarak matematiksel işlemi soldan sağa doğru uygular.
     * Operatör dizisi her zaman sayı dizisinden bir eleman daha az olur.
     * Örnek: operator=["+", "*"], operand=[2, 3, 4] için (2+3)*4=20 değil, soldan sağa: 2+3=5, 5*4=20 döndürür.
     * Örnek: operator=["-", "+"], operand=[10, 5, 2] için 10-5=5, 5+2=7 döndürür.
     * @param operator İşlem operatörlerini içeren String dizisi
     * @param operand  Tam sayıları içeren liste
     * @return Soldan sağa uygulanan işlemlerin sonucu
     */
    public int doAlgebra(List<String> operator, List<Integer> operand) {
        int result = operand.get(0);
        for (int i = 0; i < operator.size(); i++) {
            String op = operator.get(i);
            int next = operand.get(i + 1);
            switch (op) {
                case "+":
                    result += next;
                    break;
                case "-":
                    result -= next;
                    break;
                case "*":
                    result *= next;
                    break;
            }
        }
        return result;
    }
}