package week4.clock_using_counter_78;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    //    Counter in the beginning
    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    // Addition to value
    public void next() {
        if (this.value <= this.upperLimit) {
            this.value += 1;
            if (this.value > this.upperLimit) {
                this.value = 0;
            }
        }
    }

    // Printing the result with "0" 78.1 and 78.2
    public String toString() {
        if(this.value<10){
            return "0"+value;
        } else {
            return ""+value;
        }
    }

    public void setValue(int newValue) {
        if (newValue>=0 && newValue<=this.upperLimit) {
           this.value = newValue;
        }
    }

    public int getValue() {
        // write here code that returns the value
        return this.value;
    }


}
