package com.javarush.task.task04.task0438;

/* 
Рисуем линии
*/

public class Solution {
    public static void main(String[] args) {
        int j = 10;
        for (int i = 0; i <= 10; i++) {
            for (; j > 1; j--) {
                System.out.print(8);
            }
            j = 0;
            System.out.println(8);
        }

    }
}
