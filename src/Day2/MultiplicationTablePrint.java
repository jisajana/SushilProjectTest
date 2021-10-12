/*Day
Print multiplication table of 9, 25 and 50 using any of the loop.
*/
/*
Print multiplication table of 9, 25 and 50 using any of the loop
 */
package Day2;

import java.util.Scanner;

public class MultiplicationTablePrint {
    public static void main(String[] args) {
        MultiplicationTablePrint multiplicationTable = new MultiplicationTablePrint();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int numberPassed = scanner.nextInt();

        multiplicationTable.multiply(numberPassed);

    }

    void multiply(int num) {


            if (num == 9 || num == 25 || num == 50) {
                System.out.println("Multiplication Table of " + num);

                for (int i = 1; i <= 10; i++) {
                    int output = num * i;
                    System.out.println(num + "x" + i + "=" + output);
                }

            } else {
                System.out.println("Enter number 9 or 25 or 50 :");
                //System.out.println("Enter the number: ");
            }
        }

}


