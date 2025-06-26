/*
https://basecamp.eolymp.com/uk/problems/10893
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IlyaCalc {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(sc.readLine());
            int res = 0;

            while (x > 1) {
                if (x % 3 == 0) {
                    x /= 3;
                } else {
                    x--;
                }
                res++;
            }

            System.out.printf("%d%n", res);
        }
    }
}
