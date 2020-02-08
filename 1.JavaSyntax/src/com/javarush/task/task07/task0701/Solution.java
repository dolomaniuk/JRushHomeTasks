package com.javarush.task.task07.task0701;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray(new int[20]);
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray(int[] array) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        return Arrays.stream(array).summaryStatistics().getMax();
    }
}
