package Day5;

public class IPhone extends Mobile{
    String ModelNo;
    double storage;

    public IPhone(double price, String color, String modelNo, double storage) {
        super(price, color);
        this.ModelNo = modelNo;
        this.storage = storage;
    }

    void printInfo(){
        super.printInfo();
        System.out.println("The iphone model number is " + ModelNo);
        System.out.println("The storage of iphone is " + storage + " GB");
    }
}
