package week1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Input dividend: ");
        int dividend = Integer.parseInt(reader.nextLine());
        System.out.print("Input divosor: ");
        int divisor = Integer.parseInt(reader.nextLine());


        double result = (double) dividend / divisor;
        System.out.print("Division: " + dividend + " / " + divisor + "= " + result);
    }
}
