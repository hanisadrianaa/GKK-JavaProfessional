package Lesson7.Exercise;

import java.io.IOException;

public abstract class FileHandler {
    private String sourceFile, targetFile;

    public FileHandler(String fileA) {
        this.sourceFile = fileA;
    }

    public FileHandler(String fileA, String fileB) {
        this.sourceFile = fileA;
        this.targetFile = fileB;
    }
    
    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    public String getTargetFile() {
        return targetFile;
    }

    public void setTargetFile(String targetFile) {
        this.targetFile = targetFile;
    }

    public abstract void processFile() throws IOException;
}
