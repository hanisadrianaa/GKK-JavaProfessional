package Lesson7.Exercise;

public abstract class FileHandler {
    private String filea, fileb;

    public FileHandler(String sourceFileName, String targetFileName) {
        this.filea = sourceFileName;
        this.fileb = targetFileName;
    }

    public String getSourcefilename() {
        return filea;
    }

    public void setSourcefilename(String sourcefilename) {
        this.filea = sourcefilename;
    }

    public String getTargetfilename() {
        return fileb;
    }

    public void setTargetfilename(String targetfilename) {
        this.fileb = targetfilename;
    }
}
