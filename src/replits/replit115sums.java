package replits;

import java.util.Scanner;

public class replit115sums {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        System.out.println(sum);




    }
}
