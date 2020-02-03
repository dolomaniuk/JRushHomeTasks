package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int strLength = str.length();
        int count;
        if (Character.isDigit(str.charAt(0))) count = 0;
        else count = 1;

        System.out.println(count);

        for (int i = count; i < strLength; i++) {
            if (str.charAt(i) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.printf("Even: %d Odd: %d", even, odd);
    }
}
