package replits;

import java.util.Scanner;

public class replit100 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = "";
        String word = "bread";
        int count =0;

        for(int i=0; i<=str.length()-word.length(); i++){
        if(str.substring(i,i+word.length()).equalsIgnoreCase(word)){
        count++;        }
        }
        if(count>=2){
            System.out.println(str.substring(str.indexOf("bread")+5, str.lastIndexOf("bread")));
        }else {
            System.out.println("nothing");
        }
    }

}
