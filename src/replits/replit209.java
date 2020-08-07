package replits;

import javax.print.DocFlavor;

public class replit209 {





    public static String extractNum(String s) {

        String num = "";

        for(int i=0; i<=s.length()-1; i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num+=""+ch;
            }

        }
        return num;
    }


}
