package week5.ApartmentComparison87;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment){
        if(this.squareMeters>otherApartment.squareMeters){
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment otherApartment){
        int thisApPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherApPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;

        return Math.abs(thisApPrice - otherApPrice);
        //return thisBuffer - Buffer;
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        //int thisApPrice = this.squareMeters * this.pricePerSquareMeter;
        //int otherApPrice = otherApartment. * otherApartment.pricePerSquareMeter;
        int Price2 = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        int Price1 = this.squareMeters * this.pricePerSquareMeter;

        //if()
        if (Price1> Price2)
            return true;
        else
            return false;
    }
}
