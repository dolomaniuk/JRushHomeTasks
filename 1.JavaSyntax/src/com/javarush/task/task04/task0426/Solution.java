package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        String text = "";
        if (number == 0) text = "ноль";
        else {
            if(number > 0) text = "положительное";
            else text = "отрицательное";
            if(number % 2 != 0) text += " нечетное";
            else text += " четное";
            text += " число";
        }
        System.out.println(text);
    }
}
