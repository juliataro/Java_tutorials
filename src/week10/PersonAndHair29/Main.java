package week10.PersonAndHair29;

import week10.PersonAndHair29.People.Person;
import week10.PersonAndHair29.People.Student;
import week10.PersonAndHair29.People.Teacher;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void printDepartment(ArrayList<Person> people) {
        // we print all the people in the department
        for(Person temp : people){
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
//        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
//        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
//        System.out.println(pekka);
//        System.out.println(esko);
//
//        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
//        System.out.println(olli);
//        System.out.println("credits " + olli.credits());
//        olli.study();
//        System.out.println("credits "+ olli.credits());
//
//        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
//        System.out.println( olli );
//        olli.study();
//        System.out.println( olli );
//
//
//        Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
//        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
//        System.out.println( pekka );
//        System.out.println( esko );
//
//        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
//        for ( int i=0; i < 25; i++ ) {
//            olli.study();
//        }
//        System.out.println( olli );

        ArrayList<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );

        printDepartment(people);

    }




}
