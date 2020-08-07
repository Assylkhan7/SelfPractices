package Warmup_Tasks;

import java.util.Scanner;

public class Initials_String {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String word2 = scan.next();
        String w1 = word.substring(0,1);
        String w2 = word2.substring(0,1);

        String initials = w1.concat("."+w2);

        System.out.println(initials.toUpperCase());














    }
}
