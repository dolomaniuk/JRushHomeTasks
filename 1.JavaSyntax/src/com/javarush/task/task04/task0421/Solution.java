package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String first_name = buf.readLine();
        String second_name = buf.readLine();
        if (first_name.equals(second_name)){
            System.out.println("Имена идентичны");
        }else if (first_name.length() == second_name.length()) System.out.println("Длины имен равны");

    }
}
