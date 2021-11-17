package week5.overloading_counter_84;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class Main {
    public static void main(String[] args) {

        Counter Result = new Counter(5, true);

        System.out.println(Result.value());

        Result.increase();
        System.out.println(Result.value());
        Result.decrease();
        System.out.println(Result.value());

        // Increasing by amount
        Result.increase(-1);
        System.out.println(Result.value());

        // Decreasing by amount
        Result.decrease(3);
        System.out.println(Result.value());



    }
}
