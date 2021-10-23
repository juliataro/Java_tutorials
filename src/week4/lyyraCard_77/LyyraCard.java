package week4.lyyraCard_77;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    // Show the balance in the beginnning
    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    // Here we are paying with card
    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance -= 2.50;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // here we are paying with card
    public void payGourmet() {
        if (this.balance >= 4.00) {
            this.balance -= 4.00;
        } else {
            System.out.println("You already spent you money. Insufficient funds!");
        }
    }

    // Here we add amount of balance
    public double loadMoney(double amount) {

        if (this.balance < 150 && amount > 0) {  // Till 150 and if amount is positive
            this.balance += amount;
        }

        if (this.balance >= 150) {
            this.balance = 150;
        }
        return amount;
    }

    // Here we load negative amount on the balance


}
