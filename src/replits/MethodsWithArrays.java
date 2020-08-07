package replits;

public class MethodsWithArrays {







    public static int getDup(String[] r)
    {
    int result =0;
    for(String each: r){
        int count =0;
        for(String each1: r){
            if(each.equals(each1)){
                count++;
            }
        }
        if(count>1){
            result++;
        }
    }
    return result;


    }
}
