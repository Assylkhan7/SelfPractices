package replits;

import java.util.Scanner;

public class Replit_64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int word1 = word.length();

        if (word1%2!=0&&word1>=3) {
                System.out.println(word.charAt(word.length()/2));
        }else if (word1==1) {
                System.out.println(word+word+word);
        }else if(word1%2==0&&word1>=4){
                System.out.println(""+word.charAt(word.length()/2-1)+word.charAt(word.length()/2));
        }else {
            System.out.println(word+word);
        }
        }

    }

