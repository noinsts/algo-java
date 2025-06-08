import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class TwoIdenticalNumber {

    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            String line = sc.readLine();

            if (checker(line)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean checker(String line) {
        HashMap<Character, Integer> data = new HashMap<>();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            data.put(c, data.getOrDefault(c, 0) + 1);
        }

        for (int val : data.values()) {
            if (val != 2) {
                return false;
            }
        }
        return true;
    }
}
