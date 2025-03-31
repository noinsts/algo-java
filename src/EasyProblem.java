import java.util.Scanner;

public class EasyProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int first = n / 10;
        int second = n % 10;

        System.out.print(first + " ");
        System.out.print(second);
    }
}
