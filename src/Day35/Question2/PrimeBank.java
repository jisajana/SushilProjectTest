package Day35.Question2;

import Day35.Question1.GeneralATM;

import java.util.Scanner;

public class PrimeBank extends GeneralATM   {
    double mainBalance = super.getMainBalance();

    @Override
    public void deposit(double amountToDeposit) {
        mainBalance = mainBalance + amountToDeposit;
        System.out.println("Amount of $" + amountToDeposit + " is successfully deposited.");
    }


}

