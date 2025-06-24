/*
https://basecamp.eolymp.com/uk/problems/8847
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SwapDigit2 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(sc.readLine());

            int units = n % 10;
            int hundreds = (n / 100) % 10;

            System.out.printf("%d", n - hundreds * 100 - units + hundreds + units * 100);
        }
    }
}
