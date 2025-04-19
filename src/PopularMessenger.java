import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/*
🔥 Задача: Анонімна скринька
🔍 Що треба:
Є список "повідомлень", які залишали люди (у форматі name word).

Тобі треба порахувати, хто які слова залишав і які слова кожен залишав найчастіше.

відсортувати результат за кількістю вживання цих слів, від найбільшого до найменшого.


 */

public class PopularMessenger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        6
        Tom hello
        Anna peace
        Tom hello
        Tom peace
        Anna peace
        Tom hello
         */

        int n = sc.nextInt();

        HashMap<String, HashMap<String, Integer>> data = new HashMap<>();

        // збір та запис данних
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String word = sc.next();

            if (!data.containsKey(name)) {
                data.put(name, new HashMap<>());
            }

            /*
            Key, Value
             */

            HashMap<String, Integer> peopleMessages = data.get(name);

            if (peopleMessages.containsKey(word)) {
                peopleMessages.put(word, peopleMessages.get(word) + 1);
            } else {
                peopleMessages.put(word, 1);
            }
        }

        // виводимо дані
        for (String name : data.keySet()) {
            System.out.println();  // пустий рядок для красивого виводу
            System.out.println(name + ":");

            for (Map.Entry<String, Integer> entry : data.get(name).entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

        sc.close();

    }
}
