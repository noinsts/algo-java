import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/*
У рядку через пробіл задано щонайменше три цілі числа.
Якщо серед них є рівно два різних числа, виведіть те, яке зустрічається частіше.
Якщо обидва числа зустрічаються однакову кількість разів, виведіть менше з них.
В іншому випадку виведіть "NO".
 */

public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Long, Integer> res = new HashMap<>();

        /*

        Методи:

        Метод                       Опис
        map.put(key, value)	        додати або оновити пару
        map.get(key)	            отримати значення
        map.containsKey(key)	    чи є ключ
        map.containsValue(value)    чи є значення
        map.remove(key)	            видалити за ключем
        map.size()	                розмір
        map.clear()	                очистити все
        map.keySet()	            усі ключі
        map.values()	            усі значення

         */

        // наповнюємо HashMap
        while (sc.hasNextLong()) {
            long key = sc.nextLong();
            res.put(key, res.getOrDefault(key, 0) + 1);
        }

        if (res.size() != 2) {
            System.out.println("NO");
            return;
        }

        long key1 = 0; int value1 = 0;
        long key2 = 0; int value2 = 0;
        int i = 0;


        // аналізуємо HashMap
        for (Map.Entry<Long, Integer> entry : res.entrySet()) {
            if (i == 0) {
                key1 = entry.getKey();
                value1 = entry.getValue();
            }
            else {
                key2 = entry.getKey();
                value2 = entry.getValue();
            }
            i++;
        }

        // виводимо значення
        System.out.println(
                value1 > value2 ? key1 :
                value2 > value1 ? key2 : Math.min(key1, key2)
        );


        sc.close();

    }
}
