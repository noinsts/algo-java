import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Divide369 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(sc.readLine());

            System.out.println(x % 3 == 0 ? "Yes" : "No");
            System.out.println(x % 6 == 0 ? "Yes" : "No");
            System.out.println(x % 9 == 0 ? "Yes" : "No");
        }
    }
}