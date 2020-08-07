package replits;

import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {
        /*
            String result = "";

        for(int i =0; i<=word.length()-1; i++){
           String s  = ""+ word.charAt(i);
           if(!result.contains(s)){
               result+=s;
           }
        }
        System.out.println(result);
         */

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        String result = "";
        for(int i=0;i<=word.length()-1;i++){
            result  = ""+word.charAt(i);

            System.out.println(result);
            }






        }





    }
