import java.util.Scanner;

public class Recursion3 {
    private static int a, b, c;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(f(n));
        }
    }
    
    private static int f(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return a;
        }
        return f(n-1) * b * f(n-2) + c;
    }
}
