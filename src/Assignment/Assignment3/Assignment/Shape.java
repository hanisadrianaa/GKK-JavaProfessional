package Assignment.Assignment3.Assignment;

public abstract class Shape {
    public abstract double calculateArea();

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.6, 3.2);
        Circle circle = new Circle(3);

        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Circle area: " + circle.calculateArea());
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double area = length * width;
        return Math.round(area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        return Math.round(area);
    }
}
