package Day25.Question2;

public class Mobile {
    private String brand;
    private double price;
    private double total;

    public Mobile(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDiscountAmount(){
        double discountAmount = 0.10 * this.price;
        return discountAmount;
    }

    public void calculateTotal() {
        total = this.price - getDiscountAmount();
        //System.out.println("Total Amount : $ " + total);
    }

    public void display(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: $" + this.price);
        System.out.println("Total: $" + this.total);
    }

    public void MobileDisplay (Mobile mobile, double price){
        mobile.setPrice(price);
        mobile.calculateTotal();
        mobile.display();
    }

}





