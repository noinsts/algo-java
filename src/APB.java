import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class APB {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(sc.readLine());

            for (int i = 0; i < t; i++) {
                String[] parts = sc.readLine().split("\\+");

                BigInteger x1 = new BigInteger(parts[0]);
                BigInteger x2 = new BigInteger(parts[1]);

                System.out.println(x1.add(x2));
            }
        }
    }
}
