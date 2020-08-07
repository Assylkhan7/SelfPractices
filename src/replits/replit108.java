package replits;

import java.util.Scanner;

public class replit108 {
    public static void main(String[] args) {

        /*
           for (int j = 1; j <= 7; j++){
        for (int a =1; a <=j; a++){
            System.out.print("*");
        } System.out.println();
}
        for (int j = 7; j >= 1; j--){
            for (int a =j; a >=1; a--){
                System.out.print("*");
            } System.out.println();
        }

           for (int j = 1; j <= 7; j++){
        for (int a =1; a <=j; a++){
            System.out.print("*");
        } System.out.println();
         */

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (j=1; j<=n;j++){
            for (i=1; i<=j; i++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
