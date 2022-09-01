package Day29;

import java.sql.SQLOutput;

public class Fish extends Animal implements Pet{
    String name;


    public Fish() {

        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fishes eat small insects.");
    }

    @Override
    public void walk() {

        System.out.println("Fish have no legs, they can't walk. ");

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish plays");
    }
}
