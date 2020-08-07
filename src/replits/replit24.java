package replits;

import java.util.Scanner;

public class replit24
{
    public static void main(String[] args) {
        //Enter your code here
        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();
        // continue for city
        System.out.println("Enter your city");
        String city = scan.next();
        System.out.println("Enter your state");
        String state = scan.next();
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        System.out.println("Enter your work phone number");
        long phoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long phoneNumberPersonal = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married?");
        boolean marriedNot = scan.nextBoolean();

        String contacts = "Contacts: work phone number - " + phoneNumber+","+" personal " +
                "phone number - "+phoneNumberPersonal+","+" email:"+email;
        String fullName = "Full name: "+lastName+", "+firstName;
        String address = "Address: " + street+", "+city+", "+state+" "+zipCode;
        System.out.println("Patient personal information");
        System.out.println(fullName);
        System.out.println(address);
        System.out.println(contacts);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight+" pounds");
        System.out.println("Married?: "+marriedNot);





    }
}