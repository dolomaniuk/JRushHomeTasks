package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String symbol = reader.readLine();
        int n = Integer.parseInt(symbol);
        if (n < 0) n ++;
        else if (n > 0) n *= 2;
        System.out.println(n);

    }

}