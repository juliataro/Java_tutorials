package Patterns.Strategy_Pattern;

import Patterns.Strategy_Pattern.strategies.Role;

public class Employee {
    private String name;
    private Role role;

    Employee(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public void promote(Role newRole){ role = newRole; }
    public String grade() { return  this.name + " is a " + role.description();}
    public void doWork() { System.out.println(name +" Will " + role.responsibilities());}
    }



