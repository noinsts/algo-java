/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andriy
 */

import java.util.Scanner;

public class TwoChar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();

            int maxValue = Integer.MIN_VALUE;

            for (int i = 0; i < s.length(); i++) {
                int x = Character.getNumericValue(s.charAt(i));
                if (x > maxValue) {
                    maxValue = x;
                }
            }

//            for (int = 0; i < s.length(); i++) {
//                if ()...
//
//                // basecamp.eolymp.com/uk/problems/7814
//            }

        }
    }
}
