package replits;

import java.util.Arrays;
import java.util.Scanner;

public class replit156 {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

       add_to_r(arr, n);

    }
    public static void add_to_r(int[] r,int n) {
        //create new array with one more position.
        int[] new_r = new int [r.length+1];
        new_r[new_r.length-1]=n;
        int count =0;
        for(int each: r){
            new_r[count]=each;
            count++;
        }
        System.out.println(Arrays.toString(new_r));



    }
    public  static int [] addElement(int []arr, int num){
        int [] arr2 = new int [arr.length+1];
        arr2[arr2.length-1]=num;
        int count =0;
        for(int each: arr){
            arr2[count]=each;
            count++;
        }
        return arr2;
    }

}