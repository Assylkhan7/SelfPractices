package replits;

import java.util.Scanner;

public class replit125 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        int length = str[0].length();
        for(int i =0; i<=str.length-1;i++){
          int l = str[i].length();
          if(l<length){
              length=l;
          }
        }
        for(int i=0; i<=str.length-1;i++){
            if(str[i].length()<=length){
                System.out.println(str[i]);
            }
        }

/*
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




    }
}
