package replits;

public class replit203 {








    public static boolean isPalindrome(String check) {

        String s= check.replaceAll(" ", "");
        String reverse = "";
        for(int i = s.length()-1; i>=0; i--){
            reverse+=s.charAt(i);
        }
        return reverse.equalsIgnoreCase(s);

    }
}
