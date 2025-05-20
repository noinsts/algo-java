import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountElementsWithExactFrequency {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }

            // Зчитуємо масив
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Частота кожного числа в масиві
            Map<Integer, Integer> freq = new HashMap<>();
            for (int num : arr) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            // Підрахунок кількості чисел, що зустрічаються рівно k разів
            int count = 0;
            for (int val : freq.values()) {
                if (val == k) {
                    count++;
                }
            }

            // Вивід результату
            System.out.println(count);
        }
    }
}
