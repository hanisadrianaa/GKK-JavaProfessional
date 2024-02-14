package Lesson2.Loops;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, n, nFact;

        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        
        i = 1;
        nFact = 1;

        while(i <= n) {
            nFact  *= i;
            i++;
        }

        System.out.println("n! = " + nFact);
        
        scanner.close();
    }
}
