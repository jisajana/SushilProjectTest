package Day5;

public class IPhonePro extends IPhone{
    String screenSize;
    double discount;

    public IPhonePro(double price, String color, String modelNo, double storage, String screenSize, double discount) {
        super(price, color, modelNo, storage);
        this.screenSize = screenSize;
        this.discount = discount;
    }

    void printInfo(){
        super.printInfo();
        System.out.println("The iphonePro screen size is " + screenSize + "''");
        System.out.println("The discount on iphonePro $" + discount);
    }
}
