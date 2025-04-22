import java.util.Scanner;

/*
Обчисліть значення y у відповідності з наступною умовою:

https://basecamp.eolymp.com/uk/problems/8526
 */

public class Operator3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x < -4) {
            System.out.println(x+5);
        }
        else if (x <= 7) {
            System.out.println(x*x - 3*x);
        }
        else {
            System.out.println(x*x*x + 2*x);
        }

        sc.close();

    }
}
