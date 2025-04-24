import java.util.Scanner;

/*
Хлопчик Петро отримує в школі тільки двійки та п'ятірки. Визначте, яких оцінок більше.

Вхідні дані
Один рядок містить оцінки Петра. Відомо, що Петро отримує тільки двійки та п'ятірки. Оцінки записані підряд без пробілів, а їх кількість не перевищує 1000.

Вихідні дані
Виведіть:

5, якщо п'ятірок більше ніж двійок;

2, якщо двійок більше ніж п'ятірок;

символ рівності '=', якщо двійок і п'ятірок порівну.
 */

public class Scores52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int FiveCount = 0;
        int TwoCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '5') {
                FiveCount++;
            } else {
                TwoCount++;
            }
        }

        if (FiveCount > TwoCount) {
            System.out.println(5);
        }
        else if (TwoCount > FiveCount) {
            System.out.println(2);
        }
        else {
            System.out.println('=');
        }

        sc.close();

    }
}
