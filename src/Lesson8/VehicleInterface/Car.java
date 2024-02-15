package Lesson8.VehicleInterface;

class Car implements Vehicle {

    private boolean engineRunning;
    private double currentSpeed;

    // implements start, stop, accelerate, and brake methods
    // according to Vehicle interface

    @Override
    public void start() {
        if (!engineRunning) {
            engineRunning = true;
            System.out.println("Car engine started.");
        } else {
            System.out.println("Car engine already running.");
        }
    }

    @Override
    public void stop() {
        if (engineRunning) {
            engineRunning = false;
            currentSpeed = 0;
            System.out.println("Car engine stopped.");
        } else {
            System.out.println("Car engine already stopped.");
        }
    }

    @Override
    public void accelerate(double speed) {
        if (engineRunning) {
            currentSpeed += speed;
            System.out.println("Car accelerating to " + currentSpeed + " km/h.");
        } else {
            System.out.println("Car engine must be started before accelerating.");
        }
    }

    @Override
    public void brake(double speed) {
        if (engineRunning) {
            currentSpeed = Math.max(currentSpeed - speed, 0);
            System.out.println("Car braking to " + currentSpeed + " km/h.");
        } else {
            System.out.println("Car engine must be started before braking.");
        }
    }
    
}
