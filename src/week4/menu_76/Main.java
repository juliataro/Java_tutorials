package week4.menu_76;



public class Main {
    public static void main(String[] args) {
        Menu useStep = new Menu();

        // Here we add deshes to addMeal method
        useStep.addMeal("Hamburger");
        useStep.addMeal("Fish'n'Chips");
        useStep.addMeal("Sauerkraut");

        // Here we print our menu
        useStep.printMeals();
        System.out.println(' ');

        // Here we clear our Menu and print it
        useStep.clearingMeals();
        useStep.printMeals();



    }
}
