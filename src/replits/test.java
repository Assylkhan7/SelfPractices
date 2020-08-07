package replits;

import sun.tools.jconsole.Worker;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {


        int[] a = {3, 6, 0, 4, 3, 2, 7, 0};
        method(a);


    }


    public static void method(int[] a) {
        int l, r;
        l = 0;
        r = a.length - 1;

        int[] newarr = new int[a.length];
        while (l < r) {
            if (a[l] == 0) {
                int el = a[l + 1] / 2;
                newarr[l] = el;
                l++;
            }
        }

        System.out.println(Arrays.toString(newarr));
    }
}


