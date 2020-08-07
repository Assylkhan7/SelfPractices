package replits;

import java.util.Arrays;
import java.util.Scanner;

public class replit117 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }

        for(int i =0; i<=arr.length-1; i+=2){
            System.out.print(arr[i]+" , "+arr[i+1]);
        }







    }
}
