package Day35.Question3;

import java.util.Scanner;

public class Runner3 {
    public static void main(String[] args) {
        MegaBank megaBank = new MegaBank();

        String more = "yes";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your 4-digit PIN: ");
        int userPin = scanner.nextInt();


        /*//int unsuccessfulAttempts = 0;
        int limitAttempts  = 3;
        int timeLimit = 0;*/

        megaBank.setLimitAttempts(3);

        megaBank.setTimeLimit(0);

        /*while (userPin != 2021) {
            unsuccessfulAttempts++;
            System.out.println("unsuccessfulAttempts " + unsuccessfulAttempts);
            if (unsuccessfulAttempts == limitAttempts) {
                unsuccessfulAttempts =0;
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

*/
        megaBank.getUserPin(userPin);

        while (more.equalsIgnoreCase("yes")) {
            System.out.println("Option 1: Deposit");
            System.out.println("Option 2: Withdraw");
            System.out.println("Option 3: Check the balance");
            System.out.println("Option 4: Exit");

            System.out.println("Choose the options from above: ");
            int userInput = scanner.nextInt();

            switch (userInput) {

                case 1:
                    System.out.println("Enter the amount that you want to deposit: $ ");
                    double depositAmt = scanner.nextDouble();
                    megaBank.deposit(depositAmt);
                    break;

                case 2:
                    System.out.println("Enter the amount that you want to withdraw: $ ");
                    double withdrawlAmt = scanner.nextDouble();
                    megaBank.withdraw(withdrawlAmt);
                    break;

                case 3:
                    megaBank.display();
                    break;

                case 4:
                    megaBank.exit();

            }
            System.out.println("Want to continue. Enter 'Yes' to 'continue' and 'No' to 'exit' ");
            more = scanner.next();
        }
    }

}
