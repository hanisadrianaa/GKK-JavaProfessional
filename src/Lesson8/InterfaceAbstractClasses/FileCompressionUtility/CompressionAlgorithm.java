package Lesson8.InterfaceAbstractClasses.FileCompressionUtility;

public abstract class CompressionAlgorithm {
    public abstract void compress(String inputFile, String outputFile) throws Exception;
}
