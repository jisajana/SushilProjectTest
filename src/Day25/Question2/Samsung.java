package Day25.Question2;

class Samsung extends Mobile{

    public Samsung(String brand) {
        super(brand);
    }

    public double getDiscountAmount (){
        double discountAmount = 0.15 * getPrice();
        return discountAmount;
    }
}
