package replits;

import java.util.Arrays;
import java.util.Scanner;

public class replit140 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String [] s = new String[words.length];
        for(int i=0; i<=words.length-1; i++){
            s[i] = (words[i].charAt(0)+ ""+words[i].charAt(words[i].length()-1));
        }
        System.out.println(Arrays.toString(s));
    }


}
