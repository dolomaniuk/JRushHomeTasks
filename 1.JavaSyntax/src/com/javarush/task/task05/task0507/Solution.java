package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float summ = 0;
        int count = 0;
        int nunber = 0;

        while (nunber != -1){
            summ += nunber;
            nunber = Integer.parseInt(reader.readLine());
            if(nunber!= -1) count++;
        }
        System.out.println(summ / count);
    }
}

