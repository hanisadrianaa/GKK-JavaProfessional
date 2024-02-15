package Lesson7.Exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EncryptFile extends FileHandler {
    private static final int SHIFT_VALUE = 3; // You can adjust the shift value

    public EncryptFile(String sourceFile, String targetFile) {
        super(sourceFile, targetFile);
    }

    @Override
    public void processFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(super.getSourceFile()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(super.getTargetFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String encryptedLine = encryptLine(line);
                writer.write(encryptedLine);
                writer.newLine();
            }
        }
    }

    private String encryptLine(String line) {
        StringBuilder encryptedLine = new StringBuilder();
        for (char ch : line.toCharArray()) {
            if (Character.isLetter(ch)) {
                char shiftedChar = (char) (ch + SHIFT_VALUE);
                if (Character.isUpperCase(ch) && shiftedChar > 'Z') {
                    shiftedChar = (char) (shiftedChar - 26);
                } else if (Character.isLowerCase(ch) && shiftedChar > 'z') {
                    shiftedChar = (char) (shiftedChar - 26);
                }
                encryptedLine.append(shiftedChar);
            } else {
                encryptedLine.append(ch);
            }
        }
        return encryptedLine.toString();
    }
}
