package Day24;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter first number: ");
        int userInput1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int userInput2 = scanner.nextInt();

        AddMultiply addMultiply = new AddMultiply(userInput1, userInput2);

        addMultiply.sumation();
        addMultiply.multiplication();

    }
}

class AddMultiply{
    int input1;
    int input2;

    public AddMultiply(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public void sumation(){
        int sum = input1 + input2;
        System.out.println("Sum of " +input1  + " and "+ input2 + " = " + sum);
    }

    public void multiplication (){
        int product = input1 * input2;
        System.out.println("Product of " + input1  + " and "+ input2 + " = " + product);
    }
}
