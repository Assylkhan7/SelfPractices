package replits;

public class replit_MethodsWithStrings {

    public static void main(String[] args) {

        System.out.println(extractNum("aa2aa3"));
    }







    public static String extractNum(String s) {

        String r = "";
        for(char each: s.toCharArray()){
            if(Character.isDigit(each)){
                r+=each;
            }
        }
            return r;
    }
}
