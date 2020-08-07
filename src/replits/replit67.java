package replits;

import java.util.Scanner;

public class replit67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int word2 = word.length();
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length()-1);


        if(word2==5){
            System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
        }else if (word2<5) {
            System.out.println("Too short!");
        }else {
            System.out.println("Too long!");}

//String replace1 = word.replace(""+lastChar,""+firstChar);
        //String replace1 = word.replace(word.charAt(word.length()-1)),word.charAt(0);



    }
}
