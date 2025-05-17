import java.util.Scanner;

public class Poker {
    private static int huseynScore = 0;
    private static int yaroslavScore = 0;

    private static int move = 1;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int l = 0, r = n - 1;

            int max;

            while (l <= r) {
                if (arr[l] > arr[r]) {
                    max = arr[l];
                    l++;
                } else {
                    max = arr[r];
                    r--;
                }
                addScore(max);
                move++;
            }

            System.out.println(huseynScore + " " + yaroslavScore);
        }
    }

    private static void addScore(int value) {
        if (move % 2 != 0) {
            huseynScore += value;
        }
        else {
            yaroslavScore += value;
        }
    }
}
