package week10.Groups28;

import week10.Groups28.Movable.Organism;

public class Main {
    public static void main(String[] args) {

        Organism organism = new Organism(20, 30);
        System.out.println(organism);
        organism.move(-10, 5);
        System.out.println(organism);
        organism.move(50, 20);
        System.out.println(organism);

    }
}
