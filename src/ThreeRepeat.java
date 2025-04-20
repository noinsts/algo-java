import java.util.HashMap;
import java.util.Scanner;

/*
Дано чотиризначне натуральне число. Визначити, чи містить це число рівно три однакові цифри.
 */

public class ThreeRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();

        HashMap<Character, Integer> res = new HashMap<>();

        // заповнюємо хешмап
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);

            if (res.containsKey(c)) {
                res.put(c, res.get(c) + 1);
            } else {
                res.put(c, 1);
            }
        }

        boolean found = false;

        // обчислюємо хешмап
        for (Integer count : res.values()) {
            if (count == 3 && !found) {
                found = true;
                System.out.println("YES");
            }
        }

        if (!found) {
            System.out.println("NO");
        }
    }
}
