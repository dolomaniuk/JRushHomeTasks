package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        short count = 0;

        int a = Integer.parseInt(reader.readLine());
            if(a > 0) count++;
        int b = Integer.parseInt(reader.readLine());
            if(b > 0) count++;
        int c = Integer.parseInt(reader.readLine());
            if(c > 0) count++;
            System.out.print(count);
        }
    }

