package Day7;

import java.util.Scanner;

public interface Airline {

    public int getTotalAvailableSeats();

    public void printName();

    public boolean book(String name, String passportNo);
}
