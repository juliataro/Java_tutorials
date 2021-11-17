package Patterns.Strategy_Pattern.strategies;

public class MiddleDev implements Role {
    @Override
    public String description(){ return MiddleDev.class.getSimpleName();}

    @Override
    public String responsibilities(){ return " Write Code and review";}
}
