package Lesson7.Exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class CountWords extends FileHandler {
    public CountWords(String sourceFileName) {
        super(sourceFileName);
    }

    public int countWords() {
        int count = 0;
        try {
            ReadFile readFile = new ReadFile(super.getSourceFile());
            BufferedReader reader = readFile.readfileBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\s+");
                count += words.length;
            }
        } catch (IOException e) {
            System.err.println("Error in reading the file" + e.getMessage());
        }

        return count;
    }
}
