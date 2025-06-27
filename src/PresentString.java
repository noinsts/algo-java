import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PresentString {

    private static final char[] arr = {
            '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/',
            ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_', '`', '{', '|', '}', '~'
    };

    private static int counter = 0;

    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {

            String line = sc.readLine();

            for (int i = 0; i < line.length(); i++) {
                handler(line.charAt(i));
            }

            System.out.printf("%d", counter);
        }
    }

    private static void handler(char c) {
        for (char value : arr) {
            if (value == c) {
                counter++;
                break;
            }
        }
    }
}
