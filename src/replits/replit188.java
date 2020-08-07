package replits;

public class replit188 {





    public static int  findMax(int [] arr){
        int max = arr[0];
        for(int i =0; i<=arr.length-1; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return  max;
    }


    public static double findMax(double [] arr){
        double max = arr[0];
        for(int i=0; i<=arr.length-1; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
