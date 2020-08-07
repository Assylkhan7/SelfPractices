package replits;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class replit193 {
    public static void main(String[] args) {

    }





    public static String combineRs(String[] r1,String[] r2)
    {
        ArrayList <String> list = new ArrayList<>();

        for (String each: r1){
            list.add(each);
        }
        for(String each: r2){
            list.add(each);
        }
            String result ="";
        for(int i=0; i<list.size();i++){
            result+=list.get(i);
        }
        return result;
    }
}
