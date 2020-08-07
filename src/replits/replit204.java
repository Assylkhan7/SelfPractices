package replits;

import java.lang.reflect.Array;
import java.util.Arrays;

public class replit204 {









    public static boolean isAnagram(String word1, String word2) {

        char [] fWord =  word1.toLowerCase().replaceAll(" ","").toCharArray();
        char [] sWord =  word2.toLowerCase().replaceAll(" ", "").toCharArray();

        Arrays.sort(fWord);
        Arrays.sort(sWord);

        return Arrays.equals(fWord, sWord);

    }
}
