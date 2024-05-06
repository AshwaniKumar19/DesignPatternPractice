package StrategyPattern.WithStrategyPattern;

public class PassengerVehicle  extends Vehicle{


    PassengerVehicle (){
        super( new NormalDriveStrategy(), new NormalDisplayStrategy());
    }


}

