package replits;

import java.util.Scanner;

public class replit66 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        int word1Q  = word1.length()-1;
        int word2Q = word2.length()-1;
        String result = "";
        if(word1Q==word2Q) {
            System.out.println(""+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2));
        }else {
            System.out.println("cannot merge");
        }






    }
}
