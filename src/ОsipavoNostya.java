import java.util.Scanner;

public class ОsipavoNostya {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) System.out.print('@');
                    else if (j > 1) System.out.print('^');
                    else System.out.print('.');
                }

                System.out.println();
            }
        }
    }
}
