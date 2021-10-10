package week3;

import java.util.Scanner;

public class Reversingtext56 {

    public static StringBuilder reverse(String text){
        //code
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse();
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
