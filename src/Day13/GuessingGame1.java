package Day13;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame1 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10);

        Scanner scanner = new Scanner(System.in);

        int unsuccessfulAttempt = 0;
        int success = 0;
        while (success == 0) {
            System.out.println("Please enter a number : ");

            try {
                int numberGuessed = scanner.nextInt();

                if (numberGuessed != n) {
                    System.out.println("Not a correct guess. Good luck for next attempt : ");
                    unsuccessfulAttempt++;
                } else {
                    System.out.println("You have guessed the correct number.");
                    success++;
                }
            } catch (Exception e) {
                System.out.println("Invalid Entry.");
                //int numberGuessed = scanner.nextInt();
                String a= scanner.nextLine();
            }
        }
        System.out.println("Number of unsuccessful attempts : " +unsuccessfulAttempt);
        System.out.println("The correct random number is : " + n);

    }


}