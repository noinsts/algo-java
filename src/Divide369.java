import java.util.Scanner;

public class Divide369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextInt();

        if (x % 3 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if (x % 6 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if (x % 9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
