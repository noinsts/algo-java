import java.util.Scanner;

public class VeryEasy {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a = sc.nextInt();

            long res = 0;

            for (int i = 1; i <= n; i++) {
                res += i * (long) Math.pow(a, i);
            }

            System.out.println(res);
        }
    }
}