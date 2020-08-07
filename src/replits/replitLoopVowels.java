package replits;

import java.util.Scanner;

public class replitLoopVowels {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        String result  ="";
        String s;

        for (int i =0; i <=word.length()-1; i++){
            s= ""+word.charAt(i);
            if(s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u")){
              result+=s;
            }
        }
        System.out.println(result);
















    }
}
