import java.util.Scanner;


public class MaxCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxValue = Integer.MIN_VALUE;

        // наповнюємо масив та знаходимо найбільше значення
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;

            if (x > maxValue) {
                maxValue = x;
            }
        }

        int counter = 0;

        // знаходимо кількість максимальних
        for (int i = 0; i < n; i++) {
            if (arr[i] == maxValue) {
                counter++;
            }
        }

        System.out.println(counter);

        sc.close();
    }
}
