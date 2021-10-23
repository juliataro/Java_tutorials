package week3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class alphabetical_Order_Array_List60 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> composers = new ArrayList<String>();

        while (true){

            System.out.print("Type a composer: ");
            String name = scanner.nextLine();
            composers.add(name);

            if(name.isEmpty()){
                break;
            }
        }
        System.out.println("You typed the following words: ");
        Collections.sort(composers);
        for (String composer : composers){
            System.out.println(composer);

        }
    }
    }


