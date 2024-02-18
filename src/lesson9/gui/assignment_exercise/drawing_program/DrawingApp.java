package lesson9.gui.assignment_exercise.drawing_program;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DrawingApp extends JFrame {
    
    private JPanel canvas;
    private int lastX, lastY;

    public DrawingApp() {
        setTitle("Drawing");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        canvas = new JPanel() {
            // canvas override paintComponent(Graphics g) method
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); // draw start here
            }
        };

        canvas.setBackground(Color.WHITE);

        canvas.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                // will store mouse press coordinate
                lastX = e.getX();
                lastY = e.getY();
            }
        });

        canvas.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                Graphics g = canvas.getGraphics();
                // draw line from previous mouse position
                g.drawLine(lastX, lastY, e.getX(), e.getY());
                lastX = e.getX(); // update new lastX mouse position
                lastY = e.getY(); // update new lastY mouse position
            }
        });

        add(canvas);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DrawingApp app = new DrawingApp();
            app.setVisible(true);
        });
    }
}
