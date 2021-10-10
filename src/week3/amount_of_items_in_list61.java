package week3;

import java.util.ArrayList;

public class amount_of_items_in_list61 {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");

        System.out.println("There are this many items in the list:");

    }
    public static int countItems(ArrayList<String> list) {
        System.out.println(list.size());
        return list.size();
    }
}
