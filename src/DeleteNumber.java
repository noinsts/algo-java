/*
https://basecamp.eolymp.com/uk/problems/8843
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DeleteNumber {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            String line = sc.readLine();

            for (int i = 0; i < line.length() - 1; i++) {
                System.out.printf("%c", line.charAt(i));
            }
        }
    }
}
