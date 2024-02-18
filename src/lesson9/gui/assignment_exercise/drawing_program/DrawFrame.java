package lesson9.gui.assignment_exercise.drawing_program;

import javax.swing.*;

import lesson9.gui.assignment_exercise.drawing_program.DrawPanel.ShapeType;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawFrame extends JFrame {
    private DrawPanel drawPanel;

    public DrawFrame() {
        setTitle("Drawing Program");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        drawPanel = new DrawPanel();
        add(drawPanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        JButton lineButton = new JButton("Line");
        JButton rectangleButton = new JButton("Rectangle");
        JButton circleButton = new JButton("Circle");

        lineButton.addActionListener(e -> drawPanel.setCurrentShape(ShapeType.LINE));
        rectangleButton.addActionListener(e -> drawPanel.setCurrentShape(ShapeType.RECTANGLE));
        circleButton.addActionListener(e -> drawPanel.setCurrentShape(ShapeType.CIRCLE));

        controlPanel.add(lineButton);
        controlPanel.add(rectangleButton);
        controlPanel.add(circleButton);

        add(controlPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DrawFrame frame = new DrawFrame();
            frame.setVisible(true);
        });
    }
}

class DrawPanel extends JPanel {
    private ShapeType currentShape;
    private Point startPoint;
    private Point endPoint;

    public DrawPanel() {
        currentShape = ShapeType.LINE;
        setPreferredSize(new Dimension(800, 500));
        setBackground(Color.WHITE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startPoint = e.getPoint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                endPoint = e.getPoint();
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (startPoint != null && endPoint != null) {
            switch (currentShape) {
                case LINE:
                    g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
                    break;
                case RECTANGLE:
                    int x = Math.min(startPoint.x, endPoint.x);
                    int y = Math.min(startPoint.y, endPoint.y);
                    int width = Math.abs(startPoint.x - endPoint.x);
                    int height = Math.abs(startPoint.y - endPoint.y);
                    g.drawRect(x, y, width, height);
                    break;
                case CIRCLE:
                    x = Math.min(startPoint.x, endPoint.x);
                    y = Math.min(startPoint.y, endPoint.y);
                    width = Math.abs(startPoint.x - endPoint.x);
                    height = Math.abs(startPoint.y - endPoint.y);
                    g.drawOval(x, y, width, height);
                    break;
            }
        }
    }

    public void setCurrentShape(ShapeType shape) {
        currentShape = shape;
    }

    enum ShapeType {
        LINE, RECTANGLE, CIRCLE
    }
}

