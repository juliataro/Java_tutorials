package Patterns.Strategy_Pattern.strategies;

public class JuniorDev implements Role{
    @Override
    public String description(){ return JuniorDev.class.getSimpleName();}

    @Override
    public String responsibilities(){ return " Write Code";}
}
