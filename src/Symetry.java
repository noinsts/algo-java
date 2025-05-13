import java.util.Scanner;

public class Symetry {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int l = 0, r = s.length() - 1;

            int counter = 0;

            while (l <= r) {
                if (Character.getNumericValue(s.charAt(l)) == Character.getNumericValue(s.charAt(r))) {
                    counter++;
                }
                l++;
                r--;
            }
            System.out.println(counter);
        }
    }
}
