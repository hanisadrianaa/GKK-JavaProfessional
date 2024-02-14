package Lesson2.Loops;

import java.util.Scanner;

public class FlowStatement {

    public static void main(String[] args) {
        // store input, maximum value
        int a, b, c, m;

        // receive the three keyboard inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        a = scanner.nextInt();
        System.out.println("Enter number b: ");
        b = scanner.nextInt();
        System.out.println("Enter number c: ");
        c = scanner.nextInt();
        scanner.close();

        // determine maximum value among a, b, and c
        if (a <= b) {
            m = b;
        } else {
            m = a;
        }

        if (m <= c) {
            m = c;
        }

        // display the maximum value
        System.out.println("maximum = " + m);

    }
}
