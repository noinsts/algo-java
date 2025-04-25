import java.util.Scanner;
import java.util.HashMap;

/*
Дано ціле число r (1≤r≤10
5
 ).

Потрібно знайти кількість пар цілих чисел (x,y), що задовольняють наступним умовам:

0≤x<y≤r;

x+y=r.


 */

public class KNUstudentA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        HashMap<Integer, Integer> data = new HashMap<>();

        int res = 0;

        for (int i = 0; i <= r; i++) {
            for (int j = r; j >= 0; j--) {
                if (i + j == r && 0 <= i && i <= j && j <= r) {
                    if (!data.containsKey(i) && !data.containsKey(j)) {
                        data.put(i, j);
                        res++;
                    }
                }
            }
        }

        System.out.println(res);

        sc.close();

    }
}
