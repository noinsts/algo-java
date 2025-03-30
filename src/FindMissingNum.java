import java.util.Scanner;

public class FindMissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // розмір масиву
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = res(arr, sumArr(arr));
        System.out.println(result);

    }
    private static int sumArr(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            count += arr[i];
        }
        return count;
    }
    private static int res(int[] arr, int sum){
        int n = arr.length + 1;
        int s = n * (n + 1) / 2;
        return s - sum;

    }
}