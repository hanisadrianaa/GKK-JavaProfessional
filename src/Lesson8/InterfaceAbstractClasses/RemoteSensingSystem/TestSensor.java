package Lesson8.InterfaceAbstractClasses.RemoteSensingSystem;

public class TestSensor {
    public static void main(String[] args) {

        Sensor temperatureSensor = new TemperatureSensor();
        Sensor pressureSensor = new PressureSensor();

        System.out.println("Taking initial measurements...");
        temperatureSensor.measure();
        pressureSensor.measure();

        System.out.println("\nCalibrating sensors...");
        temperatureSensor.calibrate();
        pressureSensor.calibrate();

        System.out.println("\nTaking measurements after calibration...");
        temperatureSensor.measure();
        pressureSensor.measure();
    }
}
