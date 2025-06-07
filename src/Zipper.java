/*
Хлопчику Дмитру на день народження подарували Спандж Боба, скін в Доті та ще
t подарунків, деякі він вже встиг розпакувати, а інші ще не чіпав.
В одну тесті два рядки:

- перший: action, тобто дія, unzip / zip
- другий: подарунок, з яким потрібно провести маніпуляції

Zip:

дано рядок, наприклад AAABBC, вам потрібно вивести такий: 3A2B1C,
тобто обчислити скільки однакових букв стоїть поряд

Unzip:

все навпади: гарантовано до кожного числа буде йти буква, наприклад
3A2B1C, потрібно вивести AAABBC.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Zipper {

    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(sc.readLine());

            while (t-- > 0) {
                String action = sc.readLine();
                String line = sc.readLine();

                switch (action) {
                    case "zip" -> zip(line);
                    case "unzip" -> unzip(line);
                    default -> throw new AssertionError();
                }
                System.out.println();
            }
        }
    }

    private static void zip(String line) {
        int count = 1;

        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) != line.charAt(i + 1)) {
                System.out.print(count + String.valueOf(line.charAt(i)));
                count = 1;
            } else {
                count++;
            }
        }
        System.out.print(count + String.valueOf(line.charAt(line.length() - 1)));
    }

    private static void unzip(String line) {
        for (int i = 0; i < line.length(); i += 2) {
            int count = Character.getNumericValue(line.charAt(i));
            char ch = line.charAt(i + 1);

            for (int j = 0; j < count; j++) {
                System.out.print(ch);
            }
        }
    }
}
