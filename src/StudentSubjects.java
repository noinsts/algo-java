import java.util.Scanner;
import java.util.ArrayList;

public class StudentSubjects {
    private static final ArrayList<String[]> data = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t1 = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < t1; i++) {
                String[] line = sc.nextLine().split(" ");
                data.add(new String[]{line[0], line[1]});
            }

            int t2 = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < t2; i++) {
                res(sc.nextLine());
            }
        }
    }

    private static int checker(String query) {
        for (String[] var : data) {
            if (var[0].equals(query)) {
                return 1;
            }
        }

        return 0;
    }

    private static void res(String query) {
        int x = checker(query);

        for (String[] var : data) {
            if (var[x].equals(query)) {
                System.out.print(var[x] + " ");
            }
        }

        System.out.println();
    }
}
