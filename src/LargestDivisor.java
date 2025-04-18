import java.util.Scanner;

/*
Для заданого натурального числа n виведіть його найбільший дільник, відмінний від n.
 */

public class LargestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        boolean found = false;

        for (int i = x-1; i > 0; i--) {
            if (x % i == 0 && !found) {
                System.out.println(i);
                found = true;
            }
        }
    }
}
