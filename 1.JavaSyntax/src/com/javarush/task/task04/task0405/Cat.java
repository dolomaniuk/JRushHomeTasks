package com.javarush.task.task04.task0405;

/* 
Реализовать метод setCatsCount
*/

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        //напишите тут ваш код
        Cat.catsCount = catsCount;
    }

    public static void main(String[] args) {
setCatsCount(5);
    }
}
