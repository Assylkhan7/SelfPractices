package replits;

import java.util.Scanner;

public class replit56 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);
        boolean a = response=='y'||response=='n'||response=='h';
        String result = "";

        if(a){
        switch (response){
            case 'y':
                result = "Your request is being processed";
                break;
            case 'n':
                result = "Thank you anyway for your consideration";
                break;
            case 'h':
                result = "Sorry, no help is currently available";

        }}else { result = "Invalid entry, please try again!";}
        System.out.println(result);








    }
}
