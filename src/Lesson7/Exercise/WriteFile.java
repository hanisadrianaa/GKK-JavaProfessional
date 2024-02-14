package Lesson7.Exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile extends FileHandler {

    public WriteFile(String fileName) {
        super(fileName);
    }

    public String write(String input) {
        String response = "";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(super.getSourceFile()))) {
            writer.write(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }


}
