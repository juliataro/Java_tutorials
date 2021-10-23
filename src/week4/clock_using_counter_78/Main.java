package week4.clock_using_counter_78;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//   78.1 and 78.2
//        BoundedCounter counter = new BoundedCounter(14);
//        System.out.println("Value at start: " + counter);
//
//        int i = 0;
//        while (i < 16){
//            counter.next();
//            System.out.println("Value: " + counter);
//            i++;
//        }

//   // 78.3
//        BoundedCounter minutes = new BoundedCounter(59);
//        BoundedCounter hours = new BoundedCounter(23);
//
//        int i = 0;
//        while ( i < 121 ) {
//            System.out.println( hours + ":" + minutes);   // the current time printed
//            // advance minutes
//            minutes.next();
//            // if minutes become zero, advance hours
//            if(minutes.getValue() == 0 ){
//                hours.next();
//            }
//            i++;
//        }


        Scanner reader = new Scanner(System.in); // New scaner reader
        BoundedCounter seconds = new BoundedCounter(59); // New objects
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());  // User inputs reading

        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());

        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);  // Values accepting and setting
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes + ":" + seconds);   // the current time printed

            // if seconds become 59 seg, go to minutes, and if they are make hours bigger
            if(seconds.getValue() == 59 ){
                if(minutes.getValue() == 59 ){
                    hours.next();
                }
                seconds.next();
                minutes.next();

            } else {
                seconds.next();
            }
            i++;
        }

    }


    }

