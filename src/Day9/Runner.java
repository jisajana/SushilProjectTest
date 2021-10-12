package Day9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] intArray = {1, 2, 5, 7, 11, 13, 17};
        ArrayList<Integer> arrayList = arrayUtil.convert(intArray);
        System.out.println("Convert the integer array to array list :" + arrayList);


        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(2);
        arrayList1.add(4);
        arrayList1.add(6);
        arrayList1.add(8);
        arrayList1.add(10);

        int[] array = arrayUtil.convert(arrayList1);
        System.out.print("Convert the integer array list to array: [");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
}
