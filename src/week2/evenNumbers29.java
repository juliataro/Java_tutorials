package week2;

//https://materiaalit.github.io/2013-oo-programming/part1/week-2/

/*Create a program that prints all even numbers between 2 and 100.
 */
public class evenNumbers29 {
    public static void main(String[] args){

        int number = 2;
        System.out.println("The even numbers between 1-100 are: ");

        while (number <= 100 ){
            if( number %2 == 0){
                System.out.println(number);
            }
            number++;
        }

    }
}
