package Lesson7.Exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DecryptFile extends FileHandler {
    private static final int SHIFT_VALUE = -3; // Use negative of encryption shift

    public DecryptFile(String sourceFile, String targetFile) {
        super(sourceFile, targetFile);
    }

    @Override
    public void processFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(getSourceFile()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(getTargetFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String decryptedLine = decryptLine(line);
                writer.write(decryptedLine);
                writer.newLine();
            }
        }
    }

    private String decryptLine(String line) {
        StringBuilder decryptedLine = new StringBuilder();
        for (char ch : line.toCharArray()) {
            if (Character.isLetter(ch)) {
                char shiftedChar = (char) (ch + SHIFT_VALUE);
                if (Character.isUpperCase(ch) && shiftedChar < 'A') {
                    shiftedChar = (char) (shiftedChar + 26);
                } else if (Character.isLowerCase(ch) && shiftedChar < 'a') {
                    shiftedChar = (char) (shiftedChar + 26);
                }
                decryptedLine.append(shiftedChar);
            } else {
                decryptedLine.append(ch);
            }
        }
        return decryptedLine.toString();
    }
}
