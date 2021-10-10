package week2;

import java.util.Scanner;

public class guessNumberGame41 {
    public static void main(String[] args) {

        int secretNumber;
        int answer;
        int times = 1;

        secretNumber = (int) (Math.random()*100)+1;

        Scanner reader = new Scanner(System.in);

        while (true){

            System.out.println("Enter a number: ");
            answer = Integer.parseInt(reader.nextLine());
            System.out.println("Your guess number is: " + answer);

            if(answer == secretNumber){
                break;
            }

            if(answer < secretNumber){
                System.out.println("The number is lesser, guess made " + times );
            } else {
                System.out.println("The number is large, guess made " + times);
            }
            times++;
        }

        System.out.println("Congratulations! Secret number is: "+ secretNumber);




    }


}
