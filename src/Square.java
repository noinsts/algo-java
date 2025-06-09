import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Square {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            String line;

            while ((line = sc.readLine()) != null) {
                if (line.trim().isEmpty()) continue;

                int x = Integer.parseInt(line);

                int perimeter = 4 * x;
                int area = x * x;

                System.out.printf("%d %d%n", perimeter, area);
            }
        }
    }
}
