import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FromAToBPrime {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            String[] line = sc.readLine().split(" ");

            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);

            boolean found = false;

            for (int i = a; i <= b; i++) {
               if (isPrime(i)) {
                   found = true;
                   System.out.println(i);
               }
           }
           if (!found) {
               System.out.println("Absent");
           }
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;   // 0,1 — не прості
        if (n == 2) return true;    // 2 — просте
        if (n % 2 == 0) return false; // всі парні крім 2 — не прості

        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
