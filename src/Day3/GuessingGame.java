package Day3;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(10);

        Scanner scanner = new Scanner(System.in);

        int unsuccessfulAttempt = 0;
        int success = 0;
        long startTime = 0;
        long endTime = 0;
        long elapsedTime = 0;


        while (success == 0) {
            System.out.println("Please enter a number : ");
            startTime = System.currentTimeMillis();

            try {
                int numberGuessed = scanner.nextInt();

                if (numberGuessed != randomNumber) {
                    System.out.println("Not a correct guess. Good luck for next attempt : ");
                    unsuccessfulAttempt++;
                } else {
                    System.out.println("You have guessed the correct number.");
                    success++;
                    endTime = System.currentTimeMillis();
                    elapsedTime = endTime - startTime;
                }
            } catch (Exception e) {
                System.out.println("You need to enter a number. ");
                    String a= scanner.nextLine();
                           }
        }
            System.out.println("Number of unsuccessful attempts : " +unsuccessfulAttempt);
            System.out.println("The correct random number is : " +randomNumber);

            System.out.println("The time taken to guess a random number: " + elapsedTime  + " milliseconds");
    }

}

