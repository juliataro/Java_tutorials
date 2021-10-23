package week4.number_statistics_79;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        NumberStatistics stats = new NumberStatistics();
//        stats.addNumber(3);
//        stats.addNumber(5);
//        stats.addNumber(1);
//        stats.addNumber(2);
//        System.out.println("Amount: " + stats.amountOfNumbers());
//        System.out.println("sum: " + stats.sum());
//        System.out.println("average: " + stats.average());

        Scanner reader = new Scanner(System.in);          // new object for reading inputs
        NumberStatistics stats = new NumberStatistics();  // new object for numbers

        NumberStatistics evenN = new NumberStatistics();  // Controls even numbers
        NumberStatistics oddN = new NumberStatistics();   // Controls odd numbers

        while (true){ // Circle for inserting numbers

            System.out.println("Print the numbers: ");
            int userNumber = Integer.parseInt(reader.nextLine());

            stats.addNumber(userNumber);  // accepting  All inputs
            evenN.addNumber(userNumber);  // Accept even numbers
            oddN.addNumber(userNumber);   // Accept odd numbers

            if(userNumber != -1){

                if( userNumber %2 == 0){
                    evenN.sum();
                } else {
                    oddN.sum();
                } stats.sum();
            } else {
                break;
            }
        }
        System.out.println("All sum is: " + stats.sum());
        System.out.println("Sum of even numbers: " + evenN.sum());
        System.out.println("Sum of odd numbers: " + oddN.sum());


    }
    }

