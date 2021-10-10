package week3;

import java.util.Scanner;
@SuppressWarnings("InfiniteLoopStatement")

public class separatingFirstCharacters50 {
    public static void main(String[] args) {

        // https://www.geeksforgeeks.org/arrays-in-java/?ref=lbp


        while (true){
            Scanner reader = new Scanner(System.in);
            String name;
            System.out.print("Type your name: ");
            name = reader.nextLine();


            if (name.length() <= 3) {
                System.out.println("");

            } else {

                // Creat array of name's string  length
                char [] ch  = new char [name.length()];

                // Coping characters into array
                for (char i = 0; i < name.length(); i++) {
                    ch [i] = name.charAt(i);
                }

                for (char c : ch) {
                    System.out.println(c);
                }

            }







        }











    }
}
