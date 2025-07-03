/*
https://basecamp.eolymp.com/uk/problems/11433
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SinSum {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(sc.readLine());

            double sum = 0.0;
            double currSin = 0.0;

            for (int i = 1; i <= x; i++) {
                currSin += Math.sin(i);
                sum += 1 / currSin;
            }

            System.out.printf("%.6f%n", sum);
        }
    }
}
