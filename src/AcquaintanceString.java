import java.util.Scanner;

public class AcquaintanceString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < t; i++) {
                String text = sc.nextLine();

                if (text.contains("BSM")) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
