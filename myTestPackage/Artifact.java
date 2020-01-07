package myTestPacage;

public class Artifact {
    int id;
    String culture;
    int age;

    public Artifact(int id) {
        this.id = id;
    }

    public Artifact(int id, String culture) {
        this.id = id;
        this.culture = culture;
    }

    public Artifact(int id, String culture, int age) {
        this.id = id;
        this.culture = culture;
        this.age = age;
    }

    public static void main(String[] args) {
        Artifact art1 = new Artifact(212121);
        Artifact art2 = new Artifact(212122, "Ацтеки");
        Artifact art3 = new Artifact(212122, "Ацтеки", 12);
    }
}
