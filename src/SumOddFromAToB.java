import java.util.Scanner;

/*
Знайдіть суму непарних чисел на проміжку від a до b.
 */

public class SumOddFromAToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long res = 0;

        if (a % 2 == 0) {
            a++;
        }

        for (long i = a; i <= b; i+= 2) {
            res += i;
        }

        System.out.println(res);
    }
}
