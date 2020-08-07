package replits;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Arrays;
import java.util.Scanner;

public class replit152 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }
    public static void plus_minus(int [] arr){
        int countp = 0;
        int countn =0;
        int countz =0;
        String result = "";
        for(int each: arr){
            if(each>0){
                countp++;
            }else if(each<0){
                countn++;
            }else {
                countz++;
            }
        }
        System.out.println("positives:"+countp+", negatives"+countn+", zeros:"+countz);


    }





}
