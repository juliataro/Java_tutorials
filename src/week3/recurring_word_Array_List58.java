package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class recurring_word_Array_List58 {
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        ArrayList<String> listOfWords = new ArrayList<String>();


        while (true) {

            System.out.print("Type a word: ");
            String word = reader.nextLine();


            if (listOfWords.contains(word)) {
                System.out.println("You gave the word " + word + " twice.");
                break;
            }

            listOfWords.add(word);

        }

    }
}

