package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class words_Array_List_Add57 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<String> composers = new ArrayList<String>();

        while (true){

            System.out.print("Type a composer: ");
            String name = reader.nextLine();
            composers.add(name);

            if(name.isEmpty()){
                break;
            }


        }
        System.out.println("You typed the following words: ");
        for (String composer : composers){
            System.out.println(composer);

        }
    }
}
