package week5.overloading_counter_84;

public class Counter {

    private final int number;
    private final boolean check;
    private int counter;

    // Constructors
    public Counter(int startingValue, boolean check) {
        this.number = startingValue;
        this.check = check;
        this.counter = this.number;
    }

    public Counter(int startingValue) {
        this.number = startingValue;
        this.check = false;
        this.counter = startingValue;
    }

    public Counter(boolean check) {
        this.number = 0;
        this.check = check;
        this.counter = 0;
    }

    public Counter() {
        this.number = 0;
        this.check = false;
        this.counter = 0;

    }

    public int value() {
        return this.counter;
    }

    public void increase() {
        this.counter++;
    }

    public void decrease() {
        if (this.check) {
            if(this.counter >= 1){
                this.counter--;
            };

        }
    }

  //   Overload of increase mth
    public void increase(int increaseAmount) {
        if (increaseAmount >= 1) {
            this.counter += increaseAmount;
        }
    }

   //  Overload of decrease mth
    public void decrease(int decreaseAmount) {
        if (this.check && decreaseAmount <= this.number && 1 <= decreaseAmount) {
            this.counter = this.counter - decreaseAmount;
        }
    }
}
