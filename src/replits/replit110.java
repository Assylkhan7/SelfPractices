package replits;

import java.util.Arrays;
import java.util.Scanner;

public class replit110 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print firt and last char of each items in one line

        //TODO: Write your code below


        for (String each: words){
        char first = each.charAt(0);
        char last = each.charAt(each.length()-1);
            System.out.println(""+first+last);
        }

/*
  for (String b: word){
            String s = b;
            int count =0;
            for (String each: word){
                if(s.equals(each)){
                    count++;
        }
           }if(count==1){
                System.out.println(s);
       }
        }
 */

    }
}
