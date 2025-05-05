import java.util.Scanner;

/*
Задача: У вас є рядок тексту.
Напишіть алгоритм, який визначає, чи є цей рядок порожнім (тобто не містить жодних символів).

 */

public class NoneString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if (s.isEmpty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
