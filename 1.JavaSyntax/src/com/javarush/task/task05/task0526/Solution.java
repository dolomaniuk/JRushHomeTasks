package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {

    private static class People {

        private String name = "null";
        private int age;
        private String address = "null";

        public People() {
        }

        public People(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

    }

    public static class Man extends People {
        public Man(String name, int age, String addres) {
            super(name, age, addres);
        }
    }

    public static class Woman extends People {
        public Woman(String name, int age, String address) {
            super(name, age, address);
        }
    }

    public static void main(String[] args) {
        Man man = new Man("Vasia", 25, "Brest");
        Man man1 = new Man("Petia", 32, "Vitebsk");
        Woman woman = new Woman("Dasha", 21, "Minsk");
        Woman woman1 = new Woman("Katia", 17, "Mogilev");
        System.out.println(man.getName() + " " + man.getAge() + " " + man.getAddress());
        System.out.println(man1.getName() + " " + man1.getAge() + " " + man1.getAddress());
        System.out.println(woman.getName() + " " + woman.getAge() + " " + woman.getAddress());
        System.out.println(woman1.getName() + " " + woman1.getAge() + " " + woman1.getAddress());
    }
}

