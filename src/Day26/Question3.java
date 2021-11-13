package Day26;

import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {
        int [] array = {2,4,6,8,10};

        int sum = 0;
        int ave;
        int j;

        for (int i = 0; i< array.length; i++){
            j = array[i];
            sum = (sum+j);
        }
         ave = sum/array.length;

        System.out.println("Average of Array List: " + ave);


    }
}
