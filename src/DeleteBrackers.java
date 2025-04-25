import java.util.HashMap;
import java.util.Scanner;

public class DeleteBrackers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        HashMap<Character, Integer> data = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            data.put(c, data.getOrDefault(c, 0) + 1);
        }

        System.out.println(data.values());

        int a = data.get('(');
        int b = data.get(')');

        int res = Math.max(a, b) - Math.min(a, b);

        System.out.println(res);

        sc.close();

    }
}
