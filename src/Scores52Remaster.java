import java.util.Scanner;
import java.util.HashMap;

/*
Є String s, у ньому знайти кількість 5 та 2 і вивести чого більше
 */

public class Scores52Remaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        HashMap<Character, Integer> res = new HashMap<>();

        // наповнюємо HashMap
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            res.put(c, res.getOrDefault(c, 0) + 1);
        }

        // зчитуємо значення HashMap
        int FiveCount = res.getOrDefault('5', 0);
        int TwoCount = res.getOrDefault('2', 0);

        // вивід з тернарним оператором
        System.out.println(
                TwoCount > FiveCount ? '2' :
                FiveCount > TwoCount ? '5' : '='
        );

        sc.close();

    }
}
