import java.util.Scanner;

public class Following {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < n; i++){
            if (arr[i] == arr[i - 1] + 1){
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 1;
            }
        }
        System.out.println(maxCount);
    }
}
