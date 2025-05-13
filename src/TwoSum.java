/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andriy
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(arr, target));
    }

    private static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> data = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            data.put(i, arr[i]);
        }

        Arrays.sort(arr);

        int l = 0, r = arr.length - 1;

        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == target) return new int[]{gV(data, arr[l]), gV(data, arr[r])};
            else if (sum > target) r--;
            else l++;
        }
        return new int[]{};
    }

    private static <K, V> K gV(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (Objects.equals(entry.getValue(), value)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
