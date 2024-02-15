package Lesson8.ShapeSorting;

public class ShapeSorter {
    public static void sort(SortableShape[] shapes) {
        // use selection sort
        for (int i = 0; i < shapes.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < shapes.length; j++) {
                if (shapes[j].area() < shapes[minIndex].area()) {
                    minIndex = j;
                }
            }
            SortableShape temp = shapes[i];
            shapes[i] = shapes[minIndex];
            shapes[minIndex] = temp;
        }
    }
}
