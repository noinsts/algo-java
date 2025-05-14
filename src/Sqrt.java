import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();

            int x1 = x / 100;
            int x2 = (x / 10) % 10;
            int x3 = x % 10;

            int res = x1 + x2 + x3;

            System.out.printf("%.3f\n", Math.sqrt(res));
        }
    }
}
