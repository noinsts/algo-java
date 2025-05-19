import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        Set<Character> data = new HashSet<>();
        
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();

            int counter = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                
                if (data.contains(c)) {
                    System.out.println(counter);
                    break;
                } else {
                    data.add(c);
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
