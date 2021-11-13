package Day29;

public class Cat extends Animal implements Pet{
    String name;

    /*public Cat (int legs, String name) {
        super(legs);
        this.name = name;
    }*/


    public Cat(int legs, String name) {
        super(4);
        this.name = name;
    }

    public Cat(String name) {
        //super();
        this.name = name;
    }

    public Cat() {
        Cat cat = new Cat("");
    }

    @Override
    public void eat() {
        System.out.println("Cat drinks milk..........");
    }
    @Override
    public void walk() {
        //super.walk();
        System.out.println("Cat walks with " + this.legs + " legs");
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Cat plays with ball");
    }
}
