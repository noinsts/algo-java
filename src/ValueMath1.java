import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ValueMath1 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            String[] parts = sc.readLine().split(" ");

            double x = Double.parseDouble(parts[0]);
            double y = Double.parseDouble(parts[1]);

            double res = 2 * x * x - 4 * x * y + 3 * y * y + (x + y) / 7;

            System.out.printf("%.3f", res);
        }
    }
}