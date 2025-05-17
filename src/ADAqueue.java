import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ADAqueue {
    private static final ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt(); // count of queries
            
            for (int i = 0; i < t; i++) {
                String s = sc.next();
                switch (s) {
                    case "back" -> System.out.println(back());
                    case "front" -> System.out.println(front());
                    case "reverse" -> reverse();
                    case "push_back", "toFront" -> {
                        int x = sc.nextInt();
                        switch (s) {
                            case "push_back" -> push_back(x);
                            case "toFront" -> toFront(x);
                        }
                    }
                    default -> throw new AssertionError();
                }
            }
        }
    }
    
    private static Object back() {
        try {
            int x = arr.get(arr.size() - 1);
            arr.remove(arr.size() - 1);
            return x;
        }
        catch (IndexOutOfBoundsException e) {
            return "Nothing to do in ADA";
        }
    }
    
    private static Object front() {
        try {
            int x = arr.get(0);
            arr.remove(0);
            return x;
        } catch (IndexOutOfBoundsException e) {
            return "Nothing to do in ADA";
        }
    }

    private static void reverse() {
        Collections.reverse(arr);
    }

    private static void push_back(int x) {
        arr.add(x);
    }

    private static void toFront(int x) {
        arr.add(0, x);
    }
}
