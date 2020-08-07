package replits;

import java.util.Scanner;

public class replit87 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;

        for (int i=inhabitants; i>0;i--){
            System.out.println("Day "+ day+" ["+inhabitants+"]");
            day++;
            inhabitants=inhabitants/2;
            if(inhabitants==0){break;
            }
        }
        /*
                while(inhabitants>0){

            System.out.println("Day "+day +" ["+inhabitants+"]");
            day++;
            inhabitants=inhabitants/2;
        }
        System.out.println("---- EXTINCT ----");
         */










    }
}
