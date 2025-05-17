import java.util.Scanner;

public class BracketsQuery {
    private static StringBuilder brackets;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            brackets = new StringBuilder(sc.nextLine());
            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                int index = sc.nextInt();
                flipBracket(index);
                System.out.println(checker());
            }
        }
    }
    
    private static void flipBracket(int index) {
        char current = brackets.charAt(index);
        brackets.setCharAt(index, current == '(' ? ')' : '(');
    }

    private static char checker() {
        int openCount = 0, closedCount = 0;

        for (int i = 0; i < brackets.length(); i++) {
            char c = brackets.charAt(i);
            switch (c) {
                case '(' -> openCount++;
                case ')' -> closedCount++;
            }
        }
        
        if (openCount == closedCount) {
            return '+';
        }
        return '-';
    }
}
