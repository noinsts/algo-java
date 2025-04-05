import java.util.Scanner;

public class SumEvenFromAToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long res = 0;

        for (long i = a; i < b+1; i++) {
            if (i % 2 == 0) {
                res += i;
            }
        }
        System.out.println(res);
    }
}
