package Lesson2.Expressions;

import java.util.Scanner;

public class ElvisOperator {
    public static void main(String[] args) {
        int intA = 12;
        int intB = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a int A number: ");
        intA = scanner.nextInt();
        System.out.println("Enter a int B number: ");
        intB = scanner.nextInt();

        scanner.close();

        // Output = 12
        int highest = (intA > intB) ? intA : intB;

        // If intA greater than 15, print 20
        // If intA less than 15, print 15
        // Output = 15
        int highest2 = (intA > intB) ? (intA < 15) ? 15 : 20 : intB;

        System.out.println(highest);
        System.out.println(highest2);
    }
}
