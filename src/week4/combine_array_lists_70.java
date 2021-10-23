package week4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class combine_array_lists_70 {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        // Here we add numbers to lists
        list1.add(4);
        list1.add(3);

        list2.add(5);
        list2.add(10);
        list2.add(7);

        combine(list1, list2);  // Here we combine lists

        System.out.println(list1); // prints [4, 3, 5, 10, 7]

        System.out.println(list2); // prints [5, 10, 7]


    }

    public static void combine(ArrayList<Integer> list1, ArrayList<Integer> list2){

        list1.addAll(list2);

    }
}
