package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int summ = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = 0;
        while (number != -1){
            number = Integer.parseInt(reader.readLine());
            summ += number;
        }

        System.out.println(summ);
    }
}
