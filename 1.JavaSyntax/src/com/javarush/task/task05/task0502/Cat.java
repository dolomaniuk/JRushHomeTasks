package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        short myCount = 0;
        short anotherCatCount = 0;
        if (this.age > anotherCat.age) myCount++;
        else if (this.age != anotherCat.age)anotherCatCount++;
        if (this.weight > anotherCat.weight) myCount++;
        else if (this.weight != anotherCat.weight)anotherCatCount++;
        if (this.strength > anotherCat.strength) myCount++;
        else if (this.strength != anotherCat.strength) anotherCatCount++;

        if (myCount > anotherCatCount) return true;
        else return false;
    }
    public static void main(String[] args) {
        Cat first = new Cat();
        first.age = 10;
        first.weight= 3;
        first.strength= 3;

        Cat second = new Cat();
        second.age = 5;
        second.weight= 3;
        second.strength= 3;

        System.out.println(first.fight(second));
        System.out.println(second.fight(first));
    }
}
