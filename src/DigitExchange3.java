import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DigitExchange3 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(sc.readLine());
            char[] digits = String.valueOf(x).toCharArray();

            int n = digits.length;

            char temp = digits[n - 3];
            digits[n - 3] = digits[n - 2];
            digits[n - 2] = temp;

            System.out.println(new String(digits));
        }
    }
}
