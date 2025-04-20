import java.util.Scanner;

/*
Дано масив in з n цілих чисел. Побудуйте масив out такий, що out[i]
дорівнює добутку всіх елементів масиву in крім in[i]
 */

public class ArrayProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < n; i++) {
            res.append(getProduct(arr, n, i)).append(" ");
        }

        System.out.println(res);

        sc.close();
    }

    private static int getProduct(int[] arr, int n, int i) {
        int res = 1;

        for (int j = 0; j < n; j++) {
            if (i == j) continue;
            res *= arr[j];
        }

        return res;
    }
}
