package Day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question5 {
    public static void main(String[] args) {
        int [] array = {10,4,6,2,8};

        ArrayList< Integer> arrayList =  new ArrayList<Integer>();

        arrayList.add (1);
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(7);


        Collections.sort(arrayList);
        System.out.println("Maximum number in Array List: " + arrayList.get(arrayList.size()-1));
        System.out.println("Minimum number in Array List: " + arrayList.get(0));

        Arrays.sort(array);
        System.out.println("Maximum number in Array: " + array [array.length-1]);
        System.out.println("Minimum number in Array: " + array[0]);

    }
}
