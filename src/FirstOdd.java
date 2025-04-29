import java.util.Scanner;

/*
Задача: Перший непарний

Дано список цілих чисел. Знайди індекс першого непарного елемента. Якщо всі елементи парні — поверни -1.
 */

public class FirstOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // наповнюємо масив
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // перебираємо масив та виводимо данні
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
                return;
            }
        }

        sc.close();
    }
}
