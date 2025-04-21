import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
https://leetcode.com/problems/most-frequent-even-element/description/

Given an integer array nums, return the most frequent even element.

If there is a tie, return the smallest one. If there is no such element, return -1.
 */

public class MostFrequentEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> res = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = arr[i];
            if (x % 2 == 0) {
                res.put(arr[i], res.getOrDefault(x, 0) + 1);
            }
        }

        int num = -1;
        int maxCount = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : res.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount || (count == maxCount && key < num)) {
                num = key;
                maxCount = count;
            }
        }

        System.out.println(num);

        sc.close();

        // Test: 7 0 1 2 2 4 4 1

    }
}
