package StrategyPattern.WithStrategyPattern;

public class Vehicle {
    IDriveStrategy driveStrategy;
    IDisplayStrategy displayStrategy;
    IBrakeStrategy brakeStrategy;



    Vehicle (IDriveStrategy driveStrategy, IDisplayStrategy displayStrategy){

        this.driveStrategy = driveStrategy;
        this.displayStrategy = displayStrategy;
        
    }

    Vehicle (IDriveStrategy driveStrategy, IDisplayStrategy displayStrategy, IBrakeStrategy brakeStrategy){

        this.driveStrategy = driveStrategy;
        this.displayStrategy = displayStrategy;
        this.brakeStrategy=brakeStrategy;

    }

    public void driveVehicle(){
        driveStrategy.drive();
    
}
    public void displayOfVehicle(){
        displayStrategy.display();
    }

    public void brakeOfVehicle(){
        brakeStrategy.brake();
    }

}
