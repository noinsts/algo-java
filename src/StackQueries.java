/* 
  * | Метод              | Що робить                                       |
| ------------------ | ----------------------------------------------- |
| `push(E item)`     | Додає елемент на вершину стеку                  |
| `pop()`            | Видаляє і повертає верхній елемент              |
| `peek()`           | Просто дивиться на верхній елемент (не видаляє) |
| `isEmpty()`        | Перевіряє, чи стек порожній                     |
| `search(Object o)` | Повертає позицію елемента у стеці (від вершини) |

  */

import java.util.Scanner;
import java.util.Stack;

public class StackQueries {
    private static final Stack<Integer> data = new Stack<>();

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextLine()) {
                String[] parts = sc.nextLine().split(" ");
                
                switch (parts[0]) {
                    case "pop" -> data.pop();
                    case "top" -> {
                        if (!data.isEmpty()) {
                            System.out.println(data.peek());
                        }
                    }
                    case "push" -> data.push(Integer.valueOf(parts[1]));
                    default -> throw new AssertionError();
                }
            }
        }
    }
}
