/*
https://basecamp.eolymp.com/uk/problems/10636
 */

import java.util.ArrayList;

interface Arrayable<T> {
    void push_back(T x); // вставити елемент у кінець масиву
    T pop_back();	       // повернути та видалити останній елемент
    T min();             // повернути мінімальний елемент у масиві
    T max();             // повернути максимальний елемент у масиві
    T sum();             // повернути суму елементів у масиві. Реалізувати для Integer, Long, Double
    boolean Empty();     // перевірити, чи масив порожній
    int size();          // повернути розмір масиву
}

class MyArray<T extends Number & Comparable<T>> implements Arrayable<T> {
    ArrayList<T> m;

    public MyArray() {
        m = new ArrayList<>();
    }

    @Override
    public void push_back(T x) {
        m.add(x);
    }

    @Override
    public T pop_back() {
        return m.removeLast();
    }

    @Override
    public T min() {
        T min = m.getFirst();
        for (T val : m) {
            if (val.compareTo(min) < 0) {
                min = val;
            }
        }
        return min;
    }

    @Override
    public T max() {
        T max = m.getFirst();
        for (T val : m) {
            if (val.compareTo(max) > 0) {
                max = val;
            }
        }
        return max;
    }

    @Override
    public T sum() {
        double total = 0.0;
        for (T val : m) {
            total += val.doubleValue();
        }

        if (m.getFirst() instanceof Integer) {
            return (T) Integer.valueOf((int) total);
        } else if (m.getFirst() instanceof Double) {
            return (T) Double.valueOf(total);
        } else if (m.getFirst() instanceof Long) {
            return (T) Long.valueOf((long) total);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean Empty() {
        return m.isEmpty();
    }

    @Override
    public int size() {
        return m.size();
    }
}

public class ArrayListGeneric {
    public static void main(String[] args) {
        MyArray<Integer> arr = new MyArray<>();

        arr.push_back(5);
        arr.push_back(10);
        arr.push_back(3);

        System.out.println("Min: " + arr.min()); // 3
        System.out.println("Max: " + arr.max()); // 10
        System.out.println("Sum: " + arr.sum()); // 18
        System.out.println("Size: " + arr.size()); // 3
        System.out.println("Empty? " + arr.Empty()); // false

        arr.pop_back();
        System.out.println("After pop: " + arr.sum()); // 15
    }
}
