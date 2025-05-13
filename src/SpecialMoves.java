import java.util.Scanner;
import java.util.ArrayList;

public class SpecialMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // count of tests

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // long s
            int x = sc.nextInt(); // coord x
            int y = sc.nextInt(); // coord y

            sc.nextLine();
            String s = sc.nextLine();

            ArrayList<int[]> coordinates = new ArrayList<>();

            coordinates.add(new int[]{x, y});

            for (int j = 0; j < n; j++) {
                char currentChar = s.charAt(i);

                if (currentChar == 'R') {
                    x++;
                    coordinates.add(new int[]{x, y});
                }
                else if (currentChar == 'L') {
                    x--;
                    coordinates.add(new int[]{x, y});
                }
                else if (currentChar == 'D') {
                    y--;
                    coordinates.add(new int[]{x, y});
                }
                else if (currentChar == 'U') {
                    y++;
                    coordinates.add(new int[]{x, y});
                }
            }

//            for (int j = 0; j < coordinates.; j++) {
//
//            }

        }
    }
}
