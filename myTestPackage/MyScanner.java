package myTestPacage;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");

        if(scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("Thanks! You've inputed the number: " + number);
        } else {
            System.out.println("Sorry, but it isn't the number! Restart the program and try again!");
        }

        scanner.close();

        Scanner scan = new Scanner("На голой ветке\n" +
                "Ворон сидит одиноко.\n" +
                "Осенний вечер.\n\n***" +
                " \n" +
                " \n" +
                "В небе такая луна,\n" +
                "Словно дерево спилено под корень:\n" +
                "Белеет свежий срез.\n\n***" +
                " \n" +
                " \n" +
                "Как разлилась река!\n" +
                "Цапля бредет на коротких ножках,\n" +
                "По колено в воде.");

        scan.useDelimiter("\n/*/*/*");

        while (scan.hasNext()) {
            System.out.println(scan.next());
        }

        scan.close();

    }
}
