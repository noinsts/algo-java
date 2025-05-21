import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ReverseArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            ArrayList<Integer> arr = new ArrayList<>();


            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            arr.sort(Collections.reverseOrder());

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}
