import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Rectangle {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(sc.readLine());

            while (x-- > 0) {
                System.out.println("###");
            }
        }
    }
}
