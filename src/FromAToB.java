import java.util.Scanner;

public class FromAToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();

        long res = b / x - (a - 1) / x;

        System.out.println(res);
    }
}
