package Day26;

import java.sql.Array;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        int [] array = {2,4,6,8,10};

        int sum = 0;
        int j;

        for (int i = 0; i< array.length; i++){
            j = array[i];
            sum = sum+j;
        }

        System.out.println("Sum of Array : " + sum);

    }


}
