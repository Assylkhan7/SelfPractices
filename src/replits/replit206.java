package replits;

import java.util.ArrayList;

public class replit206 {
    public static void main(String[] args) {
   }





    public static void repeatAL(ArrayList<Boolean> list){
        ArrayList<Boolean> repeatedList = (ArrayList<Boolean>) list.clone();
        list.addAll(repeatedList);
        System.out.println(list);
    }
}