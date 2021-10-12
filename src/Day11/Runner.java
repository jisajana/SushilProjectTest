package Day11;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
         CheckEquality checkEquality = new CheckEquality();

        if (checkEquality.equalityCheck(new int[]{2, 4, 6, 8, 10}, new int[]{2, 4, 6, 8, 10})) {
            System.out.println("the two given arrays are equal");
        } else {
            System.out.println("the two given arrays are not equal");
        }
    }
}
