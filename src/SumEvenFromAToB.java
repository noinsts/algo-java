import java.util.Scanner;
/*
Знайти суму парних чисел на проміжку від a до b включно.
 */

public class SumEvenFromAToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long res = 0;

        if (a % 2 != 0) {
            a++;
        }

        if (b % 2 != 0) {
            b--;
        }

        for (long i = a; i <= b; i += 2) {
            res += i;
        }

        System.out.println(res);

    }
}
