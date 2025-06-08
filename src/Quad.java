// Weekend Practice 7
// Problem: B

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Quad {

    private static final int[][] combo = {
            {3, 5, 9},
            {1, 2, 5},
            {1, 5, 9},
            {2, 5, 9},
            {2, 3, 5},
            {1, 3, 9},
            {2, 3, 9},
            {1, 2, 9},
            {1, 3, 5},
            {2, 5, 7},
            {1, 2, 3},
            {1, 3, 7},
            {2, 3, 7},
            {1, 2, 7},
            {3, 5, 7},
            {1, 5, 7}

    };

    private static void checker(int n) {
        for (int[] row : combo) {
            int a = row[0], b = row[1], c = row[2], d = n - (a + b + c);

            if (d != a && d != b && d != c && d % 4 != 0 && d > 0 && d <= n) {
                System.out.printf("%d %d %d %d%n", a, b, c, d);
                return;
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(sc.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(sc.readLine());
                checker(n);
            }
        }
    }
}
