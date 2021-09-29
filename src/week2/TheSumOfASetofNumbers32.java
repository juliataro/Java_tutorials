package week2;

import java.util.Scanner;

public class TheSumOfASetofNumbers32 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        Scanner reader = new Scanner(System.in);
        System.out.println("Till what number: ");
        int number = Integer.parseInt(reader.nextLine());

        while (i <= number){

            sum = sum + i;
            i++;
        }
        System.out.println(sum);

        }
    }

