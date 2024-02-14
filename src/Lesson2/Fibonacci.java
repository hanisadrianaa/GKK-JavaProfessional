package Lesson2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your start term: ");
        int f = scanner.nextInt();
        fibonacci(f);

        scanner.close();
    }

    static int fibonacci(int n) {
        int nextTerm = 0;
        int firstTerm = 0;
        int secondTerm = 1;

        for(int i=0; i<n+1; i++) {
            System.out.println(firstTerm + " ");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        return nextTerm;
    }
}
