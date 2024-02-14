package Lesson7.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile extends FileHandler {
    public ReadFile(String sourceFileName) {
        super(sourceFileName);
    }

    public void printFile() {
        ReadFile readFile = new ReadFile(super.getSourceFile());
        try (BufferedReader reader = readFile.readfileBuffer()) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error in reading the file" + e.getMessage());
        }
    }

    public BufferedReader readfileBuffer(){
        BufferedReader reader = null;
        Path filePath = Paths.get(super.getSourceFile());
        try {
            reader = new BufferedReader(new FileReader(filePath.toString()));
        } catch (IOException e) {
            System.err.println("Error in reading the file" + e.getMessage());
        }
        return reader;
    }
}
