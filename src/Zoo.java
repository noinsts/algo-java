import java.util.Arrays;
import java.util.Scanner;

/*
https://basecamp.eolymp.com/uk/problems/157
 */

public class Zoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j < n; j++) {
                count += 2;
            }
        }
        System.out.println(count);
    }
}
