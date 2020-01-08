package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a:");
        int a = Integer.parseInt(buffer.readLine());
        System.out.println("Input b:");
        int b = Integer.parseInt(buffer.readLine());
        System.out.println("Input c:");
        int c = Integer.parseInt(buffer.readLine());

        if(a < (b + c) && b < (a + c) && c < (a + b)) System.out.println("Треугольник существует");
        else System.out.println("Треугольник не существует");
    }
}