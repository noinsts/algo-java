import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Function1 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            String line;

            while ((line = sc.readLine()) != null) {
                double x = Double.parseDouble(line);
                System.out.printf("%.4f%n", f(x));
            }
        }
    }

    private static double f(double x) {
        return Math.pow(x, 3) + 2 * Math.pow(x, 2) - 3;
    }
}
