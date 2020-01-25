package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        final String EVEN = "четное ";
        final String ODD = "нечетное ";
        final String ONE_NUMBER = "одно";
        final String TWO_NUMBER = "дву";
        final String THREE_NUMBER = "трех";
        final String N_NUMBER = "значное число";

        String text = "";
        String flag = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if(number >= 1 && number <= 999) {
            boolean parity = (number % 2 == 0);
            if (parity) text += EVEN;
            else text += ODD;

            for (int i = 1; (number / i) >= 1 ; i *= 10) {
                if(i == 1) flag = ONE_NUMBER;
                else if(i == 10) flag = TWO_NUMBER;
                else if(i == 100) flag = THREE_NUMBER;
//                else text = "Exception";
            }
            text += flag + N_NUMBER;
        System.out.println(text);
        }


    }
}
