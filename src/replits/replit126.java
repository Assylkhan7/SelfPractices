package replits;

import java.util.Arrays;
import java.util.Scanner;
/*
String [] arr = {"Assylkhan", "Adelina", "Aiza", "Saya"};
        int minLength = arr[0].length();
        for (int i =0; i<=arr.length-1; i++){
            int l = arr[i].length();
            if(l<minLength){
                minLength=l;
            }
        }
        System.out.println(minLength);
        for (int i =0; i<=arr.length-1; i++){
            if(arr[i].length()==minLength){
                System.out.println(arr[i]);
            }
        }
 */
public class replit126 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String [] arr = str.split(", ");
        int min = arr[0].length();
        String result = "";

        for(String each: arr){
            if(each.length()<min){
                min=each.length();
            }
        }
        for (String each: arr){
            if(each.length()==min){
                result+=each+ ",";
            }
        }
        String [] results = result.split(",");
        Arrays.sort(results);
        System.out.println(Arrays.toString(results));
    }
}
