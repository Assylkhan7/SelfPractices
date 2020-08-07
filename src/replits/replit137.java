package replits;

import java.util.Arrays;
import java.util.Scanner;

public class replit137 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


        String[] s =sentence.split(" ");

        for (int i = s.length-1; i>=0;i--){
            String arr = s[i];
            System.out.println(arr);
        }



    }
}
