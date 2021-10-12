package Day5;

public class Mobile {
    double price;
    String color;

    public Mobile(double price, String color) {
        this.price = price;
        this.color = color;
    }

    void printInfo(){
        System.out.println("The price is $ " + price);
        System.out.println("The color is " + color);
    }
}
