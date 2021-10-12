package Day5;

import java.util.Scanner;

public class RestaurantProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter subtotal : ");
        Float subtotal = scanner.nextFloat();

        Restaurant restaurant = new Restaurant(subtotal);
        System.out.println("The total amount is $" +restaurant.totalAmount());

        System.out.println("Please enter subtotal : ");
        Float subtotal1 = scanner.nextFloat();

        MyRestro myrestro = new MyRestro(subtotal1);
        System.out.println("The total amount without VAT and TAX $" +myrestro.totalAmount());

    }
}

class Restaurant{
     Float subtotal;

    public Restaurant(Float subtotal) {
        this.subtotal = subtotal;
    } // constructor

    public Float getTax(){
        float tax = subtotal * 10/100;
        return tax;
    }

    public Float getVat(){
        float vat = subtotal * 13/100;
        return vat;
    }

    public Float totalAmount(){
        Float total = subtotal + getTax() + getVat();
        return total;
    }

}

class MyRestro extends Restaurant{
    public MyRestro(Float subtotal) {
        super(subtotal);
    }

    public Float getTax(){
        float tax = 0.0f;
        return tax;
    }

    public Float getVat(){
        float vat = 0.0f;
        return vat;
    }

}
