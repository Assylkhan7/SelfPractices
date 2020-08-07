package replits;

import java.util.Scanner;

public class replit93 {
    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.toLowerCase().indexOf("java")==0||word.toLowerCase().indexOf("java")==1){
            System.out.println(!exists);
        }else System.out.println(exists);


    }
}
