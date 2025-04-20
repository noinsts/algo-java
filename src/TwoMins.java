// DON'T COMMIT

import java.util.Scanner;

/*

Знайдіть два різні найменші елементи у числовій послідовності.

Виведіть у зростаючому порядку два різні найменші числа послідовності. Відомо, що вони завжди існують.

 */

public class TwoMins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int minNumber = Integer.MAX_VALUE;
        int minSecondaryNumber = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x < minNumber) {
                minNumber = x;
            }
        }

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x < minSecondaryNumber && x > minNumber) {
                minSecondaryNumber = x;
            }
        }

        System.out.println(minSecondaryNumber + " " + minNumber);

        sc.close();
    }
}
