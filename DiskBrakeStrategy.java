package StrategyPattern.WithStrategyPattern;

public class DiskBrakeStrategy implements IBrakeStrategy {

    @Override
    public void brake() {
       System.out.println("This vehicle has a disk brake");
       
    }

}
