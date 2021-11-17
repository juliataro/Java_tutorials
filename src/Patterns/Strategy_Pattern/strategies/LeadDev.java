package Patterns.Strategy_Pattern.strategies;

public class LeadDev implements Role{
    @Override
    public String description(){ return JuniorDev.class.getSimpleName();}

    @Override
    public String responsibilities(){ return " Manage team and help others";}
}
