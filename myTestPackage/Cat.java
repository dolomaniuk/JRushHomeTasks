package myTestPacage;

public class Cat {

    String name;
    int age;

    static int count = 0;

    // конструктор для класса Cat

    public Cat(int age) {
        count++;
        this.name = "Street cat #" + count;
        this.age = age;
        System.out.println("Create a cat " + this.name);
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayMeo() {
        System.out.println("Meo!!");
    }

    public void jump() {
        System.out.println("Jump! Jump!");
    }

    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 5);
//        Cat vaska = new Cat();

        barsik.sayMeo();
        barsik.jump();
    }
}
