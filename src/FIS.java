/*
https://basecamp.eolymp.com/uk/problems/9721
 */

import java.io.FileInputStream;
import java.io.IOException;

public class FIS {
    public static void main(String[] args) throws IOException {
        int res = 0;

        try (FileInputStream sc = new FileInputStream("input.txt")) {
            int byteValue;
            while ((byteValue = sc.read()) != -1) {
                res += byteValue;
            }
        }

        System.out.printf("%d%n", res);
    }
}
