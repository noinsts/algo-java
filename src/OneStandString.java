import java.util.Scanner;

public class OneStandString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();

            int lower = 0;
            int upper = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (Character.isLowerCase(c)) lower++;
                else upper++;
            }

            if (lower == 0 || upper == 0) {
                System.out.println("YES" + " " + s.length());
            } else {
                System.out.println("NO" + " " + Math.min(lower, upper));
            }
        }
    }
}
