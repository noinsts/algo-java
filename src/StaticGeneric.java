/*
https://basecamp.eolymp.com/uk/problems/10632
 */

import java.util.Stack;

interface Stackable<T> {
    void push(T value); //  добавити  едемент до стека
    T pop();            // видалити елемент зі стека, та повернути його значення
    T peek();           // повернення елемента з вершини стека
    boolean Empty();    // перевірте, чи стек порожній
    int size();         // повертає розмір стека
}

class MyStack<T> implements Stackable<T> {
    public Stack<T> s;

    public MyStack() {
        s = new Stack<>();
    }

    @Override
    public void push(T value) {
        s.push(value);
    }

    @Override
    public T pop() {
        return s.pop();
    }

    @Override
    public T peek() {
        return s.peek();
    }

    @Override
    public boolean Empty() {
        return s.isEmpty();
    }

    @Override
    public int size() {
        return s.size();
    }
}

public class StaticGeneric {
    public static void main(String[] args) {
        Stackable<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek()); // 20
        System.out.println(stack.pop());  // 20
        System.out.println(stack.size()); // 1
        System.out.println(stack.Empty()); // false
    }
}
