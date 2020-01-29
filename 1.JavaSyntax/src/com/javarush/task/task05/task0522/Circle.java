package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(int x, int y, int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle()
    {
        this(5, 5, 1);
    }

    public Circle(int x)
    {
        this(x,5, 1);
    }

    public Circle(int x, int y)
    {
        this(x, y, 1);
    }

    public static void main(String[] args) {

    }
}