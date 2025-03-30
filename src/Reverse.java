import java.util.Scanner;

/*
Задача: Переставлення цифр

Умова:
Дано двоцифрове число n. Потрібно переставити його цифри місцями і вивести отримане число.
 */

public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = n / 10;
        int b = n % 10;

        System.out.print(b);
        System.out.print(a);
    }
}
