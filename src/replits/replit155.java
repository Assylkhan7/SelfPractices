package replits;

import java.util.Scanner;

public class replit155 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        System.out.println(next3(num));

    }

    public static String next3(int num){
        int result = num+1;
        int r2= num+2;
        int r3 = num+3;
      return result+ " "+r2 +" "+ r3;
    }
}
