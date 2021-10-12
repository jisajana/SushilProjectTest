package Day7;

import java.util.Scanner;

public class PokharaAirline implements Airline{
    @Override
    public int getTotalAvailableSeats() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of seats available in Pokhara Airline: ");
        int noOfSeats = scanner.nextInt();
        return noOfSeats;
    }

    @Override
    public void printName() {
        System.out.println("Print Passenger name in Pokhara Airline " + "\n");
    }

    @Override
    public boolean book(String name, String passportNo) {

        if (name != null && passportNo != null) {
            return true;
        } else {
            return false;
        }

    }
}
