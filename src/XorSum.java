import java.util.Scanner;

public class XorSum {
    private static int a;
    private static int b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            int l = sc.nextInt();
            int r = sc.nextInt();

            long result = 0;

            for (int j = l; j <= r; j++) {
                result += f(j);
            }
            System.out.println(result);
        }
        
        sc.close();
    }

    private static long f(int x) {
        return switch (x) {
            case 1 -> a;
            case 2 -> b;
            default -> f(x-1) ^ f(x-2);
        };
    }
}
