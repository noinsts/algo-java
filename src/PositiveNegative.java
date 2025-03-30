import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int positiveNumberCount = 0;
        int negativeNumberCount = 0;

        for (int i = 0; i < n; i++){
            if (arr[i] >= 0){
                positiveNumberCount++;
            } else {
                negativeNumberCount++;
            }
        }
        System.out.println("Позитивних: " + positiveNumberCount);
        System.out.println("Негативних: " + negativeNumberCount);
    }
}
