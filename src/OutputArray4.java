import java.util.Scanner;

/*
У першому рядку виведіть кількість від’ємних елементів масиву.
У другому рядку виведіть самі від’ємні елементи у зворотному порядку.
Якщо в масиві немає від’ємних елементів, виведіть "NO".
 */

public class OutputArray4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder res = new StringBuilder();

        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 0) {
                res.append(arr[i]).append(" ");
                count++;
            }
        }

        if (count == 0) {
            System.out.println("NO");
        } else {
            System.out.println(count);
            System.out.println(res);
        }
    }
}
