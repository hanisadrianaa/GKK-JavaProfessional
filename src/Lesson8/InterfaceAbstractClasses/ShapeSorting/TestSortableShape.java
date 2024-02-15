package Lesson8.InterfaceAbstractClasses.ShapeSorting;

public class TestSortableShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(4, 6);

        SortableShape[] shapes = {rectangle, circle, triangle};

        System.out.println("Unsorted shapes -");
        for (SortableShape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ": " + shape.area());
        }

        ShapeSorter.sort(shapes);

        System.out.println("\nSorted shapes by area -");
        for (SortableShape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ": " + shape.area());
        }
    }
}
