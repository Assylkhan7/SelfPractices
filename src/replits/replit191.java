package replits;

public class replit191 {
    public static void main(String[] args) {
        System.out.println(reverse("Assylkhan"));


    }





    public static String reverse(String input)
    {
        String result = "";
        for(int i = input.length()-1; i>=0;i--){
            result+=input.charAt(i);
        }
        return result;
    }

/*
     String result = "";
        for(int i = word.length()-1; i>=0; i--){
            result+=word.charAt(i);
        }
        return result;
 */

}
