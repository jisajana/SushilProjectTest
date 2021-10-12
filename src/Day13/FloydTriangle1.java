package Day13;

import java.util.Scanner;

public class FloydTriangle1 {
    int counter =1;
    public void floydTriangleForm(int n){
        for (int i = 1; i <=n; i++){
            for (int j = 1;j <=i; j++){
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FloydTriangle1 floydTriangle1 = new FloydTriangle1();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines you want in the Floyd's Triangle: ");
        int userInput = scanner.nextInt();
        floydTriangle1.floydTriangleForm(userInput);
    }
}
