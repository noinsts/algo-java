/*
https://basecamp.eolymp.com/uk/problems/8906
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BiggerFromSmaller {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(sc.readLine()) - 1;

            while (x % 11 != 0) {
                x--;
            }

            System.out.printf("%d", x);
        }
    }
}
