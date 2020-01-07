package com.javarush.task.task03.task0325;

import java.io.*;
import java.nio.Buffer;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String n = reader.readLine();
        int n = Integer.parseInt(reader.readLine());
//        int nInt = Integer.parseInt(n);
        System.out.printf("Я буду зарабатывать $%d в час", n);
    }
}
