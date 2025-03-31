import java.util.Scanner;

/*
🔹 Задача: Кількість парних та непарних чисел

Умова:
Дано масив цілих чисел. Знайди кількість парних та непарних чисел у масиві.
 */

public class EvenOddCounter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++){
            if (arr[i] % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Парних чисел: " + evenCount);
        System.out.println("Непарних чисел: " + oddCount);
    }
}
