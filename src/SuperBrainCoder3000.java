import java.math.BigInteger;
import java.util.Scanner;

/*
📘 ЗАДАЧА: Сума цифр у степені
📋 Умова:
Задано два числа: a і b. Треба обчислити
𝑎
𝑏
a
b
 , а потім знайти суму цифр цього числа.

📥 Вхід:
Кілька рядків, у кожному — два натуральних числа a і b
(1 ≤ a, b ≤ 10⁴)
Кінець вводу — EOF.

📤 Вихід:
Для кожного рядка вивести одне число — суму цифр результату
𝑎
𝑏
a
b

 */

public class SuperBrainCoder3000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            BigInteger base = BigInteger.valueOf(a);
            BigInteger res = base.pow(b);

            int sum = 0;

            for (char ch : res.toString().toCharArray()) {
                sum += ch - '0';
            }

            System.out.println(sum);

        }
    }
}
