package StrategyPattern.WithoutStrategyPattern;

public class OffRoadVehicle extends Vehicle {

//Duplicate code inb/w OffRadVehicle and SportVehicle drive capabilities because they are same more or less
//Hence showcasing the use of code at same level amogst sub-classess
    public void drive() {
        
        System.out.println("Sports Vehicle drive capability");
    }

    
    public void display(){

        System.out.println("OffRoad Vehicle display capability");
    }


}
