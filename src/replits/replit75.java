package replits;

import java.util.Scanner;

public class replit75 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        boolean readOrNot = a.contains("project") && a.contains("alejandro");
        String result = "";
        if(readOrNot){result="read this mail";}
        else {result="dont read";}
        System.out.println(result);








    }
}
