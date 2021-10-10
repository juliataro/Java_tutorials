package week3;

import java.util.ArrayList;
import java.util.Arrays;

public class average_of_numbers_64 {

        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(3);
            list.add(2);
            list.add(7);
            list.add(2);

            System.out.println("The average is: " + average(list));
        }

    public static double average(ArrayList<Integer> list) {
        // write your code here
        double total = 0;
        double avg = 0;
        for(int i =0; i < list.size(); i++) {
            total += list.get(i);
            avg = total / list.size();
            
        }
        return avg;
    }


}
