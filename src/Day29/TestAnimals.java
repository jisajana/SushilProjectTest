package Day29;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider(8);
        Pet p = new Cat();


        d.eat();
        System.out.println(d.getName());
        d.play();
        d.walk();

        System.out.println(c.getName());
        c.walk();


    }
}
