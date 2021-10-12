package Day11;

import static java.util.Arrays.sort;

public class CheckEquality {
    public static void main(String[] args) {
        CheckEquality checkEquality = new CheckEquality();

        if (checkEquality.equalityCheck(new int[]{2, 4, 6, 8, 10}, new int[]{2, 4, 6, 8, 10})) {
            System.out.println("the two given arrays are equal");
        } else {
            System.out.println("the two given arrays are not equal");
        }

    }

    public boolean equalityCheck(int[] firstArray, int[] secondArray) {
        sort(firstArray);
        sort(secondArray);

        if (firstArray.length != secondArray.length) {
            return false;
        }
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        return true;
    }
}


