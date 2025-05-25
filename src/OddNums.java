import java.util.Scanner;

public class OddNums {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int i = a; i <= b; i++) {
                String numS = String.valueOf(i);

                if (checker(numS)) {
                    System.out.print(numS + " ");
                }
            }
        }
    }

    private static boolean checker(String numS) {
        for (int i = 0; i < numS.length(); i++) {
            int num = Character.getNumericValue(numS.charAt(i));
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
