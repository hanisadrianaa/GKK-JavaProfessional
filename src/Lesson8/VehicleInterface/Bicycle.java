package Lesson8.VehicleInterface;

class Bicycle implements Vehicle {

    private boolean isMoving;
    private double currentSpeed;

    // implements start, stop, accelerate, and brake methods
    // according to Vehicle interface

    @Override
    public void start() {
        if (!isMoving) {
            isMoving = true;
            currentSpeed = 0;
            System.out.println("Start pedaling the bicycle.");
        } else {
            System.out.println("Bicycle already moving.");
        }
    }

    @Override
    public void stop() {
        if (isMoving) {
            isMoving = false;
            currentSpeed = 0;
            System.out.println("Stop pedaling the bicycle.");
        } else {
            System.out.println("Bicycle already stopped.");
        }
    }

    @Override
    public void accelerate(double speed) {
        if (isMoving) {
            currentSpeed += speed;
            System.out.println("Pedaling faster, bicycle speed at " + currentSpeed + " km/h.");
        } else {
            System.out.println("Start pedaling the bicycle before accelerating.");
        }
    }

    @Override
    public void brake(double speed) {
        if (isMoving) {
            currentSpeed = Math.max(currentSpeed - speed, 0);
            System.out.println("Applying brakes, bicycle slowing down to " + currentSpeed + " km/h.");
        } else {
            System.out.println("Bicycle is not moving, no need to brake.");
        }
    }
}