package week5.lyraCard_and_cashRegister86;

public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000.00;
    }

    public double payEconomical(double cashGiven) {

        // if the given cash is at least the price of the lunch:
        if (cashGiven >= 2.50) {
            //    the price of lunch is added to register
            this.cashInRegister += 2.50;
            //    the amount of the sold lunches is incremented by one
            this.economicalSold++;
            //    the method returns cashGiven - lunch price
            cashGiven -= 2.50;
            return cashGiven;
        } else {
            // if not enough money is given, all is returned and nothing else happens
            System.out.println("Insufficient funds");
            return cashGiven;

        }
    }


    public double payGourmet(double cashGiven) {

        // if the given cash is at least the price of the lunch:
        if (cashGiven > 4.00) {
            //    the price of lunch is added to the register
            this.cashInRegister += 4.00;
            //    the amount of the sold lunches is incremented by one
            this.gourmetSold++;
            //    the method returns cashGiven - lunch price
            cashGiven -= 4.00;
            return cashGiven;
        }
        // if not enough money is given, all is returned and nothing else happens
        System.out.println("Insufficient funds");
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        // if the balance of the card is at least the price of the lunch:
        if (card.balance() >= 2.50) {
            //    the amount of sold lunches is incremented by one
            this.economicalSold =+ 1;
            card.pay(2.50);
            //    the method returns true
            return true;
        }
        // if not, the method returns false
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        // if the balance of the card is at least the price of the lunch:
        if (card.balance() >= 4.00) {
            //    the amount of sold lunches is incremented by one
            this.economicalSold =+ 1;
            card.pay(4.00);
            //    the method returns true
            return true;
        }
        // if not, the method returns false
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum){
        if(sum>0){
            card.loadMoney(sum);
            this.cashInRegister +=sum;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
