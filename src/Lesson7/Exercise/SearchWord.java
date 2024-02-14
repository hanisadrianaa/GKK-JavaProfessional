package Lesson7.Exercise;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SearchWord extends FileHandler {
    public SearchWord(String fileA) {
        super(fileA);
    }

    public void searchWord() throws IOException {
        Scanner scanner = new Scanner(new File(super.getSourceFile()));
        Scanner input = new Scanner(System.in);

        System.out.print("Enter word to search: ");
        String word = input.nextLine();

        boolean found = false;
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(line.contains(word)) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.print("Word '" + word + "' found in file " + getSourceFile() + ".");
        } else {
            System.out.print("Word '" + word + "' not found in file " + getSourceFile() + ".");
        }

        scanner.close();
        input.close();

    }
    
}
