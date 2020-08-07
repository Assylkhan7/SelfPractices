package Warmup_Tasks;

import java.util.Scanner;

public class quiz {
    public static void main(String arr[]) {
        
        String str = "";
        str.trim();
        boolean a = str.isEmpty();
        System.out.println(a);


        String ta = "A";
        ta=ta.concat("B");
        String tb = "C";
        ta.replace('C','D');
        ta=ta+tb;
        System.out.println(ta);

        String str1 = "Hello World";
        str.trim();
        int z = str1.indexOf("");
        System.out.println(z);
    }
}
