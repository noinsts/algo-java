import java.util.Scanner;

/*
🧠 Задача: Пошук другого за величиною елемента в масиві
Складність: ⭐ (легка)

✨ Умова:
Дано масив цілих чисел. Знайди другий за величиною елемент у цьому масиві без сортування.
 */

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxItem = Integer.MIN_VALUE;
        int SecondMaxItem = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxItem) {
                maxItem = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < maxItem && arr[i] > SecondMaxItem) {
                SecondMaxItem = arr[i];
            }
        }
        if (SecondMaxItem == Integer.MIN_VALUE) {
            System.out.println("Другого максимального числа немає");
        } else {
            System.out.println(SecondMaxItem);
        }
    }
}
