import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NextDegreeTwo {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(sc.readLine()) + 1;

            while (true) {
                if (isPowerOfTwo(x)) {
                    System.out.println(x);
                    return;
                }
            }
        }
    }

    private static boolean isPowerOfTwo(int x) {
        return (x & (x - 1)) == 0;
    }
}
