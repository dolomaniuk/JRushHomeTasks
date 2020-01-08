package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(buffer.readLine());
        System.out.print("количество дней в году: ");
        int daysInYear = 365;
        if (year % 4 == 0 && year % 100 != 0) daysInYear = 366;
        else if(year % 400 == 0) daysInYear = 366;
        System.out.println(daysInYear);

    }
}