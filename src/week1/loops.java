package week1;

import java.util.Scanner;
// Story creation game
public class loops {
    public static void main (String[] args) {
        while (true) {
            Scanner reader = new Scanner(System.in); // Listening of input

            System.out.println("Let's create a story?");
            System.out.print("Continue? ('no' to quit)? ");
            String command = reader.nextLine();

            if (command.equals("no")) {
                break;
            } else if (command.equals("yes"))
                //     to the variable called name
                System.out.print("Type a noun: ");
            // Reads a line of input from the user and assigns it
            String first = reader.nextLine();
            System.out.println("Once was living a " + first);
            System.out.print("Type a noun: ");
            // Reads a line of input from the user and assigns it
            String second = reader.nextLine();
            System.out.println("Once was living a " + first + " with a " + second);
            System.out.print("Type a verb: ");
            // Reads a line of input from the user and assigns it
            String third = reader.nextLine();
            System.out.println( first + " loved to " + third + ", and "+second + " not!");
            System.out.println( "That's why they always argued!");
            System.out.println( "Do we continue? If yes - type a noun :");
            String fourth = reader.nextLine();




        }
    }
}





