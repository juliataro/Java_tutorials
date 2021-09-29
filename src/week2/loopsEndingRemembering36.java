package week2;

import java.util.Scanner;

/*
* Create a program that asks the user to input numbers (integers).
* The program prints <<Type numbers>> until the user types the number -1.
*  When the user types the number -1, the program prints <<Thank you
* and see you later!>> and ends.*/

public class loopsEndingRemembering36 {
    public static void main(String[] args) {

        // https://www.quora.com/How-do-I-print-sum-1+2+3+-n-in-Java-loop-statements

        int sum = 0; // Total sum variable
        int amount = 0;
        int average = 0;


        Scanner reader = new Scanner(System.in);
        int i;

        while (true){
            System.out.println("Type the number: ");  // Message for user
            int value = Integer.parseInt(reader.nextLine()); // Reading input

            if(value == -1){ // If value is -1 - then stop
                break;
            }

            sum = sum + value; // Otherwise calculate
            amount = amount + 1; // Counts each one number
            average = sum / amount;

        }

        System.out.println("36.1: Thank you and see you later!");
        System.out.println("36.2: The total sum is: " + sum);
        System.out.println("36.3: The total amount is: " + amount);
        System.out.println("36.4: The average is: " + average);

        for (i=1; i<amount; i++){
            if(i % 2 == 0){
                System.out.println("Amount of even numbers:" + i);
            } else {
                System.out.println("Amount of odd numbers:" + i);
            }
        }






    }
}

