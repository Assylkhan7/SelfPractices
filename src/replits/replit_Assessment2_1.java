package replits;
import java.util.*;
public class replit_Assessment2_1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     *target - string that you need to check.
     * sentence - string where you need to lookup for target.
     *
     */
    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:
        int count =0;
        for(int i=0; i<=sentence.length()-target.length(); i++){
            String s = sentence.substring(i, i+target.length());
            if(s.equals(target)){
                count++;
            }
        }
        if(count==2){
           return true;
        }else {
            return false;
        }

    }


}
