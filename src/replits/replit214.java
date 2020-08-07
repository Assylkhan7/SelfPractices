package replits;

import java.util.ArrayList;

public class replit214 {
    public static String search(ArrayList<String> r, String find)
    {
        for(String word: r){
            if(word.contains(find)){
                return  word;
            }
        }
return "search failed";

    }//end wineSeller

    public static void main(String[] args)
    {

        ArrayList<String>  arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        String find_tst = search(arr,"foo");
        System.out.print(find_tst);//foo bar


    }//end main



}
