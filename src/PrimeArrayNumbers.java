import java.util.Scanner;

/*
Дано набір різних натуральних чисел.
Будемо називати число "простим для заданого набору",
якщо число не ділиться ні на одне з чисел набору,
крім самого себе.

Вхідні дані
У вхідному файлі у первшому рядку міститься ціле число N
(1  ≤  N  ≤  100) – кількість чисел у наборі.
У другому рядку файлу міститься N
різних цілих чисел від 1 до 1000000,
відокремлених пропусками.

Вихідні дані
У вихідний файл вивести "прості для заданого набору" числа,
відокремлюючи числа одним пропуском.
Числа виводяться у тому ж порядку,
у якому вони йшли у вхідному файлі.
 */

public class PrimeArrayNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (CheckerPrime(arr[i], arr, n)) {
                res.append(arr[i]).append(" ");
            }
        }

        System.out.println(res);

    }

    private static boolean CheckerPrime(int i, int[] arr, int n) {
        for (int j = 0; j < n; j++) {
            if (arr[j] == i) continue;
            if (i % arr[j] == 0) {
                return false;
            }
        }
        return true;
    }
}
