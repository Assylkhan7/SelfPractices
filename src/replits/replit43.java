package replits;

import java.util.Scanner;

public class replit43 {
    public static void main(String[] args) {

/*
Automated tests are the future.

in the given program you have a quiz question and a scanner
 to catch user input which will be stored on string a.

after the user inputs an answer (a, b or c) we need to check
if its the correct, wrong, valid answer.
 */

        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();
        String result = "";
        if(a.equalsIgnoreCase("a")){result=a+ " is wrong";}
        else if (a.equalsIgnoreCase("b")){result=a+" is correct";}
        else if (a.equalsIgnoreCase("c")){result=a+ " is wrong";}
        else {result= a+" is not a valid answer";}
        System.out.println(result);







    }
}
