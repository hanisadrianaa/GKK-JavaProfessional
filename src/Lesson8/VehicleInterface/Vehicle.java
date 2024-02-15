package Lesson8.VehicleInterface;

public interface Vehicle {
    // basic operation for vehicle

    // start vehicle
    void start();

    // stop vehicle
    void stop();

    // increase speed vehicle
    void accelerate(double speed);

    // decrease speed vehicle
    void brake(double speed);
}
