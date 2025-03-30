import java.util.Scanner;

public class TopNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int dubl = -1;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (arr[i] == arr[j]){
                    dubl = arr[i];
                    break;
                }
            }
            if (dubl != -1) break;

        }
        System.out.println(dubl);
    }
}
