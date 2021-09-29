package week2;

import java.util.Scanner;
/*
Create a program that prints all whole numbers from 1 to the number the user enters.
 */

public class upToCertainNumber30 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int number = 0;
        System.out.println("Up to what number: ");
        int sisestatud = Integer.parseInt(reader.nextLine());

        while (number < sisestatud){
            System.out.println(number);
            number++;
        }

    }
}
