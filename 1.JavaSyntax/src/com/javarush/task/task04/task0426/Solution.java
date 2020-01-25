package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        final String ZERO = "ноль";
        final String POZITIVE = "положительное ";
        final String NEGATIVE = "отрицательное ";
        final String EVEN = "четное число";
        final String ODD = "нечетное число";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        String text = "";
        boolean flagZero = (number == 0);
        boolean flagSing = (number > 0);
        boolean flagParity = (number % 2 == 0);

        if (flagZero) text = ZERO;
        else {
            if(flagSing) text = POZITIVE;
            else text = NEGATIVE;
            if(flagParity) text += EVEN;
            else text += ODD;
        }
        System.out.println(text);
    }
}
