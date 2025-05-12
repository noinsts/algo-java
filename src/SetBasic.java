import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class SetBasic {
    private static final HashSet<Integer> data = new HashSet<>();
    private static boolean run = true;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextLine() && run) {
                String action = sc.next();

                switch (action) {
                    case "size" -> System.out.println(sizeAction());
                    case "out" -> System.out.println(outAction());
                    case "clear" -> System.out.println(clearAction());
                    case "exit" -> System.out.println(exitAction());
                    case "insert", "erase", "find" -> {
                        int x = sc.nextInt();
                        switch (action) {
                            case "insert" -> System.out.println(insertAction(x));
                            case "erase" -> System.out.println(eraseAction(x));
                            case "find" -> System.out.println(findAction(x));
                        }
                    }
                    default -> throw new AssertionError();
                    }
                }
            }
        }

    private static String insertAction(int x) {
        data.add(x);
        return "ok";
    }

    private static String eraseAction(int x) {
        if (data.contains(x)) {
            data.remove(x);
            return "ok";
        }

        return "error";
    }

    private static String findAction(int x) {
        if (data.contains(x)) {
            return "Yes";
        }
        return "No";
    }

    private static int sizeAction() {
        return data.size();
    }

    private static String outAction() {
        ArrayList<Integer> sorted = new ArrayList<>(data);
        Collections.sort(sorted);

        StringBuilder res = new StringBuilder();

        for (int num : sorted) {
            res.append(num).append(" ");
        }
        return res.toString();
    }

    private static String clearAction() {
        data.clear();
        return "ok";
    }
    
    private static String exitAction() {
        run = false;
        return "bye";
    }
}
