import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Type radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        double pi = 3.14;


        double circumference = (double)Math.round(radius * 2 * pi);
        double diameter = Math.ceil(radius * 2);
        System.out.print("Circumference  is equal to : " + circumference + "\n");
        System.out.print("Diameter  is equal to : " + diameter);
    }
}
