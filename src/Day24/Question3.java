package Day24;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter first number: ");
        int userInput1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int userInput2 = scanner.nextInt();

        System.out.println("Enter third number: ");
        int userInput3 = scanner.nextInt();

        System.out.println("Enter fourth number: ");
        int userInput4 = scanner.nextInt();

        System.out.println("Enter fifth number: ");
        int userInput5 = scanner.nextInt();

        MinMax minMax =new MinMax(userInput1, userInput2,userInput3, userInput4,userInput5);
        minMax.max();
        minMax.min();

    }
}

class MinMax {
    int firstInput;
    int secondInput;
    int thirdInput;
    int fourthInput;
    int fifthInput;


    public MinMax(int firstInput, int secondInput, int thirdInput, int fourthInput, int fifthInput) {
        this.firstInput = firstInput;
        this.secondInput = secondInput;
        this.thirdInput = thirdInput;
        this.fourthInput = fourthInput;
        this.fifthInput = fifthInput;
    }

    public void max() {
        int maxNumber = this.firstInput;
        if (this.firstInput < this.secondInput) {
            maxNumber = this.secondInput;
        }

        if (this.firstInput < this.thirdInput) {
            maxNumber = this.thirdInput;
        }

        if (this.firstInput < this.fourthInput) {
            maxNumber = this.fourthInput;
        }
        if (this.firstInput < this.fifthInput) {
            maxNumber = this.fifthInput;
        }

        System.out.println("Highest value: " + maxNumber);
    }

    public void min(){
        int minNumber = this.firstInput;
        if (this.firstInput > this.secondInput) {
            minNumber = this.secondInput;
        }

        if (this.firstInput > this.thirdInput) {
            minNumber = this.thirdInput;
        }

        if (this.firstInput > this.fourthInput) {
            minNumber = this.fourthInput;
        }
        if (this.firstInput > this.fifthInput) {
            minNumber = this.fifthInput;
        }

        System.out.println("Lowest value: " + minNumber);
    }



}
