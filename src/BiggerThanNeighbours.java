import java.util.Scanner;

public class BiggerThanNeighbours {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            // наповнюємо масив даними
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // визначаємо кількість елементів, більших за сусідів
            int count = 0;
            for (int i = 1; i < n-1; i++) {
                if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                    count++;
                }
            }

            // виводимо результат
            System.out.println(count);
        }
    }
}
