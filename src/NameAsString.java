import java.util.Scanner;

public class NameAsString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();

            String[] res = s.split("-");
            System.out.println(res[0]);
            String[] res1 = res[1].split("_", 2);
            System.out.println(res1[0]);
            System.out.println(res1[1]);
        }
    }
}
