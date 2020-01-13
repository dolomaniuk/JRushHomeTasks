package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

import static java.lang.Math.max;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

            int num1 = Integer.parseInt(buff.readLine());
            int num2 = Integer.parseInt(buff.readLine());
            int num3 = Integer.parseInt(buff.readLine());
            int num4 = Integer.parseInt(buff.readLine());
        System.out.println(max(max(num1, num2),max(num3, num4)));
    }
}
