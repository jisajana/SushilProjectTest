package Day14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateValueRemoval {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 4;
        int number3 = 6;
        int number4 = 2;
        int number5 = 4;

        ArrayList arrayList = new ArrayList();
        arrayList.add(number1);
        arrayList.add(number2);
        arrayList.add(number3);
        arrayList.add(number4);
        arrayList.add(number5);

        System.out.println("The array list with duplicate values: " + arrayList);

        Set set = new HashSet(arrayList);
        System.out.println("The array list without duplicate values: " + set );


    }
}
