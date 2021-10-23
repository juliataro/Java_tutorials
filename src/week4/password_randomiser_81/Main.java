package week4.password_randomiser_81;

public class Main {

    public static void main(String[] args) {
        Rand randomizer = new Rand(13);

        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}
