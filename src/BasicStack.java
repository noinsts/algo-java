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

public class BasicStack {
    private final static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                String[] query = sc.nextLine().split(" ");

                switch (query[0]) {
                    case "push" -> push(Integer.parseInt(query[1]));
                    case "pop" -> pop();
                    case "back" -> back();
                    case "size" -> size();
                    case "clear" -> clear();
                    case "exit" -> {
                        exit();
                        return;
                    }
                    // не додаємо default, бо він тут не потрібний
                }
            }
        }
    }

    private static void push(int n) {
        stack.push(n);
        System.out.println("ok");
    }

    private static void pop() {
        if (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    private static void back() {
        if (!stack.isEmpty()) {
            System.out.println(stack.peek());
        }
    }

    private static void size() {
        System.out.println(stack.size());
    }

    private static void clear() {
        stack.clear();
        System.out.println("ok");
    }

    private static void exit() {
        System.out.println("bye");
    }
}
