package Lesson2.Operators;

public class Exercise2 {

    // function named 'distance'
    static void distance(float x1, float y1, float z1,
            float x2, float y2, float z2) {
        double d = Math.pow((Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2) +
                Math.pow(z2 - z1, 2) * 1.0), 0.5);

        System.out.println("Distance: " + d);
    }

    public static void main(String[] args) {
        float x1, y1, z1, x2, y2, z2;
        x1 = 2; y1 = 1; z1 = 3;
        x2 = 0; y2 = 0; z2 = 6;

        // call function 'distance' for calculation
        distance(x1, y1, z1, x2, y2, z2);
    }
}