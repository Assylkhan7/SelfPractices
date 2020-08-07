package replits;

import java.lang.reflect.Array;
import java.util.Arrays;

public class replit_Assesment_3_3 {
    public static void main(String[] args) {

    }










    /**
     * Reverses the order of the elements in the specified array
     * @param arr
     * @return array of strings
     */
    public static String[] reverse(String[] arr) {
        //write your codes here
        int index =0;
        String [] arr1 = new String [arr.length];
        for(int i = arr.length-1; i>=0; i--){
           arr1[index] = arr[i];
           index++;
        }
        return arr1;
    }
}
