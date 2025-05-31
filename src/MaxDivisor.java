import java.util.Scanner;

public class MaxDivisor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();

            for (int i = 2; i * i <= x; i++) {
                if (x % i == 0) {
                    System.out.println(x / i);
                    return;
                }
            }
        }
        System.out.println(1);
    }
}
