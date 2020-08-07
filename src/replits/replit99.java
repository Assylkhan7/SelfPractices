package replits;

import java.util.Scanner;

public class replit99 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        if(n>0&&n<str.length()){
            int count=0;
            for(int i=0; i<=str.length()-n; i++){
                if(str.substring(i,i+n).equals(str.substring(0,n))){
                    count++;
                }
            }
            boolean result = n<=count;
            System.out.println(result);
        }else {
            System.out.println("false");
        }



    }
}
