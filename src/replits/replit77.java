package replits;

import java.util.Scanner;

public class replit77 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String name = email.substring(0,email.indexOf("_"));
        String last = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        String topLevelDomain = email.substring(email.indexOf(".")+1,email.length());

        String firstChar = (name.substring(0,1).toUpperCase());
        String lastChar = (last.substring(0,1).toUpperCase());

        System.out.println("First name: "+firstChar+name.substring(1,name.length()));
        System.out.println("Last name: "+lastChar+last.substring(1,last.length()));
        System.out.println("Domain: "+ domain);
        System.out.println("Top-Level Domain: "+topLevelDomain);





    }
}
