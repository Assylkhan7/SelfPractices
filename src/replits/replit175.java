package replits;

public class replit175 {
    public static void main(String[] args) {
        System.out.println("Hello world");


    }






    public boolean validateTask(boolean notEmpty,int taskId,int currentId)
    {
        boolean r =false;
        if(notEmpty==true){
            if(currentId<currentId+1){
                r =  true;
            }else {
                r=false;
            }
        }
        return r;

    }
}
