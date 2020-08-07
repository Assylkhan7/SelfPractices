package replits;

import com.apple.eawt.event.GestureListener;

import java.util.Scanner;

public class replit53 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter vehicle's year:");
        int vehicleYear = scan.nextInt();
    String result = "";

  if(vehicleYear>=1995&&vehicleYear<=1998){result="Your vehicle needs to be recalled!";}
    else if (vehicleYear>=2001&&vehicleYear<=2002) {result="Your vehicle needs to be recalled!";}
    else if (vehicleYear>=2004&&vehicleYear<=2006){result="Your vehicle needs to be recalled!";}
    else if (vehicleYear>=2015&&vehicleYear<=2017){result="Your vehicle needs to be recalled!";}
    else {result= "Your vehicle is fine, enjoy!";}
        System.out.println(result);




    }
}
