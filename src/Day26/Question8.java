package Day26;

public class Question8 {
    public static void main(String[] args) {
        int [] array = {17,4,9,8,10};

        int occurenceOfEven = 0;
        int occurenceOfOdd = 0;

        for (int i = 0; i< array.length; i++) {
            int j = array[i];
            if (j % 2 == 0) {
                System.out.println(j + " is even number");
                occurenceOfEven ++;
            } else {
                System.out.println(j + " is odd number");
                occurenceOfOdd ++;
            }
        }

        System.out.println("Number of even integers in given array : " +occurenceOfEven );
        System.out.println("Number of odd integers in given array : " +occurenceOfOdd );


    }
}
