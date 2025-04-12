import java.util.Scanner;

/*
🔍 Задача: Подвійник
Дано масив цілих чисел. Твоя задача — перевірити, чи є в ньому два однакові елементи підряд (тобто стоять поруч).
Якщо є — виведи true, якщо нема — false.
 */

public class DoubleNeighbor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean found = false;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i+1]) {
                found = true;
                break;
            }
        }

        System.out.println(found);

    }
}
