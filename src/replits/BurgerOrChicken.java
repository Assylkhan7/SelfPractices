package replits;

import java.util.Scanner;

public class BurgerOrChicken {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String in = s.next();

        float a = 10.0f;
        float f = 2.0f;
        boolean b = in.equals("burger")||in.equals("chicken");
        boolean c = in.equals("soda");
        if(b){
            System.out.println(a);
        }if(c) {
            System.out.println(f);
        }














    }
}
