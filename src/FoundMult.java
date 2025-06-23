/*
https://basecamp.eolymp.com/uk/problems/11434
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FoundMult {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.printf("%.6f%n", Double.parseDouble(sc.readLine()) + 1);
        }
    }
}
