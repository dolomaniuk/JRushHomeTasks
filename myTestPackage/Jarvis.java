package myTestPacage;

public class Jarvis {

    public void sayHi(String...names){
        for (String name: names) {
            System.out.println("Добрый вечер, " + name + ", как ваши дела?");
        }
    }
//    public void sayHi(String firstGuest) {
//        System.out.println("Добрый вечер, " + firstGuest + ", как ваши дела?");
//    }
//
//    public void sayHi(String firstGuest, String secondGuest) {
//        System.out.println("Добрый вечер, " + firstGuest + ", " + secondGuest + ", как ваши дела?");
//    }

    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();
//        jarvis.sayHi("Tony Stark");
        jarvis.sayHi("Tony Stark", "Capitan America", "Black Vdova", "Hulk");
    }
}
