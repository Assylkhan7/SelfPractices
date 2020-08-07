package replits;

import java.util.Scanner;

public class replit122 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};


      for(int i =0; i<nums.length; i++){
          int count = 0;
          for(int j=0; j<nums.length;j++){
              if(nums[i]==nums[j]){
                  count++;
              }
          }if(count==1){
              System.out.println(nums[i]);
          }
      }








/*
  for (int j=0; j<=str.length()-1;j++){
            char ch1 =  nonDup.charAt(j);
            int count = 0;
            for(int i =0; i<= str.length()-1; i++){
                char each =    str.charAt(i);
                if(ch1==each){
                    count++;
                }
            }
            result+=""+ch1+count;
        }
        System.out.println(result);
    }
}
 */




    }
}
