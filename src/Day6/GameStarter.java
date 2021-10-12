package Day6;

import java.util.Scanner;

public class GameStarter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter game name : ");
        String gameName = scanner.nextLine();

        System.out.println("Please enter number of Players : ");
        int noOfPlayers  = scanner.nextInt();

        CounterStrike counterStrike = new CounterStrike(gameName, noOfPlayers);

        counterStrike.setVersion("52.0");

        counterStrike.print();

    }

}
