import java.util.Scanner;

public class EpicPainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();

            long[] arr = new long[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextLong();
            }

            System.out.println(Checker(n, arr));
        }

        sc.close();
    }

    private static long Checker(int n, long[] arr) {
        long res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long blueSum = 0;
                long redSum = arr[i] + arr[j];

                for (int x = 0; x < n; x++) {
                    if (x == i || x == j) continue;
                    blueSum += arr[x];
                }

                if ((redSum % 2 == 0 && blueSum % 2 == 0) || (redSum % 2 != 0 && blueSum % 2 != 0)) {
                    res++;
                }
            }
        }

        return res;

    }
}
