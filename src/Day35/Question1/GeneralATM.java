package Day35.Question1;

import java.util.Scanner;

public class GeneralATM {
    private double mainBalance = 100000.00;
    private int timeLimit;
    private int limitAttempts;
    int unsuccessfulAttempts = 0;
    Scanner scanner = new Scanner(System.in);

    public double getMainBalance() {
        return mainBalance;
    }

    public void setMainBalance(double mainBalance) {
        this.mainBalance = mainBalance;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public int getLimitAttempts() {
        return limitAttempts;
    }

    public void setLimitAttempts(int limitAttempts) {
        this.limitAttempts = limitAttempts;
    }

    public void getUserPin(int userPin) {

        while (userPin != 2021) {
            unsuccessfulAttempts++;
            System.out.println("unsuccessfulAttempts " + unsuccessfulAttempts);
            if (unsuccessfulAttempts == limitAttempts) {
                unsuccessfulAttempts = 0;
                System.out.println("Please wait 5 sec to enter PIN again");
                try {
                    Thread.sleep(timeLimit);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

            System.out.println("Incorrect PIN. Enter your 4-digit PIN: ");
            userPin = scanner.nextInt();
        }
    }

    public void deposit(double amountToDeposit){
        if (amountToDeposit> 500000){
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

    public void  withdraw(double amountToWithdraw){
        if (amountToWithdraw < mainBalance){
            mainBalance = mainBalance - amountToWithdraw;
            System.out.println("Amount of " + amountToWithdraw + " is successfully withdrawn.");
        }
        else {

            System.out.println("Withdrawal amount exceeds total balance.");
        }
    }

    public void display(){
        System.out.println("The total balance is : $ " + mainBalance);
    }

    public void exit(){
        System.out.println("Exiting the system");
        System.exit(0);
    }
}
