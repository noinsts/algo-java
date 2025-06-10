import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SumNum {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            String line = sc.readLine();
            int res = 0;

            for (int i = 0; i < line.length(); i++) {
                res += Character.getNumericValue(line.charAt(i));
            }

            System.out.println(res);
        }
    }
}
