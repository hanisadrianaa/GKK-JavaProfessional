package Lesson2.Expressions;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x number: ");
        x = scanner.nextInt();
        System.out.println("Enter y number: ");
        y = scanner.nextInt();
        scanner.close();

        if(x!=y) {
            System.out.println("1");
        } if(x>y) {
            System.out.println("2");
        } if(x%y == 0) {
            System.out.println("3");
        }
    }
}
