package replits;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class replit157 {
    public static void main(String[] args) {

      //  Scanner scan = new Scanner(System.in);
        //timeConversion(scan.nextLine());


    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        DateTimeFormatter forTime = DateTimeFormatter.ofPattern("hh:mm:ss");
        String f  = "";
        f+=forTime;
        System.out.println(s.format(f));

    }

}
