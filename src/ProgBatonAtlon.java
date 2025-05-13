import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

public class ProgBatonAtlon {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = Integer.parseInt(sc.nextLine());  // count of tests
            // зчитуємо рядком і переводимо в Integer
            
            HashMap<String, Integer> data = new HashMap<>();
            
            // add items into hashmap
            for (int i = 0; i < t; i++) {
                String line = sc.nextLine();
                String[] parts = line.split(" ");

                String name = parts[0];
                int sum = 0;
                int progSolved = 0;

                int minValue = Integer.MAX_VALUE;
                int maxValue = Integer.MIN_VALUE;

                // в цьому випадку записуємо все в масив parts, 
                // де parts[0] -- назва, 
                // все остальне -- числа

                for (int j = 1; j < parts.length; j++) {
                    int x = Integer.parseInt(parts[j]);
                    if (x > 9) {
                        progSolved++;
                    }

                    if (x > maxValue) {
                        maxValue = x;
                    }

                    if (x < minValue) {
                        minValue = x;
                    }
                }

                int[] scores = new int[6];

                for (int j = 1; j <= 6; j++) {
                    int x = Integer.parseInt(parts[j]);
                    scores[j-1] = x;
                }

                Arrays.sort(scores);

                int trumpScore = 0;

                for (int j = 1; j < 5; j++) {
                    trumpScore += scores[j];
                }

                data.put(name, data.getOrDefault(name, 0) + trumpScore + 10 * progSolved);

            }

            // sorting hashmap
            ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(data.entrySet());
            entries.sort((a, b) -> b.getValue() - a.getValue());

            // output
            for (Map.Entry<String, Integer> entry : entries) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
