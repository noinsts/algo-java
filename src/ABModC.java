import java.math.BigInteger;
import java.util.Scanner;

/*
За заданими a, b, c обчисліть значення a^(b) mod c (1 ≤ a, b, c < 2^63).

Вхідні дані
Складається з декількох тестів. Кожен тест задається в одному рядку та містить три числа a, b та c.

Вихідні дані
Для кожного тесту в окремому рядку вивести результат виконання операції a^(b) mod c.
 */

public class ABModC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = sc.nextBigInteger();

            BigInteger result = a.modPow(b, c);

            System.out.println(result);

        }

        sc.close();

    }
}
