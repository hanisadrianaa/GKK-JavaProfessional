package Lesson7.Exercise;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SizeFile extends FileHandler {

    public SizeFile(String fileA) {
        super(fileA);
    }

    // method to display size of a text file
    public long fileSize(String filename) throws IOException {
        File file = new File(super.getSourceFile());
        return file.length();
    }

    // user input
    public String inputFile() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename = input.nextLine();
        input.close();
        return filename;
    }
}
