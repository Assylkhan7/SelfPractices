package replits;

import java.util.Arrays;
import java.util.Scanner;

public class replit153 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);


    }


    public static void person(String info) {

        String [] n = info.split(",");
        System.out.println("person name: "+n[0]+" last name: "+n[1]+ " age: "+n[2]);


    }
}
