package replits;

import java.util.Scanner;

public class replit120 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();
        }

        int longest = words[0].length();
        for(int i =0; i<=words.length-1;i++){
            int l = words[i].length();
            if(l>=longest){
                longest=l;
            }
        }

        for (int i=0; i<=words.length-1;i++){
            if(words[i].length()>=longest){
                System.out.println(words[i]);
            }
        }








    }
}
