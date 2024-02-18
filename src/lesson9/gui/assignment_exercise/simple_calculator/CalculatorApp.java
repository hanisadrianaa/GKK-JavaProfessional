package lesson9.gui.assignment_exercise.simple_calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 1. Simple Calculator
// Create a basic calculator with addition, substraction,
// multiplication and division functionality.

public class CalculatorApp extends JFrame {

    private JTextField display;
    private int result = 0; // store result calculation so far
    private String numberInStr = ""; // store number entered as String
    private char previousOpr = ' '; // store previous operator used in calculation
    private char currentOpr = ' '; // store current operator being used in calculation

    // constructor so setup UI component with event handler
    public CalculatorApp() {
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        display = new JTextField(10);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setEditable(false); // non editable
        display.setPreferredSize(new Dimension(display.getPreferredSize().width, 50)); // height of 50 pixels
        add(display, BorderLayout.NORTH); // add JTextField 'display' at top (NORTH) position

        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(4, 4)); // 4x4 grid layout

        // array of strings contain label for calculator button
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        // repeat over buttonLabels array to create and add JButton component
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            panelButtons.add(button);
            button.addActionListener(new ButtonListener());
        }

        add(panelButtons, BorderLayout.CENTER);
        setSize(350, 350);
        setVisible(true);
    }

    // handle button click events
    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand(); // get action command associate with button click event

            // number button click
            if (Character.isDigit(command.charAt(0))) {
                // check if button click is a number button (0-9)
                numberInStr += command;
                display.setText(numberInStr);
            } else { // operator button click
                // handle case when operator (+,-,*,/) button or 'C' is press
                previousOpr = currentOpr; // update previous operator with current operator
                currentOpr = command.charAt(0); // update current operator with operator button click

                // perform calculation when '=' is press
                if (currentOpr == '=') {
                    calculate();
                } else if (currentOpr == 'C') { // clear the display and reset value when 'C' is press
                    result = 0;
                    numberInStr = "";
                    previousOpr = ' ';
                    currentOpr = ' ';
                    display.setText("");
                } else {
                    // handle case when operator button is click to perform the calculation
                    if(!numberInStr.isEmpty()) {
                        calculate();
                        previousOpr = currentOpr;
                        currentOpr = command.charAt(0);
                        numberInStr = "";
                    }
                }
            }
        }
    }

    // calculate result based on previous operator
    private void calculate() {
        int number = Integer.parseInt(numberInStr); // parse String(numberInStr) into integer(number)
        switch (previousOpr) {
            case '+':
                result += number;
                break;
            case '-':
                result -= number;
                break;
            case '*':
                result *= number;
                break;
            case '/':
                result /= number;
                break;
            default:
                result = number;
                break;
        }
        display.setText(Integer.toString(result)); // update JTextField 'display' with result of calculation
        numberInStr = ""; // reset to empty string after calculation
    }

    public static void main(String[] args) {
        new CalculatorApp();
    }
}
