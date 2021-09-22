import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in); // listening of input

        System.out.println("Get to know is the year leap or not!");
        System.out.print("Continue? ('no' to quit)? ");
        String command = reader.nextLine(); // getting input


            while (true) {
                if (command.equals("no")){
                    break;
                } else {
                    System.out.print("Type the year: ");
                    int year = Integer.parseInt(reader.nextLine());

                    if(year % 400 == 0 && year % 100 == 0) {
                        System.out.println("its a leap year! Great!");
                    } else if (year % 4 == 0){
                        System.out.println("its a leap year! Wow!!");
                    } else {
                        System.out.println("its not a leap year!");
                    }
                }

            }



        }
    }

