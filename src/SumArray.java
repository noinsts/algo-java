import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int res = 0;

        for (int i = 0; i < n; i++) {
            res += sc.nextInt();
        }

        System.out.println(res);

        sc.close();
    }
}
