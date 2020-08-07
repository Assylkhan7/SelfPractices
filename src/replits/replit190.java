package replits;

import java.lang.reflect.Array;

public class replit190 {




    public static int[] mergR(int[] a,int[] b) {

        int [] arr = new int[a.length+b.length];
        int index =0;
        for(int each: a){
            arr[index]=each;
            index++;
        }

        for(int each: b){
            arr[index]=each;
            index++;
        }
        return arr;
    }//end mergR
}
