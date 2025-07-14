/*
https://basecamp.eolymp.com/uk/problems/11427
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TimeBuyShares {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(sc.readLine());

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.read();
            }

            int buySharesValue = Integer.MAX_VALUE;
            int buySharesIndex = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] < buySharesValue) {
                    buySharesIndex = i;
                    buySharesValue = arr[i];
                }
            }

            int sellSharesValue = buySharesValue;

            for (int i = buySharesIndex; i < n; i++) {
                sellSharesValue = Math.max(sellSharesValue, arr[i]);
            }

            System.out.printf("%d%n", buySharesValue - sellSharesValue);

        }
    }
}
