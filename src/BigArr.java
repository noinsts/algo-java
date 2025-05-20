import java.util.Scanner;

public class BigArr {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int counter = 1;
            int maxCount = 1;

            for (int i = 1; i < n; i++) {
                if (arr[i] == arr[i - 1]) {
                    counter++;
                    maxCount = Math.max(counter, maxCount);
                } else {
                    counter = 1;
                }
            }

            System.out.println(maxCount);
        }
    }
}
