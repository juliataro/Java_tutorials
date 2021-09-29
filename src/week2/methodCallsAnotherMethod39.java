package week2;

//https://materiaalit.github.io/2013-oo-programming/part1/week-2/

import java.security.spec.RSAOtherPrimeInfo;

public class methodCallsAnotherMethod39 {

    public static void main(String[] args) {
        printStars(5);
        System.out.println("");
        printStars(3);
        System.out.println("");
        printStars(9);
        System.out.println("");
        System.out.println("");

        //Task 39.2
        printSquare(4);
        System.out.println("");

        //Task 39.3
        printRectangle(7, 3);
        System.out.println("");

        //Task 39.4
        printTriangle(4);
    }


    // Prints as in asked in main method 39.1
    private static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
    }

    //Task 39.2 This method uses printStars method to execute stars
    public static void printSquare(int sideSize) {

        int row = 0;
        while (row < sideSize) {
            printStars(sideSize);
            System.out.println();
            row++;
        }

    }
    //Task 39.3 This method uses printStars method to execute stars

    private static void printRectangle(int width, int height) {
        int row = 0;

        while (row < height ) {
            printStars(width);
            System.out.println("");
            row++;
        }
    }

    public static void printTriangle(int size) {

        int row = 0;
        while (row <= size){
            printStars(row);
            System.out.println("");
            row++;

        }

    }


}

