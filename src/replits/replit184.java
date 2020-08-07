package replits;

public class replit184 {
    public static void main(String[] args) {

        System.out.println(at3("longword", "foo"));
    }





    public static String at3(String target,String word)
    {
        String r = target.substring(0,3)+word.substring(0)+target.substring(3);
        return r;
    }

}
