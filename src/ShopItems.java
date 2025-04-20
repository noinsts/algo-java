import java.util.Scanner;

/*
Задано кількість видів іграшок в магазині,
кількість іграшок кожного виду та вартість іграшки кожного виду.
Визначити кількість іграшок, вартість яких менша за 50 грн.
 */

public class ShopItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0;

        for (int i = 0; i < n; i++) {
            int count = sc.nextInt();
            double cost = sc.nextDouble();

            if (cost < 50) {
                res += count;
            }
        }

        System.out.println(res);

        sc.close();
    }
}
