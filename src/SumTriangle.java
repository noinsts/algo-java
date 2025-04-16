import java.util.Scanner;

/*
Задано три натуральні числа a,b та c.
Виведіть суму заданих чисел,
якщо існує трикутник із довжинами сторін a,b, c,
та "No" в іншому випадку.
 */

public class SumTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println(a+b+c);
        } else {
            System.out.println("No");
        }
    }
}
