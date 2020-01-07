package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        for (int i = 0; i < 5; i++){
            Zerg zerg = new Zerg();
            zerg.name = "zerg" + i;
            System.out.println(zerg.name);
        }
        for (int i = 0; i < 3; i++){
            Protoss protos = new Protoss();
            protos.name = "protos" + i;
            System.out.println(protos.name);
        }
        for (int i = 0; i < 4; i++){
            Terran terran = new Terran();
            terran.name = "terran" + i;
            System.out.println(terran.name);
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
