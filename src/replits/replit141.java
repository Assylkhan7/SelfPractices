package replits;

import java.util.Arrays;
import java.util.Scanner;

public class replit141 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

        int []result = new int[size*2];
        result[size*2-1] = nums[size-1];
        System.out.println(Arrays.toString(result));


    }
}
