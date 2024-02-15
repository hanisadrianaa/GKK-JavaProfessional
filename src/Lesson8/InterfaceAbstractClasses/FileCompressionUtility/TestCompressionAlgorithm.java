package Lesson8.InterfaceAbstractClasses.FileCompressionUtility;

import java.util.Scanner;

public class TestCompressionAlgorithm {
    public static void main(String[] args) throws Exception {
        String inputFile = "fileA.txt";
        String outputFile = "compressedFile.zip"; // adjust for different algorithms

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose compression algorithm (ZIP, GZIP, LZMA): ");
        String algorithmName = scanner.nextLine().toUpperCase();

        // choose the algorithm using a switch case
        CompressionAlgorithm algorithm;
        switch (algorithmName) {
            case "ZIP":
                algorithm = new ZipAlgorithm();
                outputFile += ".zip"; // adjust output filename
                break;
            case "GZIP":
                algorithm = new GZipAlgorithm();
                outputFile += ".gz";
                break;
            case "LZMA":
                algorithm = new LZMAAlgorithm(); // assuming implemented
                outputFile += ".lzma";
                break;
            default:
                scanner.close();
                throw new IllegalArgumentException("Invalid algorithm name: " + algorithmName);

        }

        // perform compression
        algorithm.compress(inputFile, outputFile);

        System.out.println("File compressed successfully using " + algorithmName + "!");
        scanner.close();
    }
}

// LZMAAlgorithm is assume implemented
// must have the Apache Commons Compress library