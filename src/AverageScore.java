import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Знаходження середнього арифметичного числа оцінок учнів
 */

public class AverageScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // count of lines

        /*
            Методи ArrayList:

        Метод	                Опис
        list.add(value)     	додає елемент в кінець
        list.get(index)	        повертає елемент за індексом
        list.set(index, value)	змінює значення
        list.remove(index)	    видаляє по індексу
        list.size()         	розмір списку
        list.contains(value)	чи є такий елемент
        list.clear()	        видаляє все

         */

        HashMap<String, ArrayList<Integer>> scores = new HashMap<>();

        // зчитування даних
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            Integer score = sc.nextInt();

            if (!scores.containsKey(name)) {
                scores.put(name, new ArrayList<>());
            }

            ArrayList<Integer> peopleScores = scores.get(name);

            peopleScores.add(score);

        }

        System.out.println();  // пустий рядок для красивого відображення статистики в консолі

        // вичислення середньої арифметичної
        for (Map.Entry<String, ArrayList<Integer>> entry : scores.entrySet()) {
            String studentName = entry.getKey();
            ArrayList<Integer> peopleScore = scores.get(studentName);

            int sum = 0;
            for (int score : peopleScore) {
                sum += score;
            }

            double average = sum / (double) peopleScore.size();

            /*

            Відображення з двома знаками після коми

            double average = 10.756438;
            System.out.printf("Середнє: %.2f\n", average);

             */

            String result = String.format("%s -- %.2f\n", studentName, average);

            System.out.println(result);

        }

        sc.close();

    }
}
