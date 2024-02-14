package Assignment.Assignment2.Question2;

import java.util.Arrays;

public class GenerateRandomArray {
    public static void main(String[] args) {
        // Example input values
        int length = 10;
        int min = 20;
        int max = 100;

        // Generate random array
        int[] randomArray = generateRandomArray(length, min, max);

        // Print the generated array
        System.out.println(Arrays.toString(randomArray));
    }

    public static int[] generateRandomArray(int length, int min, int max) {
        int[] array = new int[length]; // array will hold random generated integers
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * (max - min)) + min; // Math.random is like a fraction between 0 and 1
            
        }
        return array;
    }
}
