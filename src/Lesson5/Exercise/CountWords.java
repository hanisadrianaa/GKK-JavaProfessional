package Lesson5.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
    public static void main(String[] args) {
        String fileName = "exercise.txt";
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            System.out.println("Total words in the file: " + wordCount);
        } catch (IOException e) {
            System.out.println("Error: IOException occurred while reading file: " + fileName);
        }
    }
}
