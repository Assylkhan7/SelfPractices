package replits;

import java.util.Scanner;

public class replit56Laptop {
    public static void main(String[] args) {

        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0 ;
        Scanner scan = new Scanner(System.in);

        System.out.println("Select screen size:");
        double size = scan.nextDouble();

        System.out.println("Select CPU type:");
        cpu = scan.next();

        System.out.println("Select RAM size:");
        int RAM = scan.nextInt();

        System.out.println("Select storage type:");
        storageType = scan.next();

        System.out.println("Enter memory size:");
        int memory = scan.nextInt();

        System.out.println("Enter screen resolution:");
        screenType = scan.next();


        if(size==13.3){
            price+=200;
        }else if(size==15.0){
            price+=300;
        }else if(size==17.3){
            price+=400;
        }else {
            System.out.println("Invalid screen size");
        }

        if(cpu.equals("i3")){
            price+=150;
        }else if(cpu.equals("i5")){
            price+=250;
        }else if (cpu.equals("i7")){
            price+=350;
        }else {
            System.out.println("Invalid CPU");
        }

        ram+=(RAM/4)*50;
        price+=ram;

        int Memory = 0;
        if(storageType.contains("HDD")){
        Memory+=(memory/500)*50;
        price+=Memory;
        }else if(storageType.contains("SSD")) {
            Memory += (memory / 500) * 100;
            price += Memory;
        }else { }

        if(screenType.contains("FULLHD")){
            price+=100;
        }else if(screenType.contains("4K")){
            price+=200;
        }else {
            price+=0;
        }

        System.out.println("Laptop price is: $"+price);









    }
}
