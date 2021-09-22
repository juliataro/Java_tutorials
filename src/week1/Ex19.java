package week1;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Type your age: ");
        int age = Integer.parseInt(reader.nextLine());

        if(age >= 1 && age <= 120) {
            System.out.println("Ok. Good luck!");
        } else {
            System.out.println("It is impossible!");
        }

    }
}
