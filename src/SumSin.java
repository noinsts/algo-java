import java.util.Scanner;

public class SumSin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            double x = sc.nextDouble();

            double sum = 0;

            for (int i = 0; i <= n; i++) {
                sum += Math.sin(i * x);
            }

            System.out.printf("%.6f\n", sum);
        }
    }
}
