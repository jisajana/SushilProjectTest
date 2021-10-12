package Day7;

import java.util.Scanner;

public class KathmanduAirline implements Airline {

    @Override
    public int getTotalAvailableSeats() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of seats available in Kathmandu airline: ");
        int noOfSeats = scanner.nextInt();
        return noOfSeats;
    }

    @Override
    public void printName() {
        System.out.println("Print Passenger name in Kathmandu airline" + "\n");
    }

    @Override
    public boolean book(String name, String passportNo) {

        if (name != null && passportNo != null) {
            return true;
        }
        return false;

    }
}
