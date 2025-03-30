import java.util.Scanner;
import java.util.Arrays;

/*
Задача: Пошук максимального та мінімального елемента в масиві

Дано масив цілих чисел. Напишіть програму, яка знаходить максимальний та мінімальний елемент цього масиву.
 */

public class MinMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[n - 1];

        System.out.print(min + " ");
        System.out.print(max);
    }
}
