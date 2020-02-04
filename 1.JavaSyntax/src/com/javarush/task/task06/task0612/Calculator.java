package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        double newA = a;
        double newB = b;
        return newA / newB;
    }

    public static double percent(int a, int b) {
        double newA = a;
        double newB = b;
        double x = newA * newB / 100;
        return x;
    }

    public static void main(String[] args) {

    }
}