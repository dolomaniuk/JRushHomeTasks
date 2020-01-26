package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int maximum = Math.max(Math.max(a,b), Math.max(b,c));
        int minimum = Math.min(Math.min(a,b), Math.min(b,c));
        System.out.println(a + b + c - (maximum + minimum));
    }
}
