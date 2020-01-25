package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buf.readLine());
        int b = Integer.parseInt(buf.readLine());
        int c = Integer.parseInt(buf.readLine());

        int first_number = max(max(a, b), max(b, c));
        int third_number = min(min(a, b), min(b, c));
        int second_number = (a + b + c - (first_number + third_number));
//        int second_number = 0;

//        if (a == first_number) second_number = max(b, c);
//        else if (b == first_number) second_number = max(a,c);
//        else second_number = max(a, b);
        System.out.printf("%d %d %d", first_number, second_number, third_number);
    }
}
