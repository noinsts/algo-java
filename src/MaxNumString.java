/*
https://basecamp.eolymp.com/uk/problems/8630
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MaxNumString {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            String line = sc.readLine();
            int maxNum = Integer.MIN_VALUE;

            for (int i = 0; i < line.length(); i++) {
                maxNum = Math.max(maxNum, Character.getNumericValue(line.charAt(i)));
            }

            System.out.printf("%d", maxNum);
        }
    }
}
