import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class OrganizingThree {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            String[] line = sc.readLine().split(" ");
            int[] arr = new int[line.length];

            for (int i = 0; i < line.length; i++) {
                arr[i] = Integer.parseInt(line[i]);
            }

            Arrays.sort(arr);

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}
