/*Find the lowest and highest number among five numbers.
(The numbers can be either static (E.g. 9, 11, 131, 6, 44) or you can take user input)*/
/*
Find the lowest and highest number among five numbers.
(The numbers can be either static (E.g. 9, 11, 131, 6, 44) or you can take user input)
 */

package Day1;

import java.util.Arrays;

public class MinMaxTest {
    public static <HighLow> void main(String[] args) {

        int[] nums = {12,4,5,6,10};
        Arrays.sort(nums);
        System.out.println("Minimum = " + nums[0]);
        System.out.println("Maximum = " + nums[nums.length - 1]);
    }
}

/*
public class LowestHighestFinder {

    public static void main(String[] args) {

            //Method overloading concept is used in this solution

LowestHighestFinder lowestHighestFinder = new LowestHighestFinder();
// Calling calculate method with 5 parameters
        lowestHighestFinder.calculate(10, 3, 100, 2, 4);

                // Calling calculate method with 3 parameters
                lowestHighestFinder.calculate(6, 3333, 1020);

                int[] numbers = {1, 2, 4};
                // Calling calculate method with array as parameter
                lowestHighestFinder.calculate(numbers);
                }

public void calculate(int a, int b, int c, int d, int e) {
        // This approach is long and is not useful for high amount of numbers
        int lowest = a;
        int highest = a;

        if (b < lowest) {
        lowest = b;
        }

        if (b > highest) {
        highest = b;
        }


        if (c < lowest) {
        lowest = c;
        }

        if (c > highest) {
        highest = c;
        }
        if (d < lowest) {
        lowest = d;
        }

        if (d > highest) {
        highest = d;
        }

        if (e < lowest) {
        lowest = e;
        }

        if (e > highest) {
        highest = e;
        }

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        }

public void calculate(int... numbers) {
        // https://stackoverflow.com/questions/3158730/what-do-3-dots-next-to-a-parameter-type-mean-in-java
        int lowest = numbers[0];
        int highest = numbers[0];
        for (int number : numbers) {
        if (number < lowest) {
        lowest = number;
        }

        if (number > highest) {
        highest = number;
        }
        }

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        }
        }

 */