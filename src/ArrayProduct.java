import java.util.Scanner;

/*
Дано масив in з n цілих чисел. Побудуйте масив out такий, що out[i]
дорівнює добутку всіх елементів масиву in крім in[i]
 */

public class ArrayProduct {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            // наповнення масиву
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // збір та вивід данних
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    if (i == j) continue;
                    sum *= arr[j];
                }
                System.out.print(sum + " ");
            }
        }
    }
}
