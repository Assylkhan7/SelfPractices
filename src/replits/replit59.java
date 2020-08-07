package replits;

import java.util.Scanner;

public class replit59 {
    public static void main(String[] args) {
/*
Assume that you have only 2 users: Max Payne and Alan Wake.
 First, ask user to enter full name. Display message:
 "Enter full name:". Then take input from user. If name is equals
  to either "Max Payne" or "Alan Wake",  display message:
  "User found!". Otherwise,  display message: "User not found!".
   Please make your search case insensitive!
 */
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter full name:");
        String name1 = scan.nextLine();
        boolean name = name1.equalsIgnoreCase("Max Payne")||name1.equalsIgnoreCase("Alan Wake");
        String result = "";
        result = (name)? "User found!":"User not found!";
        System.out.println(result);






    }
}
