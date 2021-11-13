package Day26;

import java.util.ArrayList;
import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        int [] array;

        ArrayList<Integer> arrayList =  new ArrayList<Integer>();
        arrayList.add (2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(10);

        System.out.println(arrayList.toArray());

        Object[] objects = arrayList.toArray();

        System.out.println("Array from Array List " + objects);

       /* for (int i = 0; i< arrayList.size(); i++){
          int j = arrayList.get(i);
            Arrays.asList(j);
        }*/

    }
}
