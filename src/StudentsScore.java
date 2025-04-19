import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/*
📊 Задача 3: Найпопулярніші оцінки
🔹 Тобі дають список студентів і їхні оцінки.
🔹 Виведи, яку оцінку кожен студент отримував найчастіше.
 */


public class StudentsScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String, HashMap<Integer, Integer>> scores = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            Integer score = sc.nextInt();

            if (!scores.containsKey(name)) {
                scores.put(name, new HashMap<>());
            }

            HashMap<Integer, Integer> people_score = scores.get(name);

            if (people_score.containsKey(score)) {
                people_score.put(score, people_score.get(score) + 1);
            } else {
                people_score.put(score, 1);
            }
        }

        for (String name : scores.keySet()) {
            System.out.println();
            System.out.println(name + ":");

            for (Map.Entry<Integer, Integer> entry : scores.get(name).entrySet()) {
                System.out.println(" " + entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
