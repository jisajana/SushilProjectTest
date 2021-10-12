/*
A school has following rules for grading system:
•Below 25 – F
•25 to 45 –E
•45 to 50 –D
•50 to 60 –C
•60 to 80 –B
•Above 80 -A
Ask user to enter marks and print the corresponding grade
 */
package Day2;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks scored in subject: ");
        int markScored = scanner.nextInt();

        if (markScored < 25) {
            System.out.println("The grade of student is : F");
        } else if (markScored >= 25 & markScored < 45) {
            System.out.println("The grade of student is : E");
        }
        if (markScored >= 45 & markScored < 50) {
            System.out.println("The grade of student is : D");
        }
        if (markScored >= 50 & markScored < 60) {
            System.out.println("The grade of student is : C");
        }
        if (markScored >= 60 & markScored < 80) {
            System.out.println("The grade of student is : B");
        }
        if (markScored >= 80) {
            System.out.println("The grade of student is : A");
        }
    }
}
