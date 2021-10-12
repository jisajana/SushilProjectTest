package Day13;

import java.util.Scanner;

public class SunnyNumber {

    public boolean sunnyNumberFinding(int n) {
        for (int i = 1; i < n; i++) {
            if ((n + 1) == i * i) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SunnyNumber sunnyNumber = new SunnyNumber();
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();

        while (true) {
            System.out.println("Enter a number to check if it a Sunny Number: ");
            int n = scanner.nextInt();
            if (sunnyNumber.sunnyNumberFinding(n) != true) {
                System.out.println(n + " is not sunny number. Enter next number");
            } else {
                System.out.println(n + " is a sunny number.");
                System.out.println("Do you want to enter another number: Type 1 for 'yes' and 2 for 'No'");
                int userInput = scanner.nextInt();
                if (userInput == 1) {
                    continue;
                }
                else {
                    break;
                }
            }

        }

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it a Sunny Number: ");
        int n = scanner.nextInt();


        while (sunnyNumber.sunnyNumberFinding(n) != true){
            System.out.println(n + " is not sunny number. Enter next number");
            n = scanner.nextInt();
        }
        System.out.println(n + " is a sunny number.");
    }*/
    }
}


