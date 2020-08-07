package replits;

public class replit_Assessment_4_1 {









    public static boolean isSort(int[] nums)
    {
        boolean sorted = true;
        for(int i =0; i<=nums.length-2; i++){
            if(nums[i+1] < nums[i]){
                sorted = false;
                break;
            }
        }return sorted;
    }

}
