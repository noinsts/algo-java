/*
https://basecamp.eolymp.com/uk/problems/11787
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;

public class PushPush {
    public static void main(String[] args) throws IOException {
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            int x = Integer.parseInt(sc.readLine());

            String[] line = sc.readLine().trim().split("\\s+");

            ArrayList<Integer> res = new ArrayList<>();

            for (int i = 0; i < x; i++) {
                res.add(Integer.parseInt(line[i]));
                Collections.reverse(res);
            }

            for (int val : res) {
                System.out.printf("%d ", val);
            }
        }
    }
}
