import java.util.Scanner;
import java.util.HashMap;


public class ClosedBrackets {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                String s = sc.nextLine();

                HashMap<Character, Integer> data = new HashMap<>();
    
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    data.put(c, data.getOrDefault(c, 0) + 1);
                }
    
                if (data.containsValue(1) || data.containsValue(3)) {
                    System.out.println("Yes");
                }
                else {
                    System.out.println("No");
                }
            }
        }
    }
}
