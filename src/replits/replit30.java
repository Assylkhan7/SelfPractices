package replits;

import java.util.Scanner;

public class replit30 {
    public static void main(String[] args) {


        /*In this assignment you will write a program to create a shopping list, count and prices.
        Please read carefully! If you do not fully understand the requirement ask your classmates in Slack or ask your instructor!
    You will use Scanner object and ask user to enter 3 items followed by its count, price and you will calculate total price and show as a report.
    -Declare 4 String variables item1, item2, item3, report.
    -Declare double variables price1, price2, price3, totalPrice
    -Declare int variables count1, count2, count3
    -Create a Scanner object named scan.

                Execution flow using with example:
        Use scanner to read all 3 values.
                -Display prompt "Enter Item1, count and its price:"
        Tomatoes
        2
        5.4
        Explanation: (Item1 is "Tomatoes", count is 2, price is 5.4)

        -Display prompt "Enter Item2, count and its price:"
        Cheese
        0
        3.5
        Explanation: (Item2 is "Cheese", count is 0, price is 3.5)

        -Display prompt "Enter Item3, count and its price:"
        Apples
        5
        6.3
        Explanation: (Item3 is "Apples", count is 5, price is 6.3)

        -calculate totalPrice for all items only if the item's count is more than 0!
                - Hint :
        The unit test assumes that item1 count is always more than 0
        The only situations you need to handle are either item2 count is 0 or item3 count is 0.
        Think simple and just handle the only item2 is 0 or  only item3 is 0 branches

                -build the report variable by concatenating Strings and double price values:
        -do not include items that have count 0, use if statement !
                -Calculate total price for the item and concatenate like below

        "Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
        Explanation: (Item2 "Cheese" is not included since its count is 0)

        - Print the value of report variable

                - Print total Price:
        "Total price: 42.3"*/  Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();

        double total1 = count1*price1;
        double total2 = count2*price2;
        double total3 =count3*price3;

        if (count2>0&&count3>0){
            System.out.println("Item1: "+item1+" Price: "+total1+", "+"Item2: "+item2+" Price: "+total2+", "+"Item3: "+item3+" Price: "+total3);
        }else if(count2==0&&count1>0){
            System.out.println("Item1: "+item1+" Price: "+total1+", "+"Item3: "+item3+" Price: "+total3);
        }else {
            System.out.println("Item1: "+item1+" Price: "+total1+", "+"Item2: "+item2+" Price: "+total2);}
        double totalPrice= total1+total2+total3;
        System.out.println("Total price: " +totalPrice);

    }
}
