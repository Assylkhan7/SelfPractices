package replits;

import java.util.Scanner;

public class replit73 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int number = word.length();
        if(number>5&&number%2!=0){
            System.out.println(""+word.charAt(word.length()/2-1)+word.charAt(word.length()/2)+word.charAt(word.length()/2+1));
         }else {
            System.out.println("invalid");
       }




    }
}
