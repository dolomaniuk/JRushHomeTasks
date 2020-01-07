package com.javarush.task.task01.task0136;

/*
Да хоть на Луну!
 */

public class Splution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double gEarth = 9.81;
        double gMoon = 9.81 * 17 / 100;
        return earthWeight / gEarth * gMoon;
    }
}
