package replits;

public class replit123 {
    public static void main(String[] args) {

        int treeSize =0;
        int growth = 0;
        for(int year=1; year<= 10; year++){
            if(year<=3){
                growth=1;
                treeSize+=growth;
            }else {
                growth=2;
                treeSize+=growth;
            }
            System.out.println("year "+ year+ " growth "+growth+" cm");
            System.out.println("tree size: "+treeSize+" cm");
        }


    }
}
