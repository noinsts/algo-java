/*
https://basecamp.eolymp.com/uk/problems/11387
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Poker {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(sc.readLine());
            String[] line = sc.readLine().split("\\s+");
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(line[i]);
            }

            int l = 0, r = n - 1;
            int huseynScore = 0, yaroslavScore = 0;
            boolean isHuseynTurn = true;

            while (l <= r) {
                int max;
                if (arr[l] >= arr[r]) {
                    max = arr[l++];
                } else {
                    max = arr[r--];
                }

                if (isHuseynTurn) {
                    huseynScore += max;
                }
                else {
                    yaroslavScore += max;
                }

                isHuseynTurn = !isHuseynTurn;
            }

            System.out.printf("%d %d%n", huseynScore, yaroslavScore);
        }
    }
}
