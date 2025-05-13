import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

//        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
//                    arrList.remove(arr[i]);
                }
            }
        }

//        System.out.println(arrList);

    }
}
