package week8.OnlineShop12;

public class Purchase {

    private int amount;
    private int unitPrice;
    private String product;

    public Purchase(String product, int amount, int unitPrice){
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int price(){
        return this.unitPrice * this.amount;
    }

    public void increaseAmount(){
        this.amount++;
    }

    public String toString(){
        return this.product + ": " + this.amount;
    }
}
