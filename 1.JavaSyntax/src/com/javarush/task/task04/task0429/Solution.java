package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        short count_pos = 0;
        short count_neg = 0;
        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(reader.readLine());
            if(a > 0) count_pos++;
            if(a < 0) count_neg++;
        }
        System.out.println("количество положительных чисел: " + count_pos);
        System.out.println("количество отрицательных чисел: " + count_neg);
    }
}
