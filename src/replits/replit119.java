package replits;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class replit119 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        if (email.contains("@") && email.indexOf("@")==email.lastIndexOf("@")){
            String[] email2=email.split("@");
            //Write your code below
            System.out.println("Email id: "+email2[0]);
            System.out.println("Email domain: "+email2[1]);
        }else{
            System.out.println("invalid email");
        }












    }
}
