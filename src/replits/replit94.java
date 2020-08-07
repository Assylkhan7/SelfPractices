package replits;

import java.util.Scanner;

public class replit94 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalProce = 0;
        String a = "Add one more item?";
        String b = "";

        do {
            System.out.println("Enter Item"+ count+" and its price:");
            item = scan.next();
            price = scan.nextDouble();
            totalProce+=price;
            System.out.println(a);
            countinue =scan.next();
            shoppingListReport+="Item"+count+": "+item+" Price: "+price+", ";
            count++;
        }while (countinue.contains("yes"));

        System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
        System.out.println("Total price: "+totalProce);
/*
 item = scan.next();
        price = scan.nextDouble();
        System.out.println(a);
        countinue =scan.next();
 */










    }
}
