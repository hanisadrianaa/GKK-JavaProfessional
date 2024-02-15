package Lesson8.InterfaceAbstractClasses.RemoteSensingSystem;

public class PressureSensor implements Sensor {

    private double pressure;

    @Override
    public void measure() {
        this.pressure = Math.random() * 1000 + 900; // generate random pressure between 900 and 1000 kPa
        String formattedPressure = String.format("%.2f", pressure);
        System.out.println("Measured pressure: " + formattedPressure + " kPa");
    }

    @Override
    public void calibrate() {
        this.pressure *= 1.001; // adjust pressure slightly to improve accuracy
        System.out.println("Pressure sensor calibrated.");
    }
}
