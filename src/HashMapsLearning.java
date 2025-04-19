import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Задача: Топ частоти слів
Напиши програму, яка:

Отримає список слів (у вигляді ArrayList<String>)

Порахує, скільки разів кожне слово зустрічається

Виведе:

всі унікальні слова

кількість повторень кожного слова

слово, яке зустрілося найчастіше
 */

public class HashMapsLearning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // зчитуємо дані
        int n = sc.nextInt();
        String[] arr = new String[n];

        // наповнюємо arr
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        /*
        HashMap:
        Key, Value
         */

        /*

        Методи:

        Метод	                  Опис
        map.put(key, value)	      додати або оновити пару
        map.get(key)	          отримати значення
        map.containsKey(key)	  чи є ключ
        map.containsValue(value)  чи є значення
        map.remove(key)	          видалити за ключем
        map.size()	              розмір
        map.clear()	              очистити все
        map.keySet()	          усі ключі
        map.values()	          усі значення

         */

        HashMap<String, Integer> res = new HashMap<>();

        // Наповнення res
        for (int i = 0; i < n; i++) {
            if (res.containsKey(arr[i])) {
                res.put(arr[i], res.get(arr[i]) + 1);
            } else {
                res.put(arr[i], 1);
            }
        }

        // Вивід res
        for (String key : res.keySet()) {
            System.out.println(key + " -> " + res.get(key));
        }

        // Вивід найчастішого слова

        int maxCount = 0;

        for (Integer value : res.values()) {
            if (value > maxCount) {
                maxCount = value;
            }
        }

        for (Map.Entry<String, Integer> entry : res.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.println("Найчастіше слово: " + entry.getKey() +
                        " (" + maxCount + " рази).");
            }
        }
    }
}
