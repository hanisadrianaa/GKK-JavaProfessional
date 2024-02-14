package Lesson7.Exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to write to file: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the filename (including extension): ");
        String fileName = scanner.nextLine();

        try {
            PrintWriter writer = new PrintWriter(new File(fileName));
            writer.println(inputString);
            writer.close();
            System.out.println("Successfully wrote string to file: " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: Could not create file: " + fileName);
        }
    }
}
