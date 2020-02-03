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
        int number = Integer.parseInt(str);
        int razradnost = (number >= 0) ? (razradnost = str.length() - 1) : (razradnost = str.length() - 2);

        for (int i = razradnost; i >= 0; i--) {
            int chislo = (int) (number / Math.pow(10, i));
            int res = (chislo % 2 == 0) ? even++ : odd++;
            number -= chislo * (Math.pow(10, i));
        }
        System.out.printf("Even: %d Odd: %d", even, odd);
    }
}
