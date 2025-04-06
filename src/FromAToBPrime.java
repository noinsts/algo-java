import java.util.Scanner;

public class FromAToBPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long counter = 0;

        for (long i = a; i < b+1; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("Absent");
        }
    }

    public static boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }

        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
