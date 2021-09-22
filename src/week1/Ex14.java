package week1;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        if(number > 0) {
            System.out.println("The number is positive");
        } else if (number == 0) {
            System.out.println( "The number is neutral");
        } else {
            System.out.println("The number is negative");
        }

    }
}
