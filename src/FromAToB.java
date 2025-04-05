import java.util.Scanner;

public class FromAToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();

        long counter = 0;

        for (long i = a; i < b+1; i++) {
            if (i % x == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
