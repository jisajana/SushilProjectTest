package Day12;

import java.util.Scanner;

public class ATMProgram {
    double totalAmount;
    Scanner scanner;

    public ATMProgram() {
        scanner = new Scanner(System.in);
        totalAmount = 5000;
    }

    public void deposit() {
        System.out.println("Please enter amount to deposit $");
        double amountToDeposit = scanner.nextDouble();

        totalAmount = totalAmount + amountToDeposit;
        System.out.println("The amount deposit  is successful. ");
        System.out.println("The total amount in  bank after deposit is $: " + totalAmount);
    }

    public void withdraw() {
        System.out.println("Please enter amount to withdraw $");
        double amountToWithdraw = scanner.nextDouble();

        if (amountToWithdraw <= totalAmount) {
            totalAmount = totalAmount - amountToWithdraw;
            System.out.println("The amount withdrawn is successful. ");
            System.out.println("The total amount in  bank after withdrawal is $: " + totalAmount);
        } else {
            System.out.println("The amount to withdraw is more than total amount in the bank.");
        }
    }

    public void checkBalance() {
        System.out.println("The total balance in bank is $" + totalAmount);
    }

    public static void main(String[] args) {
        ATMProgram atmProgram = new ATMProgram();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Option 1 for deposit");
            System.out.println("Option 2 for withdraw");
            System.out.println("Option 3 for check");
            System.out.println("Option 4 to exit");
            System.out.println("Please choose the options from above: ");

            int userInput = scanner.nextInt();

            if (userInput == 1) {
                atmProgram.deposit();
            } else if (userInput == 2) {
                atmProgram.withdraw();
            } else if (userInput == 3) {
                atmProgram.checkBalance();
            } else {
                break;
            }


        }
    }
}
