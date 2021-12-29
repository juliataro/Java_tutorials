package week8.BoxesAndTh11;

import java.util.ArrayList;

public class Box implements ToBeStored{

    private double maxWeight;
    private ArrayList<ToBeStored> db;

    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.db = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored item){
        if((this.maxWeight - this.weight()) >= item.weight())
            this.db.add(item);
    }

    public double weight(){
        double weight = 0;

        for(ToBeStored item : this.db){
            weight += item.weight();
        }
        return weight;
    }

    public String toString(){
        return "Box: "+this.db.size()+" things, total weight "+this.weight()+" kg";
    }
}
