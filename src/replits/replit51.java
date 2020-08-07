package replits;

import java.util.Scanner;

public class replit51 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String split =scan.next();
        System.out.println("Number of people:");
        int numberOfPeople = scan.nextInt();
        System.out.println("Check amount:");
        float checkAmount = scan.nextFloat();
        System.out.println("Service Quality:");
        String serviceQuality = scan.next();
        float totalToPay; float totalPerPerson;
        float tipPerPerson; float totalTip;

        String people = "";
        for(int i = 1; i<=numberOfPeople;i++){
            people+= "&";
        }
        System.out.println("Number of people entered:"+people);
        if(split.contains("yes")){
            if(serviceQuality.contains("Excellent")){
                totalTip=checkAmount*0.25f;
                totalToPay = totalTip+checkAmount;
                totalPerPerson = totalToPay/numberOfPeople;
                tipPerPerson = totalTip/numberOfPeople;
                System.out.println("Total to pay: "+ totalToPay);
                System.out.println("Total tip: "+totalTip);
                System.out.println("Total per person: "+totalPerPerson);
                System.out.println("Tip per person: "+tipPerPerson);
            }else if (serviceQuality.contains("Great")) {
                totalTip=checkAmount*0.2f;
                totalToPay = totalTip+checkAmount;
                totalPerPerson = totalToPay/numberOfPeople;
                tipPerPerson = totalTip/numberOfPeople;
                System.out.println("Total to pay: "+ totalToPay);
                System.out.println("Total tip: "+totalTip);
                System.out.println("Total per person: "+totalPerPerson);
                System.out.println("Tip per person: "+tipPerPerson);
            }else if (serviceQuality.contains("Good")){
                totalTip=checkAmount*0.15f;
                totalToPay = totalTip+checkAmount;
                totalPerPerson = totalToPay/numberOfPeople;
                tipPerPerson = totalTip/numberOfPeople;
                System.out.println("Total to pay: "+ totalToPay);
                System.out.println("Total tip: "+totalTip);
                System.out.println("Total per person: "+totalPerPerson);
                System.out.println("Tip per person: "+tipPerPerson);}
        }












    }
}
