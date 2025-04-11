import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        if (Math.floor(x) == x) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
