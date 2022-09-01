package Day26;

import java.util.ArrayList;

public class Question10 {
    public static void main(String[] args) {
        int [] array = {3, 2, 4 , 3 };

        int maxNoOfOccurence = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i]==array[j])
                    count++;
            }
            if (count >= maxNoOfOccurence)
                maxNoOfOccurence = count;
        }

        System.out.println(maxNoOfOccurence);
    }
}



