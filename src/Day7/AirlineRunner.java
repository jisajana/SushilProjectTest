package Day7;

import java.util.Scanner;

public class AirlineRunner {
    public static void main(String[] args) {
        KathmanduAirline kathmanduAirline = new KathmanduAirline();

        int availableSeatsKathmanduAirline = kathmanduAirline.getTotalAvailableSeats();
        System.out.println("The total number of seats available in Kathmandu Airline is : "
                + availableSeatsKathmanduAirline);

        kathmanduAirline.printName();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name of passenger in Kathmandu Airline: ");
        String nameOfPassengerKathmanduAirline = scanner.next();

        System.out.println("Please enter passport number of passenger in Kathmandu Airline: ");
        String passportNumberKathmanduAirline = scanner.next();

        if ((kathmanduAirline.book(nameOfPassengerKathmanduAirline, passportNumberKathmanduAirline))) {
            System.out.println("Booking of passenger " + nameOfPassengerKathmanduAirline +
                    " with passport number " + passportNumberKathmanduAirline + " is successful.");
        }

        PokharaAirline pokharaAirline = new PokharaAirline();

        int availableSeatsPokharaAirline = pokharaAirline.getTotalAvailableSeats();
        System.out.println("The total number of seats available in Kathmandu airline is : "
                + availableSeatsPokharaAirline);

        pokharaAirline.printName();

        System.out.println("Please enter name of passenger in Pokhara Airline: ");
        String nameOfPassengerPokharaAirline = scanner.next();

        System.out.println("Please enter passport number of passenger in  Pokhara Airline: ");
        String passportNumberPokharaAirline = scanner.next();

        if ((pokharaAirline.book(nameOfPassengerPokharaAirline, passportNumberPokharaAirline))) {
            System.out.println("Booking of passenger " + nameOfPassengerKathmanduAirline +
                    " with passport number " + passportNumberKathmanduAirline + " is successful.");
        }

    }
}

