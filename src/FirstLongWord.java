import java.util.Scanner;

public class FirstLongWord {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] arr = sc.nextLine().split(" ");

            String wrd = "";
            int max = 0;

            for (String word : arr) {
                if (word.length() > max) {
                    max = word.length();
                    wrd = word;
                }
            }

            System.out.println(wrd);

        }
    }
}
