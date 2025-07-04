/*
https://basecamp.eolymp.com/uk/problems/9915
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CopyCopy {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            String line = sc.readLine();

            for (int i = 0; i < 4; i++) {
                System.out.printf("%s ", line);
            }
        }
    }
}
