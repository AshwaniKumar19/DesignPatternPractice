package StrategyPattern.WithStrategyPattern;

public class SportyDisplayStrategy implements IDisplayStrategy {

    @Override
    public void display() {
       System.out.println( "This vehicle has a sporty display");
    }


}
