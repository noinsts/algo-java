import java.util.Scanner;

public class Poker2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int l = 0, r = n - 1;

            while (l < r) {
                System.out.print(arr[l] + " " + arr[r] + " ");
                l++;
                r--;
            }
            
            if (l == r) {
                System.out.println(arr[l]);
            } 
        }
    }
}
