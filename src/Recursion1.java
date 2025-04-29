import java.util.Scanner;

/*
🧠 Задача: Рекурсивне піднесення до степеня
Напиши рекурсивну функцію power(a, b), яка обчислює
𝑎^b

  (тобто число a у степені b, де b — ціле невід’ємне число).
 */

public class Recursion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(power(a, b));

        sc.close();
    }

    private static int power(int a, int b) {
        if (b == 0) return 1;
        return a * power(a, b-1);
    }
}
