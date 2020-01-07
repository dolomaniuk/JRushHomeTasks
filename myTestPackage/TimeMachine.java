package myTestPacage;

public class TimeMachine {
    public void goToFuture(Cat cat) {
//        cat = new Cat(cat.age);
        cat.age += 10;
    }

    public void goToPast(Cat cat) {
//        cat = new Cat(cat.age);
        cat.age -= 10;
    }

    public static void main(String[] args) {
        TimeMachine timeMachine = new TimeMachine();
        Cat barsik = new Cat("Barsik", 5);

        System.out.println("Age in begining of program: " + barsik.age);

        timeMachine.goToFuture(barsik);
        System.out.println("Barsik has moved in Future. Its Age is " + barsik.age);

        timeMachine.goToPast(barsik);
        System.out.println("Barsik has moved in Past. Its Age is " + barsik.age);
    }
}
