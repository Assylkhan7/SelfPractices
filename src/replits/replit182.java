package replits;

public class replit182 {
    public static void main(String[] args) {
        System.out.println(clean("one two three", "two"));


    }









    public static String clean (String text ,String badWord) {
        String r =text.replace(badWord,"");
        return r;
    }
}
