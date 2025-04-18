import java.util.Scanner;

/*
🧠 Задача: Число, що зустрічається лише один раз
Складність: ⭐⭐ (легка/середня, бо треба подумати)

✨ Умова:
У тебе є масив, у якому всі числа дублюються двічі, крім одного — воно зустрічається лише один раз.
Знайди це число.
 */

public class XORTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int res = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            res ^= arr[i];
        }

        System.out.println(res);
    }
}
