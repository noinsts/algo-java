import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/*
Перебрати слово і вивести список повторюваних букв
 */

public class FreqCollector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        HashMap<Character, Integer> freq = new HashMap<>();

        // заповнюємо HashMap
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (freq.containsKey(c)) {
                freq.put(c, freq.get(c) + 1);
            } else {
                freq.put(c, 1);
            }
        }

        System.out.println(); // для красивого виводу в консоль

        // вивід даних
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();

    }
}
