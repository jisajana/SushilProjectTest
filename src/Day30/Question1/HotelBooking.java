package Day30.Question1;

import java.sql.SQLOutput;
import java.sql.Time;
import java.util.Scanner;

public class HotelBooking {
    String customerName;
    String roomType;
    int noOfDays;


    public HotelBooking(String customerName, String roomType, int noOfDays) {
        this.customerName = customerName;
        this.roomType = roomType;
        this.noOfDays = noOfDays;

    }

    public double roomCharge( ){
        double totalAmount = 0;
        if (roomType.equalsIgnoreCase("Single")){
            totalAmount = 600.00;
        }
        if (roomType.equalsIgnoreCase("Double")){
            totalAmount = 1000.00;
        }
        return totalAmount;
    }


    public boolean booked() {
        double discount =0;
        double billAmount = roomCharge() - discount;

        if (billAmount > 0) {
            return false;

        }
        return true;

    }

    public void checkin(int checkInTime){

        if (booked()) {
            System.out.println("Customer " + this.customerName + "Check-in time " +checkInTime);
        }
        System.out.println("Customer " + this.customerName + "has outstanding due.");
    }


    public void checkout(int checkOutTime){
        System.out.println("Customer " + this.customerName + "Check-out time " +checkOutTime);    }



}

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Customer's name: ");
        String cusName = scanner.nextLine();

        System.out.println("Enter room type: ");
        String roomType = scanner.nextLine();

        System.out.println("Enter no of days to stay: ");
        int noOfDays = scanner.nextInt();


        HotelBooking hotelBooking = new HotelBooking(cusName, roomType, noOfDays);

        hotelBooking.checkin(10);

        hotelBooking.checkout(5);
    }
}
