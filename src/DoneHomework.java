import java.util.Scanner;

/*
https://uoi.eolymp.space/uk/problems/346
 */

public class DoneHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= (b-c)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
