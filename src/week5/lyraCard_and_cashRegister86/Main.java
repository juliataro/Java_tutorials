package week5.lyraCard_and_cashRegister86;

public class Main {
    public static void main(String[] args) {

        CashRegister unicafeExactum = new CashRegister();
        System.out.println( unicafeExactum );

        LyyraCard cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println( unicafeExactum );




//        86.1

//        LyyraCard cardOfPekka = new LyyraCard(10);
//
//        System.out.println("money on the card " + cardOfPekka.balance() );
//        boolean succeeded = cardOfPekka.pay(8);
//        System.out.println("money taken: " + succeeded );
//        System.out.println("money on the card " + cardOfPekka.balance() );
//
//        succeeded = cardOfPekka.pay(4);
//        System.out.println("money taken: " + succeeded );
//        System.out.println("money on the card " + cardOfPekka.balance() );


    }
}





