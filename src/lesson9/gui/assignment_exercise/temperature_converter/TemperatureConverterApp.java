package lesson9.gui.assignment_exercise.temperature_converter;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TemperatureConverterApp extends JFrame {
    private JLabel celciusLbl, fahrenheitLbl; // display label for Celcius and Fahrenheit
    private JTextField celciusTxt, fahrenheitTxt; // input temperature values in Celcius and Fahrenheit
    private JButton btnCtoF, btnFtoC; // convert Celcius to Fahrenheit and Fahrenheit to Celcius

    public TemperatureConverterApp() {
        setTitle("Temperature Converter");
        setSize(150, 200);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        // initialize JLabel and JTextField for Celcius and Fahrenheit
        celciusLbl = new JLabel("Celcius:");
        celciusTxt = new JTextField(10);
        fahrenheitLbl = new JLabel("Fahrenheit:");
        fahrenheitTxt = new JTextField(10);
        
        // button for converting Celcius to Fahrenheit
        btnCtoF = new JButton("Convert C to F");
        btnCtoF.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String cTxt = celciusTxt.getText(); // get Celcius temperature input
                    double c = Double.parseDouble(cTxt); // parse Celcius temperature as double
                    double f = (c * 9 / 5) + 32; // formula convert Celcius to Fahrenheit
                    fahrenheitTxt.setText(String.valueOf(f));
                }
            }
        );

        // button for converting Fahrenheit to Celcius
        btnFtoC = new JButton("Convert F to C");
        btnFtoC.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String fText = fahrenheitTxt.getText(); // get Fahrenheit temperature input
                    double f = Double.parseDouble(fText); // parse Fahrenheit temperature as double
                    double c = (f - 32) * 5 / 9; // formula convert Fahrenheit to Celcius
                    celciusTxt.setText(String.valueOf(c));
                }
            }
        );

        add(celciusLbl);
        add(celciusTxt);
        add(fahrenheitLbl);
        add(fahrenheitTxt);
        add(btnCtoF);
        add(btnFtoC);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new TemperatureConverterApp();
    }
}
