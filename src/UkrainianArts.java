import java.util.Scanner;

public class UkrainianArts {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int l = 0;
            int r = b - 1;

            boolean reverse = false;
            boolean repeat = false;

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (j == l || j == r) {
                        System.out.print("x");
                    } else {
                        System.out.print(".");
                    }
                }

                if (!reverse && (l == r || l + 1 == r)) {
                    reverse = true;
                    if (b % 2 == 0) {
                        repeat = true;
                    }
                } else if (reverse && (l <= 0 || r >= b - 1)) {
                    reverse = false;
                }

                if (reverse) {
                    if (repeat) {
                        repeat = false;
                    } else {
                        l--;
                        r++;
                    }
                } else {
                    l++;
                    r--;
                }

                System.out.println();
            }
        }
    }
}
