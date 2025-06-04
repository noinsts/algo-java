import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UsingsFunc {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            String[] parts = sc.readLine().split(" ");

            double x = Double.parseDouble(parts[0]);
            double y = Double.parseDouble(parts[1]);
            double z = Double.parseDouble(parts[2]);

            double maxXY = Math.max(x, y);
            double maxYZ = Math.max(y, z);
            double sum = x + y + z;

            double result = Math.min(Math.min(maxXY, maxYZ), sum);

            System.out.println(result);

        }
    }
}
