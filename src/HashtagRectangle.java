import java.util.Scanner;

public class HashtagRectangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print('#');
                }
                System.out.println();
            }
        }
    }
}
