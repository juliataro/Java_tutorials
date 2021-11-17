package Patterns.Strategy_Pattern;

// https://www.youtube.com/watch?v=F7_cRqNKoJs

import Patterns.Strategy_Pattern.strategies.JuniorDev;
import Patterns.Strategy_Pattern.strategies.LeadDev;
import Patterns.Strategy_Pattern.strategies.MiddleDev;
import Patterns.Strategy_Pattern.strategies.SeniorDev;

public class Main {
    public static void main(String[] args) {
        Employee julia = new Employee("Julia", new JuniorDev());
        Employee henno = new Employee("Henno", new LeadDev());

        System.out.println("=============Before promotion ============\n");

        julia.doWork();
        henno.doWork();

        julia.promote(new MiddleDev());
        henno.promote(new LeadDev());

        System.out.println("=============After promotion============= \n");

        julia.doWork();
        henno.doWork();
    }
}
