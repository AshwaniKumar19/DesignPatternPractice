package StrategyPattern.WithStrategyPattern;

public class SportsDriveStrategy implements IDriveStrategy {

    @Override
    public void drive() {
        System.out.println( "This vehicle has a sports drive mode");

}
}
