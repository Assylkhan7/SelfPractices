package replits;

import java.util.Scanner;

public class replit101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String a = "java";
        String b = "python";
        int count  = 0;
        int count1 = 0;
        for(int i=0; i<=sentence.length()-b.length();i++){
        if(sentence.substring(i,i+a.length()).equals(a)){
            count++;
        }if(sentence.substring(i,i+b.length()).equals(b)){
            count1++;
        }
        }
        System.out.println(count==count1);

    }
}
