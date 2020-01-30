package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        int number = 0;
        int summa = 0;

        while (!text.equals("сумма")) {
            try {
                number = Integer.parseInt(text);
                summa += number;
            } catch (NumberFormatException e) {
            }
            text = reader.readLine();
        }
        System.out.println(summa);
    }
}
