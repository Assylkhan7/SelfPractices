package replits;

import java.util.Scanner;

public class replit35 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        String item1 = "Charger";
        String item2 = "USB cable";
        String item3 = "Headphones";
        String item4 = "Pants";
        String item5 = "Hat";
        String item6 = "Socks";
        String item7 = "Blanket";
        String item8 = "Pillow";
        String item9 = "Smartphone";
        String item10 = "Laptop";

        if(item.equalsIgnoreCase(item1)){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 85$");}
        else if (item.equalsIgnoreCase(item2)){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 90$");}
        else if (item.equalsIgnoreCase(item3)){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 70$");}
        else if (item.equalsIgnoreCase(item4)){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 50$");}
        else if (item.equalsIgnoreCase(item5)){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 75$");}
        else if (item.equalsIgnoreCase(item6)){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 95$");}
        else if (item.equalsIgnoreCase(item7)){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 40$");}
        else if (item.equalsIgnoreCase(item8)){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 60$");}
        else if (item.equalsIgnoreCase(item9)){
            System.out.println("Sorry, not enough funds on your gift card!");}
        else if (item.equalsIgnoreCase(item10)){
            System.out.println("Sorry, not enough funds on your gift card!");}
        else {
            System.out.println("Invalid item!");}



    }
}
