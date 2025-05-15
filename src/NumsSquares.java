import java.util.Scanner;

/*
Виведіть квадрати всіх натуральних чисел не більших n в порядку зростання.
 */

public class NumsSquares {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 1; i * i <= n; i++) {
                System.out.print(i*i + " ");
            }
        }
    }
}
