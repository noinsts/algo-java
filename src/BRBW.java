import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BRBW {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = sc.readLine()) != null) {
                StringBuilder output = new StringBuilder();

                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (c == 'a') output.append('b');
                    else if (c == 'b') output.append('a');
                    else if (c == 'A') output.append('B');
                    else if (c == 'B') output.append('A');
                    else output.append(c);
                }

                System.out.println(output);
            }
        }
    }
}
