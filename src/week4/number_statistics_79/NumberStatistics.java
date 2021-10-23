package week4.number_statistics_79;

import java.util.ArrayList;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        // code here
        if(number > -1){
            this.sum = this.sum + number;
        }
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        // code here;
        return this.amountOfNumbers;
    }

    public int sum() {
        // code here
        return this.sum;
    }

    public double average() {
        // code here
        double sum = 0.0;
        if(this.amountOfNumbers > 0){
          sum = (double)this.sum / (double) this.amountOfNumbers;
          return sum;
        } else {
            return 0;
        }
    }


}
