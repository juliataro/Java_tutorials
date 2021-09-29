package week2;

import java.util.Scanner;

/*
Create a program that reads numbers from the user and prints their sum.
The program should stop asking for numbers when user enters the number 0.
The program should be structured like this:
 */

public class sumOfManyNumbers26 {
    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while (true) {

            int number = Integer.parseInt(reader.nextLine());
            if (number == 0) {
                break;
            }
            sum = sum + number;
            System.out.println("Sum now: " + sum);

        }
        System.out.println("Sum in the end: " + sum);
    }
}
