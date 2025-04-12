import java.util.Scanner;

/*
💡 Задача: Баланс лівих і правих
Дано рядок, що складається лише з символів L і R. Твоя задача — порахувати, на скільки збалансовані ці символи:

Якщо кількість L дорівнює кількості R — виведи Balanced.

Якщо L більше — виведи More L.

Якщо R більше — виведи More R.
 */

public class BalanceLR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = s.length();

        int lcount = 0;
        int rcount = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == 'L') {
                lcount++;
            } else if (c == 'R') {
                rcount++;
            }
        }
        if (lcount > rcount) {
            System.out.println("Більше L");
        } else if (lcount < rcount) {
            System.out.println("Більше R");
        } else {
            System.out.println("Однаково");
        }
    }
}
