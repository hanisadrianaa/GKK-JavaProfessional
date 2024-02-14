package Lesson7.Exercise;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static String sourcefilename = "example.txt";
    static String targetfilename = "exercise.txt";
    public static void main(String[] args) throws IOException {
        // Read file
        // ReadTextFile readFile = new ReadTextFile(filename);
        // readFile.printFile(); // print content of file

        // Count words
        // CountWords countWord = new CountWords(filename);

        // Copy files
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of the file to copy from: ");
        String sourceFileName = scanner.nextLine();

        System.out.print("Enter name of the file to copy to: ");
        String targetFileName = scanner.nextLine();

        // Create CopyFiles object and perform the copy
        CopyFiles copy = new CopyFiles(sourceFileName, targetFileName);
        copy.copyFile();  // Call the method directly
        System.out.println("Successfully copied content from " + sourceFileName + " to " + targetFileName);
        scanner.close();
    }
}
