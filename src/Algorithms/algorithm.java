package Algorithms;

import java.util.Scanner;

public class algorithm {

    public static void generateSequence(int wish) {
        int number = 1;

        while (number <= wish) {
            if (number % 3 == 0 && number % 15 != 0) {
                System.out.println("Ding");
            } else if (number % 5 == 0 && number % 15 != 0) {
                System.out.println("Dong");
            } else if (number % 15 == 0) {
                System.out.println("Ding-Dong");
            } else {
                System.out.println(number);
            }
            number++;
        }
    }

    public static void decreasingSequence(int wish) {
        int number = 1;

        while (number <= wish) {
            if (wish % 4 == 0) {
                System.out.println(wish);
            }
            wish--;
        }
    }

    public static void main(String[] args) {

        System.out.println("Ding, Dong ja Ding-Dong issue:");
        algorithm.generateSequence(20);
        System.out.println();
        System.out.println("display numbers that are divisible by 4 in descending order:");
        algorithm.decreasingSequence(50);
    }
}