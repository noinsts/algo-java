import java.util.Scanner;

/*
Задано два цілих числа a і b. Виведіть квадрати та куби всіх цілих чисел від a до b включно.
 */

public class SquareCubesFromAToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder squares = new StringBuilder();
        StringBuilder cubes = new StringBuilder();

        for (int i = a; i <= b; i++) {
            squares.append((long) Math.pow(i, 2)).append(" ");
        }

        for (int i = b; i >= a; i--) {
            cubes.append((long) Math.pow(i, 3)).append(" ");
        }

        System.out.println(squares.toString().trim());
        System.out.println(cubes.toString().trim());

        sc.close();
    }
}
