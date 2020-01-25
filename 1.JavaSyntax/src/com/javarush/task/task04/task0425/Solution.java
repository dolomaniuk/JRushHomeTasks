package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int quarter = 0;
        if(a > 0 && b > 0) quarter = 1;
        else if(a < 0 && b > 0) quarter = 2;
        else if(a < 0 && b < 0) quarter = 3;
        else if(a > 0 && b < 0) quarter = 4;
//        else System.out.printf("poin(%d, %d)", a, b);
        System.out.println(quarter);
    }
}
