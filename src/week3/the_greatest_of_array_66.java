package week3;

import java.util.ArrayList;
import java.util.Collections;

public class the_greatest_of_array_66 {

    public static int greatest(ArrayList<Integer> list) {
        // write your code here
        return Collections.max(list);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }

}
