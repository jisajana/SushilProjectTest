package Day12;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.fibonacciSeriesGenerate();
        System.out.println("Testing");
        System.out.println("second template testing");
        System.out.println("k hundai xa");

    }

    public void fibonacciSeriesGenerate() {
        int number1 = 0;
        int number2 = 1;
        int number3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter nth element: ");
        int n = scanner.nextInt();

        System.out.println(number1);

        for (int i = 1; i < n; i++) {
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
            System.out.println(number1);
        }
    }
}
