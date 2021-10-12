/*WAP to print how many numbers exactly divides the input number (or any number).
        (E.g. If the number is 10, then it is divided by 1, 2, 5 and 10, so the output will be 4.)*/

package Day1;

import java.util.Scanner;

public class DivisionTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int numberPassed = scanner.nextInt();

        DivisionTest dt = new DivisionTest();
        int output = dt.print(numberPassed);
        System.out.println("output is " + output);

    }


    int print(int num) {
        int counter = 0;
        for (int i=1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        return counter;
    }
}


/*
public class DivisionCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number!");
        int number = scanner.nextInt();
        int counter = 0;

        for (int i = 1; i <= number; i++) {
            // Check if the number is exactly divided by i
            if (number % i == 0) {
                counter++;
            }
        }

        System.out.printf("Division counter: " + counter);
    }
}

 */
