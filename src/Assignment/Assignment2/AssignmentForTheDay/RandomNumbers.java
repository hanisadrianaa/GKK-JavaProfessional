package Assignment.Assignment2.AssignmentForTheDay;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user input for maximum number of values, maximum value, minimum value
        // with error checking to ensure number positive and minimum less than maximum
        int maxValues;
        do {
            System.out.print("Enter maximum number of values: ");
            maxValues = scanner.nextInt();
            if (maxValues <= 0) {
                System.out.println("Error: Number of values must be positive.");
            }
        } while (maxValues <= 0);

        int maxValue;
        do {
            System.out.print("Enter maximum value: ");
            maxValue = scanner.nextInt();
            if (maxValue <= 0) {
                System.out.println("Error: Maximum value must be positive.");
            }
        } while (maxValue <= 0);

        int minValue;
        do {
            System.out.print("Enter minimum value (less than maximum): ");
            minValue = scanner.nextInt();
            if (minValue >= maxValue) {
                System.out.println("Error: Minimum value must be less than maximum value.");
            }
        } while (minValue >= maxValue);

        // generate random numbers and sort
        // array 'numbers' store random values
        // loop to generate random numbers within specified range
        // sort array in ascending order using Arrays.sort
        int[] numbers = new int[maxValues];
        Random random = new Random();
        for (int i = 0; i < maxValues; i++) {
            numbers[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }
        Arrays.sort(numbers);

        // calculate and display statistics
        double mean = calculateMean(numbers);
        int median = calculateMedian(numbers);
        int mode = calculateMode(numbers);

        System.out.println("\nSorted array:");
        System.out.println(Arrays.toString(numbers));

        System.out.printf("\nMean: %.2f\n", mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }

    // mean (average) = Σ(xᵢ) / n
    // Σ = sum of all elements
    // xᵢ = each element in array
    // n = total number of elements in array
    private static double calculateMean(int[] numbers) {
        double sum = 0; // initializes 'sum' to 0
        for (int num : numbers) {
            sum += num;
            // add value 'num' to 'sum' variable
        }
        return sum / numbers.length;
        // final value of 'sum' divided by total number of element in array
    }

    // median depends on length of array 'numbers'
    private static int calculateMedian(int[] numbers) {
        int length = numbers.length;
        if (length % 2 == 0) { // even length array (average of two middle elements)
            return (numbers[length / 2 - 1] + numbers[length / 2]) / 2;
        } else { // odd length array (the middle element)
            return numbers[length / 2];
        }
    }

    // mode = maximum value in 'frequencies' array
    private static int calculateMode(int[] numbers) {
        int[] frequencies = new int[numbers.length]; // create array 'frequencies' of size equal to input array
                                                     // store frequency of each unique value
        int maxFrequency = Integer.MIN_VALUE; // set 'maxFrequency' to minimum possible integer value (-2,147,483,648)
        int mode = 0; // to store value with highest frequency found so far

        for (int num : numbers) {
            frequencies[num - numbers[0]]++;
            if (frequencies[num - numbers[0]] > maxFrequency) {
                maxFrequency = frequencies[num - numbers[0]];
                mode = num;
            }
        }

        // Multiple modes if all frequencies are equal (all elements are the same)
        if (frequencies[0] == maxFrequency) {
            return mode;
        } else {
            return 0;
        }
    }
}