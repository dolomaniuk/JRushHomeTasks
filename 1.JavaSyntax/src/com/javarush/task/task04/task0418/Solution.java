package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int num1 = 0, num2 = 0;
        try {
            num1 = Integer.parseInt(buff.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            num2 = Integer.parseInt(buff.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Math.min(num1, num2));
    }
}