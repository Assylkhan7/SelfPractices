package Warmup_Tasks;

import replits.Scanner1;

import java.util.Scanner;

public class Strings1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word:");
        String word1 = scan.next();
        System.out.println("Enter second word:");
        String word2 = scan.next();

        char lastChar1 = word1.charAt(word1.length()-1);
        char firstChar = word2.charAt(0);
        if(lastChar1==firstChar) {
            System.out.println(word1+word2.substring(1));

        }else {
            System.out.println(word1+word2);}


    }
}
