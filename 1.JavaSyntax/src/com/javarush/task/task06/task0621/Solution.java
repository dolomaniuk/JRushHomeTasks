package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandFather, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String doughterName = reader.readLine();
        Cat catDoughter = new Cat(doughterName, catFather, catMother);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDoughter);
    }

    public static class Cat {
        private String name;
        private Cat fatherParent;
        private Cat motherParent;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat fatherParent, Cat motherParent) {
            this.name = name;
            this.fatherParent = fatherParent;
            this.motherParent = motherParent;
        }

        @Override
        public String toString() {
            String text = (motherParent == null) ? ", no mother " : ", mother is " + motherParent.name;
            text += (fatherParent == null) ? ", no father " : ", father is " + fatherParent.name;

            return "The cat's name is " + name + text;
        }
    }

}
