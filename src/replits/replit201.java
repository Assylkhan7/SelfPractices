package replits;

import java.util.ArrayList;
import java.util.Collections;
public class replit201 {
    public static void main(String[] args) {
        ArrayList <Integer> l = new ArrayList<>();
        l.add(4);
        l.add(-6);
        l.add(3);
        l.add(-8);
        l.add(0);
        l.add(4);
        l.add(3);
        appendPosSum(l);
        System.out.println(l);

    }


    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        int sum = 0;
        for (Integer each: nums) {
            if (each >0) {
                list1.add(each);
                sum += each;
            }
        }
        list1.add(sum);
        return list1;
    }
}