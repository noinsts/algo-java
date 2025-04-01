import java.util.Scanner;
import java.util.HashMap;

/*
Задано довжини n відрізків. Яку найбільшу кількість квадратів можна з них скласти? Сторона кожного квадрату має складатися лише з одного відрізку.
 */

public class SquareCountFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> numbers = new HashMap<>();

        // Fill HasMap
        for (int num : arr) {
            numbers.put(num, numbers.getOrDefault(num, 0) + 1);
        }

        int res = 0;

        // Iterate over HashMap numbers
        for (int count : numbers.values()) {
            if (count >= 4) {
                res += count / 4;
            }
        }

        System.out.println(res);

    }
}
