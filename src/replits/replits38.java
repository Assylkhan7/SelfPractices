package replits;

import java.util.Scanner;

public class replits38 {
    public static void main(String[] args) {
        /*
in this assignment you are given two string variables word1 and word2.
you need to check if they are equal using an if.

Comparison should be case sensitive. "java" and "JaVa" are not equal.

if they are equal output  "word1 equals word2"
else output "word1 does not equal word2"
         */
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();
        String result = "";
        if(word1.equals(word2)){result="word1 equals word2";}
        else {result="word1 does not equal word2";}
        System.out.println(result);





    }
}
