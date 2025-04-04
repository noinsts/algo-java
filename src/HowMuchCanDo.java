import java.util.Scanner;

/*
Дано натуральне число n.
Від даного числа віднімемо суму цифр цього числа, від утвореного числа знову віднімемо суму цифр утвореного числа і т. д.
Дану операцію над числом будемо виконувати, поки утворене число додатне.
Скільки разів будемо виконувати дану операцію.
 */

public class HowMuchCanDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int counter = 0;

        while (n > 0) {
            int ss = findSum(n);
            n -= ss;
            counter++;
        }
        System.out.println(counter);
    }

    private static int findSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
