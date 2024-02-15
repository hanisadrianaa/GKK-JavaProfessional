package Lesson8.ShapeSorting;

class Circle implements SortableShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double calculatedArea = Math.PI * radius * radius;
        return Double.parseDouble(String.format("%.2f", calculatedArea));
    }
}
