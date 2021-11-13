package Day29;

public class Spider extends Animal{
    int legs = 8;

    public Spider(int legs) {
        super(8);
        this.legs  = legs;

    }

    public void eat(){
        System.out.println("Spider eats insects");
    }
}
