package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(multy10());
    }

    public static int multy10() {
        int j = 1;
        for (int i = 1; i < 11; i++) {
            j *= i;
        }
        return j;
    }
}
