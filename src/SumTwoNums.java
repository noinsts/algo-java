import java.util.Scanner;

/*
Задача: Знайти всі пари чисел у масиві, сума яких дорівнює заданому числу
Умови:

    Є масив цілих чисел.

    Є число target, якому повинна дорівнювати сума двох елементів.

    Треба знайти всі унікальні пари чисел у масиві, які в сумі дають target.

 */

public class SumTwoNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[i] + arr[j] == target){
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }
        if (!found){
            System.out.println("Немає таких пар.");
        }
    }
}
