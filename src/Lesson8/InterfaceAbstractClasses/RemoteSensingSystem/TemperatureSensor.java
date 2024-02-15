package Lesson8.InterfaceAbstractClasses.RemoteSensingSystem;

public class TemperatureSensor implements Sensor {

    private double temperature;

    @Override
    public void measure() {
        this.temperature = Math.random() * 50 + 20; // generate random temperature between 20 and 70 degrees
        String formattedTemperature = String.format("%.2f", temperature);
        System.out.println("Measured temperature: " + formattedTemperature + " degrees");
    }

    @Override
    public void calibrate() {
        this.temperature -= 0.5; // adjust temperature slightly to improve accuracy
        System.out.println("Temperature sensor calibrated.");
    }
}
