package Lesson5.Exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) {
        String fileName = "exercise.txt";

        try {
            Scanner scanner = new Scanner(new File(fileName));

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch(FileNotFoundException e) {
            System.out.println("Eror: File not found.");
        }
    }
}
