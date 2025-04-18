import java.util.Scanner;

/*
На вході програми маємо натуральне число n.
Серед натуральних чисел більших ніж n, що не діляться на 2, 3 і 5 знайти найменше.
 */

public class SmallerFromBigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        boolean found = false;

        while (!found) {
            x++;
            if (x % 2 != 0 && x % 3 != 0 && x % 5 != 0) {
                System.out.println(x);
                found = true;
            }
        }
    }
}
