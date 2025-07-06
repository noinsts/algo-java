/*
https://basecamp.eolymp.com/uk/problems/9722
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ArithmeticExc {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = sc.readLine()) != null) {
                try {
                    String[] arr = line.split("\\s+");
                    int a = Integer.parseInt(arr[0]);
                    int b = Integer.parseInt(arr[1]);
                    int res = a / b;
                    System.out.printf("%d%n", res);
                } catch (ArithmeticException e) {
                    System.out.println("Division by zero");
                }
            }
        }
    }
}
