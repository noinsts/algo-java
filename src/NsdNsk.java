/*
https://basecamp.eolymp.com/uk/problems/11606
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NsdNsk {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(sc.readLine().trim());

            while (t-- > 0) {
                String[] line = sc.readLine().split("\\s+");

                long x = Long.parseLong(line[0]);
                long y = Long.parseLong(line[1]);

                System.out.printf("%d %d%n", findGCD(x, y), findLCM(x, y));
            }
        }
    }

    // Метод для знаходження НСД (GCD) за алгоритмом Євкліда
    private static long findGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // НСД завжди додатній
    }

    // Метод для знаходження НСК (LCM)
    private static long findLCM(long a, long b) {
        return Math.abs(a / findGCD(a, b) * b); // щоб уникнути переповнення при a * b
    }
}
