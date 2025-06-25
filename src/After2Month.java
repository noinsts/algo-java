import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class After2Month {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(sc.readLine());

            while (t-- > 0) {
                String[] line = sc.readLine().split(" ");

                int a = Integer.parseInt(line[0]);
                int b = Integer.parseInt(line[1]);

                for (int i = a; i <= b; i++) {
                    if (isPrime(i)) {
                        System.out.println(i);
                    }
                }

                System.out.println();
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
