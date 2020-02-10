package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] bigArray = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }
        smallArray1 = Arrays.copyOf(bigArray, bigArray.length / 2);

        smallArray2 = Arrays.copyOfRange(bigArray, 10, bigArray.length);
        for (int item :
                smallArray2) {
            System.out.println(item);
        }
    }
}
