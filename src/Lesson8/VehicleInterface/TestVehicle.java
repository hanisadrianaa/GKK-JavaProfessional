package Lesson8.VehicleInterface;

public class TestVehicle {
    public static void main(String[] args) {
        
        // instances
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.start();
        car.accelerate(20);
        car.brake(10);
        car.stop();

        bicycle.start();
        bicycle.accelerate(15);
        bicycle.brake(5);
        bicycle.stop();
    }
    
}
