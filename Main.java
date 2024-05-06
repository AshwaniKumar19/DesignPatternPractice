package StrategyPattern.WithoutStrategyPattern;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();
        vehicle.display();

        Vehicle vehicle2 = new PassengerVehicle();
        vehicle2.drive();
        vehicle2.display();


}
}
