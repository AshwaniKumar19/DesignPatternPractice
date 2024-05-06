package StrategyPattern.WithStrategyPattern;

public class NormalDriveStrategy implements IDriveStrategy {

    @Override
    public void drive() {
       System.out.println("I have a normal drive mode");
        
    }
    

}
