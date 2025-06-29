/*
https://basecamp.eolymp.com/uk/problems/11435
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FoundMult2 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(sc.readLine());
            double res = 1.0;

            for (int i = 1; i <= x; i++) {
                res *= (1 + 1.0 / (i * i));
            }

            System.out.printf("%.6f%n", res);
        }
    }
}
