import java.util.Scanner;

/*
Програма має ввести з консолі ціле число n та знайти число попереднє до n, що кратне 5.
 */

public class BeforeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        boolean found = false;

        while (!found) {
            x--;
            if (x % 5 == 0) {
                System.out.println(x);
                found = true;
            }
        }
    }
}
