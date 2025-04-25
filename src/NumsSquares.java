import java.util.Scanner;

/*
Виведіть квадрати всіх натуральних чисел не більших n в порядку зростання.
 */

public class NumsSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i * i <= n) {
                System.out.print(i*i + " ");
            }
        }

        sc.close();
    }

}
