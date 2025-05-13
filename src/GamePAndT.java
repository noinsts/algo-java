import java.util.Scanner;

/*
Задані два невід’ємних цілих числа A та B.
Два гравці – Постачальник (П) і Транзитер (Т), ходячи по черзі і дотримуючись найкращої стратегії, грають у гру,
в якій П завжди починає першим. За один хід потрібно від більшого з чисел відняти натуральне число, кратне меншому, щоб отримати невід’ємний результат.
Програв той, хто не може зробити хід.
 */

public class GamePAndT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // count of tests
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < t; i++) {
            // read numbers
            int a = sc.nextInt();
            int b = sc.nextInt();

            int min = Math.min(a, b);
            int max = Math.max(a, b);

            int gcd = gcd(max, min);

            if (max % min == 0) {
                result.append("1");
            } else {
                if ((max / min) % 2 == 0) {
                    result.append("2");
                } else {
                    result.append("1");
                }
            }
        }
        System.out.println(result);
    }
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
