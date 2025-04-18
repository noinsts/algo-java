import java.util.Scanner;

/*
https://basecamp.eolymp.com/uk/problems/8904
time limit TEST #9
(90/100%)
 */

public class BeforeNumber3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        boolean found = false;

        for (int i = x-1; i > 0; i--) {
            if (powerTwo(i) && !found) {
                System.out.println(i);
                found = true;
            }
        }
    }

    private static boolean powerTwo(int x) {
        return x > 0 && (x & (x - 1)) == 0;
    }
}
