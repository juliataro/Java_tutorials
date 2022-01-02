package week9.Moving18.Domain;

public class Item implements Thing, Comparable<Item>{

    private String name;
    private int vol;
    public Item(String name, int vol){
        this.name = name;
        this.vol = vol;
    }


    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name + " ("+this.vol+" dm^3)";
    }

    public int getVolume(){
        return this.vol;
    }




    public int compareTo(Item comparable){
        return this.vol - comparable.getVolume();
    }
}


