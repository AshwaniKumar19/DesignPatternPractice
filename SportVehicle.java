package StrategyPattern.WithStrategyPattern;

public class SportVehicle extends Vehicle {

    SportVehicle (){
        super( new SportsDriveStrategy(), new SportyDisplayStrategy(), new DiskBrakeStrategy());
    }

    }

