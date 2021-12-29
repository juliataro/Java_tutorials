package week8.BoxesAndTh11;

public class CD implements ToBeStored{

    private String artist;
    private String title;
    private int year;
    private double weight;

    public CD(String artist, String title, int year){
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.weight = 0.1;
    }

    public double weight(){
        return 0.1;
    }

    @Override
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.year + ")";
    }
}
