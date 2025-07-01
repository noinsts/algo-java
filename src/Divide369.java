/*
https://basecamp.eolymp.com/uk/problems/4734
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.math.BigInteger;


public class Divide369 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            BigInteger x = new BigInteger(sc.readLine());

            System.out.println(checker(x, 3) ? "Yes" : "No");
            System.out.println(checker(x, 6) ? "Yes" : "No");
            System.out.println(checker(x, 9) ? "Yes" : "No");
        }
    }

    private static boolean checker(BigInteger x, long y) {
        return x.mod(BigInteger.valueOf(y)).equals(BigInteger.ZERO);
    }
}