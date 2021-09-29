package week1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){

        // Reading text

            Scanner reader = new Scanner(System.in);

            System.out.print("Who is greeted: ");
            String name = reader.nextLine(); // Reads a line of input from the user and assigns it
            //     to the variable called name

            System.out.print("Hi " + name);
        System.out.print("\n");System.out.print("\n");

            // Reading numbers

        System.out.print("Type an integer: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("You typed " + number);


        // One more variant

        // Both String and integer can be passed a parameter to Integer.valueOf()
        // whereas only a String can be passed as parameter to Integer.parseInt().

        //  public static Integer valueOf(int a)
        //  public static Integer valueOf(String str)
        //  public static Integer valueOf(String str, int base)





    }
    }

