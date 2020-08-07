package replits;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

public class replit79 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        boolean a = word.startsWith("x")||word.startsWith("X");
        boolean b = word.endsWith("x")||word.endsWith("X");
        boolean c = a&&b;

        if(c){
            System.out.println(word.substring(1,word.length()-1));
        }else if (b){
            System.out.println(word.substring(0,word.length()-1));
        }else if (a) {
            System.out.println(word.substring(1));
        }else {
            System.out.println(word);
        }











    }
}
