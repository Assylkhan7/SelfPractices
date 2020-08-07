package replits;

import java.util.Scanner;

public class replit48 {
    public static void main(String[] args) {

        /*

        float price = 10.0f;
        float price1 = 2.0f;

        if(in.equalsIgnoreCase("burger")||in.equalsIgnoreCase("chicken")) {
            System.out.println(price);
        }else {
            System.out.println(price1);
        }
         */

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String name = inp.nextLine();
        String result ="";

        result = (name.equals("Chen"))? "teacher":"student";
        System.out.println(result);
    }
}
