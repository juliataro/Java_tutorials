package week1;

import java.util.Objects;
import java.util.Scanner;

public class Ex22 {
    public static void main (String[] args){

        String password = "54lk54";

        Scanner reader = new Scanner(System.in); // listening of input
        System.out.print("Input password: ");
        String userinput = reader.nextLine(); // Reads a line of input from the user and assigns it

        if (Objects.equals(userinput, password)) {
            System.out.println("right!");
        } else {
            System.out.println("wrong!");
        }
    }

    }


