/*
https://basecamp.eolymp.com/uk/problems/2164
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class JuliusCipher {

    private static final char[] alphabet = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    private static int k;

    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            // зчитуємо слово
            String word = sc.readLine();

            // зчитуємо число k для обробки шифру
            k = Integer.parseInt(sc.readLine());

            // оброблюємо кожну літеру
            for (int i = 0; i < word.length(); i++) {
                handler(word.charAt(i));
            }
        }
    }

    private static int getIndexFromChar(char c) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == c) {
                return i;
            }
        }

        // заглушка
        return 0;
    }

    private static char getFinalChar(int index) {
        return alphabet[index];
    }

    private static void handler(char c) {
        // знаходимо індекс літери в алфавіті
        int startIndex = getIndexFromChar(c);

        // знаходимо індекс, на який потрібно замінити літеру
        int replaceIndex = startIndex - k;

        // оброблюємо варіант, коли індекс більший за довжину алфавіту
        if (replaceIndex < 0) {
            replaceIndex = alphabet.length + replaceIndex;
        }

        // виводимо зашифроване число
        System.out.printf("%c", getFinalChar(replaceIndex));
    }
}
