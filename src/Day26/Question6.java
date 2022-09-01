package Day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question6 {
    public static void main(String[] args) {
        int [] array = {10,4,6,2,8};

        ArrayList< Integer> arrayList =  new ArrayList<Integer>();

        //List al = Arrays.asList(array);

        for (int i = 0; i< array.length; i++){
            int j = array[i];
            arrayList.add(j);
        }

        System.out.println("Array List from array: " + arrayList);

    }
}
