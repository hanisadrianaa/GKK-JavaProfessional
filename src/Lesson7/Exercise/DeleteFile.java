package Lesson7.Exercise;

import java.io.File;
import java.io.IOException;

public class DeleteFile extends FileHandler {

    public DeleteFile(String fileA) {
        super(fileA);
    }

    public void deleteFile() throws IOException {
        File file = new File(super.getSourceFile());
        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                System.out.println("File '" + getSourceFile() + "' deleted successfully.");
            } else {
                System.out.println("Error! Could not delete file '" + getSourceFile() + "'");
            }

        } else {
            System.out.println("Error! File '" + getSourceFile() + "' not found.");
        }
    }

    @Override
    public void processFile() throws IOException {
    }
}
