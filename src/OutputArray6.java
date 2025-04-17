import java.util.Scanner;

/*
Програма має прочитати з консолі масив з n цілих чисел
та вивести тільки елементи з непарними індексами одним рядком через проміжок,
не змінюючи початковий порядок.
Нумерація починається з 0.
 */

public class OutputArray6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder res = new StringBuilder();

        int count = 0;

        for (int i = 1; i < n; i += 2) {
            res.append(arr[i]).append(" ");
            count++;
        }

        if (count < 1) {
            System.out.println("NO");
        } else {
            System.out.println(count);
            System.out.println(res);
        }
    }
}
