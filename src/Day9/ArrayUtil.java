package Day9;


/*Create a ArrayUtil class with the following methods:

        • ArrayList<Integer>  convert(int[] values)
        o Convert the integer array to array list and then return it

        • int[] convert(ArrayList<Integer> values)
        o Convert the integer array list to array and then return it*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayUtil {

    public ArrayList<Integer> convert(int[] values) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < values.length; i++) {
            arrayList.add(values[i]);
        }
        return arrayList;
    }

    /*public static Array ArrayListToArray(ArrayList<int>){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i=0; i < array.length; i++ ){
            arrayList.add(array[i]);
        }
        return arrayList;
    }-*/

    public int[] convert(ArrayList<Integer> values) {
        int[] array = new int[values.size()];

        for (int i = 0; i < values.size(); i++) {
            array[i] = values.get(i);
        }
        return array;
    }

}




