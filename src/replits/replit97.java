package replits;

import java.util.Arrays;
import java.util.Scanner;

public class replit97 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word = scan.next().toLowerCase();

        int count =0;

        for (int i=0; i<word.length();i++){
        if(word.contains("java")){

            count++;
            word= word.replaceFirst("java", "");
        }
            } System.out.println(count);

        /*
            for (int j =0; j<=word.length-1;j++){
            String a  = word[j];
            int count = 0;
            for (int i =0;i<=word.length-1;i++){
                String each = word[i];
                if(a.equals(each)){
                    count+=1;
        }
            } if(count==1){
                System.out.println(a);
         */



    }
}
