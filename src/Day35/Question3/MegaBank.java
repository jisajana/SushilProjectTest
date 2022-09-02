package Day35.Question3;

import Day35.Question1.GeneralATM;
import Day35.Question2.PrimeBank;

import java.util.Scanner;

public class MegaBank extends GeneralATM {
    double mainBalance = 100000.00;
    Scanner scanner = new Scanner(System.in);

    public void deposit(double amountToDeposit){
        if (amountToDeposit> 200000){
            System.out.println("Enter your citizenship number");
            String userInputCitizenship = scanner.next();
            if ( userInputCitizenship.length()== 10 ){
                mainBalance = mainBalance + amountToDeposit;
                System.out.println("Amount of $" + amountToDeposit + " is successfully deposited.");
            }
            else{
                System.out.println("The citizenship number should be 10 digits");
            }
        }
        else {
            mainBalance = mainBalance + amountToDeposit;
            System.out.println("Amount of $" + amountToDeposit + " is successfully deposited.");
        }
    }

    @Override
    public void display() {
        System.out.println("Balance Checking is disabled");
    }
}
