package Day26;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        ArrayList< Integer> arrayList =  new ArrayList<Integer>();

        arrayList.add (2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(10);

        int sum = 0;
        int j;

        for (int i = 0; i< arrayList.size(); i++){
            j = arrayList.get(i);
            sum = sum+j;
        }

        System.out.println("Sum of Array List: " + sum);


    }
}
