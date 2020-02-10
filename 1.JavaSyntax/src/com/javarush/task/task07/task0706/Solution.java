package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] myArray = new int[15];
        int evenCount = 0;
        int oddCount = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0) {
                evenCount += myArray[i];
            } else {
                oddCount += myArray[i];
            }
        }
        String text = (evenCount > oddCount) ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.";
        System.out.println(text);
    }
}
