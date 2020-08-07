package replits;

import java.util.Scanner;

public class replit76 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if(email.contains("_")) {

            String first = email.substring(0, email.indexOf("_"));
            String last = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            String rest = email.substring(email.indexOf("@") + 1, email.length());
            System.out.println(last + "_" + first + "@" + rest);
        }else {
            System.out.println(email);
        }














    }
}
