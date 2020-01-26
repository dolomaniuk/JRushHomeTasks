package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int n = Integer.parseInt(reader.readLine());

        try{
            while (n > 0){
                System.out.println(str);
                n--;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
