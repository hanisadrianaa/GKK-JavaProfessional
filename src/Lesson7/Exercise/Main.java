package Lesson7.Exercise;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static String sourcefilename = "example.txt";
    static String targetfilename = "exercise.txt";
    public static void main(String[] args) throws IOException {
        // Reading a text file
        ReadFile readFile = new ReadFile(sourcefilename);
        readFile.printFile(); // print content of file
        // End reading a text file

        // Counting words
        CountWords countWord = new CountWords(sourcefilename);
        countWord.countWords();
        System.out.println("Length of words: " + countWord);
        // End counting words

        // Write to file
        WriteFile writeFile = new WriteFile(sourcefilename);
        writeFile.write("Write some text \nWrite some more text");
        readFile.printFile();
        // End write to file

        // Copying files
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter name of the file to copy from: ");
        String sourceFileName1 = scanner1.nextLine();
        System.out.print("Enter name of the file to copy to: ");
        String targetFileName1 = scanner1.nextLine();

        CopyFile copy = new CopyFile(sourceFileName1, targetFileName1);
        copy.copyFile();  // Call the method directly
        System.out.println("Successfully copied content from " + sourceFileName1 + " to " + targetFileName1 + ".");
        scanner1.close();
        // End copying files

        // Appending to a file
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter name of the file to append: ");
        String sourceFileName2 = scanner2.nextLine();
        System.out.print("Enter string text to append: ");
        String str = scanner2.nextLine();
        
        AppendFile append = new AppendFile(sourceFileName2);
        append.appendFile(str);
        System.out.println("Sucessfully appended string to file.");
        scanner2.close();
        // End appending to a file

        // Searching for a word
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter name of the file to search word: ");
        String sourceFileName3 = scanner3.nextLine();
        SearchWord search = new SearchWord(sourceFileName3);
        search.searchWord();
        scanner3.close();
        // End searching for a word

        // Deleting a file
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Enter name of the file to delete: ");
        DeleteFile delete = new DeleteFile(sourceFileName3);
        delete.deleteFile();
        scanner4.close();
        // End deleting a file

        // File size
        SizeFile size = new SizeFile(sourcefilename);
        String filename = size.inputFile();
        long displaySize = size.fileSize(filename);
        System.out.println("File size: " + displaySize + " bytes");
        // End file size

        // File encryption
        EncryptFile encrypt = new EncryptFile(sourcefilename, targetfilename);
        try {
            encrypt.processFile();
            System.out.println("File encrypted successfully!");
        } catch (IOException e) {
            System.err.println("Error encrypting file: " + e.getMessage());
        }
        // End file encryption

        // File decryption
        DecryptFile decrypt = new DecryptFile(sourcefilename, targetfilename);
        try {
            decrypt.processFile();
            System.out.println("File decrypted successfully!");
        } catch (IOException e) {
            System.err.println("Error decrypting file: " + e.getMessage());
        }
        // End file decryption

        // Read http url
        HTTPReader httpUrl = new HTTPReader();
        httpUrl.printContent();
        // End read http url

        // Pattern match
        PatternMatchText patternMatch = new PatternMatchText();
        patternMatch.printMatch();
        // End pattern match

        // Read json
        ReadJson jsonToObject = new ReadJson();
        jsonToObject.mapToObject();
        // End read json
    }
}
