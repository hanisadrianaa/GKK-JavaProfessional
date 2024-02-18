
package lesson9.gui.assignment_exercise.drawing_program;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import lesson9.gui.assignment_exercise.drawing_program.DrawPanel.ShapeType;

public class DrawingApp2 extends JFrame {
    private DrawPanel canvas;
    private JButton rectangleButton;

    public DrawingApp2() {
        setTitle("Drawing Program");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Create panels
        JPanel buttonPanel = new JPanel();
        canvas = new DrawPanel();

        // Create and configure button
        rectangleButton = new JButton("Rectangle");
        rectangleButton.addActionListener(e -> canvas.setCurrentShape(DrawPanel.ShapeType.RECTANGLE));
        buttonPanel.add(rectangleButton);

        // Add panels to frame
        add(buttonPanel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);

        setVisible(true);
    }
}
