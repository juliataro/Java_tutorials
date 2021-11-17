package Patterns.Strategy_Pattern.strategies;

public class SeniorDev implements Role{
    @Override
    public String description(){ return SeniorDev.class.getSimpleName();}

    @Override
    public String responsibilities(){ return "Review the Code";}
}
