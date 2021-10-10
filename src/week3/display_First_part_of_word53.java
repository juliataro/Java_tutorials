package week3;

import java.util.Scanner;
@SuppressWarnings("InfiniteLoopStatement")

public class display_First_part_of_word53 {
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        String firstLetters = "";

        while (true) {

            System.out.print("Enter the word: ");
            String word = reader.nextLine(); // Reading word

            System.out.print("Length of the first part: ");
            int number = Integer.parseInt(reader.nextLine()); // Reading number

            if (word.length() <= number){
                System.out.println("The length is less , do it again!");
            }

            firstLetters = word.substring(0, number);
            System.out.println(firstLetters);

        }


    }
}
