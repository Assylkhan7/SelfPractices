package replits;

import java.util.Scanner;

public class replit_Blackjack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int house = s.nextInt();
        int player = s.nextInt();
        String result = "";

        if(player>=21){result="bust";}
        else if(house>player) {result="player loss";}
        else if(player==house){result="its a tie";}
        else {result="player wins";}
        System.out.println(result);




    }
}
