package Algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {

        // catches input
        Scanner reader = new Scanner(System.in);

        // asks user
        System.out.print("Kui palju numbrid?");
        int numbers = reader.nextInt();

        // converst input to array

        int[] numbArray = new int[numbers];

        for (int i = 0; i < numbers; i++) {
            System.out.print("Sisesta numbrid : ");
            numbArray[i] = reader.nextInt();
        }

        System.out.println("Seal on tõesti "+ numbArray.length + " numbrit");

        System.out.println("Sinu numbrid on: ");
        for (int i = 0; i < numbers - 1; i++){

            System.out.print(numbArray[i] + ",");
        }
        System.out.print(numbArray[numbArray.length - 1]);
        

        Arrays.sort(numbArray);





    }
}
