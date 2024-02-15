package Lesson7.Exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile extends FileHandler {
    public AppendFile(String fileA) {
        super(fileA);
    }

    public void appendFile(String str) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(super.getSourceFile(), true));
        writer.write(str);
        writer.newLine();
        writer.close();
        System.out.println("String appended to file successfully.");
    }

    
}
