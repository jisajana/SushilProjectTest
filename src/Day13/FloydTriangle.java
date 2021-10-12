package Day13;

import java.util.Scanner;

public class FloydTriangle {

    public void floydTriangleForm(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1;j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FloydTriangle floydTriangle = new FloydTriangle();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines you want in the Floyd's Triangle: ");
        int userInput = scanner.nextInt();
        floydTriangle.floydTriangleForm(userInput);
    }
}
