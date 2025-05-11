import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Castles {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();  // загальна кількість веж
            int m = sc.nextInt();  // кількість веж, що мають потрапити в нагляд
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            // наповнюємо масив
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            
            int l = Math.min(arr.getFirst(), arr.get(n-1));
            int r = Math.max(arr.getFirst(), arr.get(n-1));
            
            arr.removeFirst();
            arr.remove(n-2);
            
            Collections.sort(arr);
            
            // знаходимо кількість опервцій
            int counter = 0;
            
            int size = Math.max(arr.size(), m);

            for (int i = 1; i < size; i++) {
                if (arr.get(i) > r || arr.get(i) < l) {
                    int res = Math.min(Math.abs(arr.get(i) - r), Math.abs(arr.get(i) + l));
                    counter += res;
                }
            }
            
            System.out.println(counter);
        }
    }
}
